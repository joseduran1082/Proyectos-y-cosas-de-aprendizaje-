from qdrant_client import QdrantClient
from qdrant_client.models import Distance, VectorParams, PointStruct

# Modo en memoria (para pruebas rápidas, se borra al cerrar)
client = QdrantClient(":memory:")

# Si quisieras guardarlo en disco, usarías: client = QdrantClient(path="./mi_base_datos")
print("Cliente Qdrant iniciado correctamente.")

from qdrant_client import QdrantClient
from qdrant_client.models import Distance, VectorParams, PointStruct

# --- AQUÍ ESTÁ EL CAMBIO PRINCIPAL ---
# Reemplaza con TUS datos reales de la web de Qdrant
# IMPORTANTE: Mantén las comillas ""
URL = "https://7604d58b-825e-4982-beff-9de765efa58c.us-east4-0.gcp.cloud.qdrant.io" 
KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2Nlc3MiOiJtIn0.z0gXANWmAm1GcdjKeEeTCk1QfbEadru1MaklnxoT0a0"
COLECCION = "mis_peliculas_web"

print("Conectando...")
client = QdrantClient(url=URL, api_key=KEY)

if not client.collection_exists(COLECCION):
    client.create_collection(
        collection_name=COLECCION,
        vectors_config=VectorParams(size=4, distance=Distance.COSINE),
    )
    print("Colección creada.")
else:
    print("La colección ya existe.")

# 4. SUBIR DATOS (Upsert sí funcionaba, así que lo dejamos igual)
print("Subiendo datos...")
client.upsert(
    collection_name=COLECCION,
    points=[
        PointStruct(id=1, vector=[0.9, 0.0, 0.2, 0.9], payload={"titulo": "Guardianes de la Galaxia"}),
        PointStruct(id=2, vector=[0.05, 0.9, 0.8, 0.0], payload={"titulo": "Notting Hill"})
    ]
)

# ... (todo lo anterior de conexión y subida de datos igual) ...

# 5. BÚSQUEDA CORRECTA
print("\n--- BUSCANDO ---")
vector_busqueda = [1.0, 0.0, 0.0, 1.0]

try:
    # CAMBIO CLAVE: Usamos .query_points() en lugar de .query()
    # Esto le dice: "Toma estos números y busca, no intentes convertir nada".
    respuesta = client.query_points(
        collection_name=COLECCION,
        query=vector_busqueda, 
        limit=1
    )
    
    # IMPORTANTE: query_points devuelve un objeto con una lista dentro llamada 'points'
    resultado = respuesta.points[0] 
    
    print(f"¡ÉXITO! Película encontrada: {resultado.payload['titulo']}")
    print(f"Score: {resultado.score}")

except Exception as e:
    print(f"Error: {e}")
    # Si falla, imprimimos qué devolvió para ver su estructura
    try:
        print(f"Contenido respuesta: {respuesta}")
    except:
        pass