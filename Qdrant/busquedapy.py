import qdrant_client
import os

print("\n--- INVESTIGACIÓN ---")
try:
    # Esto nos dirá dónde está el archivo fisicamente
    ruta = qdrant_client.__file__
    print(f"El archivo impostor está en: {ruta}")
    
    # Esto nos dirá qué hay en esa carpeta
    carpeta = os.path.dirname(ruta)
    print(f"Carpeta contenedora: {carpeta}")
except Exception as e:
    print(f"Error al buscar la ruta: {e}")
    print("Esto significa que la librería está instalada pero vacía/corrupta.")