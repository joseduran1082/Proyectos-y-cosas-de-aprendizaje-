import qdrant_client

print("Si ves esto, la importación funcionó.")
# Esto es lo que fallaba antes
try:
    print(f"VERSIÓN INSTALADA: {qdrant_client.__version__}")
    
    # Verificamos si el cliente tiene 'search'
    from qdrant_client import QdrantClient
    client = QdrantClient(":memory:")
    if hasattr(client, 'search'):
        print("¡ÉXITO TOTAL! La función .search() existe.")
    else:
        print("Sigue faltando search... pero al menos tenemos versión.")
        
except AttributeError:
    print("¡Maldición! Sigue sin detectar la versión.")