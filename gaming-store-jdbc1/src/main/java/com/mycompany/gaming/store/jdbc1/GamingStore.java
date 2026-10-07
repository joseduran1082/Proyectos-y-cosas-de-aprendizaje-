/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gaming.store.jdbc1;

/**
 *
 * @author Jose
 */
import java.sql.*;
import java.util.Scanner;


public class  GamingStore{

    private static final String URL  = "jdbc:mysql://localhost:3306/gaming_store";
    private static final String USER = "root";
    private static final String PASS = "1234";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Scanner sc = new Scanner(System.in)) {

            System.out.println("Conectado a la base de datos ✔");
            int opcion;
            do {
                System.out.println("\n=== GAMING STORE ===");
                System.out.println("1. Listar productos");
                System.out.println("2. Añadir producto");
                System.out.println("3. Actualizar stock");
                System.out.println("4. Borrar producto");
                System.out.println("0. Salir");
                System.out.print("Opción: ");
                opcion = leerEntero(sc);

                switch (opcion) {
                    case 1 -> listar(con);
                    case 2 -> crear(con, sc);
                    case 3 -> actualizarStock(con, sc);
                    case 4 -> borrar(con, sc);
                    case 0 -> System.out.println("¡Hasta luego!");
                    default -> System.out.println("Opción no válida");
                }
            } while (opcion != 0);

        } catch (SQLException e) {
            System.err.println("Error de base de datos: " + e.getMessage());
        }
    }


    private static void listar(Connection con) throws SQLException {
        String sql = "SELECT id, nombre, categoria, precio, stock FROM productos ORDER BY id";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            System.out.printf("%-4s %-28s %-16s %9s %6s%n", "ID", "Nombre", "Categoría", "Precio", "Stock");
            while (rs.next()) {
                System.out.printf("%-4d %-28s %-16s %8.2f€ %6d%n",
                        rs.getInt("id"), rs.getString("nombre"), rs.getString("categoria"),
                        rs.getDouble("precio"), rs.getInt("stock"));
            }
        }
    }

    private static void crear(Connection con, Scanner sc) throws SQLException {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Categoría: ");
        String categoria = sc.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Stock: ");
        int stock = leerEntero(sc);

        String sql = "INSERT INTO productos (nombre, categoria, precio, stock) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, categoria);
            ps.setDouble(3, precio);
            ps.setInt(4, stock);
            ps.executeUpdate();
            System.out.println("Producto añadido ✔");
        }
    }

    private static void actualizarStock(Connection con, Scanner sc) throws SQLException {
        System.out.print("ID del producto: ");
        int id = leerEntero(sc);
        System.out.print("Nuevo stock: ");
        int stock = leerEntero(sc);

        String sql = "UPDATE productos SET stock = ? WHERE id = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, stock);
            ps.setInt(2, id);
            int filas = ps.executeUpdate();
            System.out.println(filas > 0 ? "Stock actualizado ✔" : "No existe ese ID");
        }
    }

    private static void borrar(Connection con, Scanner sc) throws SQLException {
        System.out.print("ID del producto a borrar: ");
        int id = leerEntero(sc);

        String sql = "DELETE FROM productos WHERE id = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            System.out.println(filas > 0 ? "Producto borrado ✔" : "No existe ese ID");
        }
    }

    private static int leerEntero(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Introduce un número válido: ");
            }
        }
    }
}