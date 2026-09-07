from qdrant_client import QdrantClient
import qdrant_client

# 1. Ver qué versión tienes realmente
print(f"Versión instalada de Qdrant Client: {qdrant_client.__version__}")

# 2. Conectar (No necesitamos credenciales reales para ver las funciones)
client = QdrantClient(":memory:")

# 3. Imprimir qué funciones tiene disponibles el cliente
print("\n--- Funciones disponibles en 'client' ---")
todas_las_funciones = dir(client)

# Buscamos si existe 'search' o algo parecido
funciones_busqueda = [f for f in todas_las_funciones if "search" in f or "query" in f]
print(f"Funciones de búsqueda encontradas: {funciones_busqueda}")

if "search" in todas_las_funciones:
    print("\n>>> ¡La función .search() EXISTE! Debería funcionar.")
else:
    print("\n>>> ALERTA: La función .search() NO existe. Tu versión es antigua o corrupta.")