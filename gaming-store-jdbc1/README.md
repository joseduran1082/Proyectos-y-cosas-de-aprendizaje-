# 🎮 Gaming Store — CRUD con JDBC y MySQL

Aplicación de consola en **Java** que se conecta a una base de datos **MySQL** mediante **JDBC** y permite gestionar el inventario de una tienda gaming (crear, listar, actualizar y borrar productos).

Proyecto de aprendizaje del ciclo **DAM** (Desarrollo de Aplicaciones Multiplataforma).

## ✨ Qué incluye

- Operaciones **CRUD** completas
- Uso de `PreparedStatement` (evita inyección SQL)
- `try-with-resources` para cerrar conexiones correctamente
- **Trigger** en MySQL que registra cada cambio de stock en la tabla `log_stock`
- Validación básica de la entrada del usuario

## 🛠️ Tecnologías

Java 17+ · MySQL 8 · JDBC (MySQL Connector/J)

## 📁 Estructura

```
gaming-store-jdbc/
├── schema.sql      # Base de datos, tablas, trigger y datos de ejemplo
├── src/Main.java   # Aplicación con menú por consola
└── README.md
```

## 🚀 Cómo ejecutarlo

1. Importa la base de datos:
   ```bash
   mysql -u root -p < schema.sql
   ```
2. Descarga [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/) y añade el `.jar` al proyecto
   (en NetBeans/IntelliJ: *Libraries → Add JAR*).
3. Edita `URL`, `USER` y `PASS` en `src/Main.java`.
4. Ejecuta `Main.java`.

Desde terminal:
```bash
javac -cp ".:mysql-connector-j.jar" src/Main.java -d out
java  -cp "out:mysql-connector-j.jar" Main
```
(En Windows usa `;` en lugar de `:`).

## 🔍 Ver el trigger en acción

Actualiza el stock desde el menú y consulta el registro:
```sql
SELECT * FROM log_stock;
```

## 📌 Posibles mejoras

- Buscar productos por nombre o categoría
- Interfaz gráfica con JavaFX
- Patrón DAO para separar la lógica de acceso a datos

## 👤 Autor

**José Sebastián Durán Mendoza** — Estudiante DAM · Técnico SMR
📫 joseduranmendoza6@gmail.com · 🌐 [Portafolio](https://portafoliojsduran-909386-f7789.web.app/)
