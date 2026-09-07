from qdrant_client import QdrantClient

# 1. CONEXIÓN
URL = "https://7604d58b-825e-4982-beff-9de765efa58c.us-east4-0.gcp.cloud.qdrant.io" 
KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2Nlc3MiOiJtIn0.z0gXANWmAm1GcdjKeEeTCk1QfbEadru1MaklnxoT0a0"                                        # <--- TU KEY
client = QdrantClient(url=URL, api_key=KEY)

coleccion_ia = "demo_ia_automatica"

# 2. AÑADIR DATOS (TEXTO REAL)
# Fíjate: usamos el método .add() en lugar de upsert.
# Este método descarga un modelo de IA mini y convierte el texto a números él solo.
print("Convirtiendo texto a vectores (esto tardará un poco la primera vez)...")

docs = [
    "La inteligencia artificial está cambiando el mundo de la tecnología.",
    "Una receta deliciosa de tarta de manzana con canela.",
    "El perro corría feliz por el parque persiguiendo su pelota.",
    "Los últimos avances en coches eléctricos son impresionantes.",
    "Batman es un superhéroe que protege la ciudad de Gotham."
]

client.add(
    collection_name=coleccion_ia,
    documents=docs,
    metadata=[{"fuente": "frase ejemplo"} for _ in docs] # Datos extra opcionales
)
print("¡Datos guardados como vectores!")

# 3. BÚSQUEDA INTELIGENTE
# Ahora podemos preguntar en lenguaje natural
pregunta = "Quiero saber algo sobre comida dulce"

print(f"\nPregunta: '{pregunta}'")
print("--- Buscando significado... ---")

resultados = client.query(
    collection_name=coleccion_ia,
    query_text=pregunta, # ¡Aquí sí usamos texto!
    limit=1
)

for r in resultados:
    print(f"Encontrado: {r.document}")
    print(f"Score: {r.score}")