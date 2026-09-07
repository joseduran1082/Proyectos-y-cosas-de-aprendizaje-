import qdrant_client
from qdrant_client import QdrantClient

print("--- INFORME DE LA LIBRERÍA ---")

# 1. Intentar ver la versión
try:
    print(f"Versión instalada: {qdrant_client.__version__}")
except:
    print("Versión: No se encuentra (Esto es mala señal)")

# 2. Ver qué comandos tiene el cliente
client = QdrantClient(":memory:")
comandos = dir(client)

print("\n--- COMANDOS DISPONIBLES ---")
# Filtramos solo los que no empiezan por _ para que sea legible
comandos_limpios = [c for c in comandos if not c.startswith("_")]
print(comandos_limpios)

print("\n--- ¿ESTÁ SEARCH? ---")
if "search" in comandos:
    print("SÍ está search.")
elif "search_points" in comandos:
    print("NO está search, pero está search_points (versión antigua).")
else:
    print("NO está ninguno. Es una versión muy extraña.")