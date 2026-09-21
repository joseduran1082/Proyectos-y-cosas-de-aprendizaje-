package cat.copernic.m03.RA3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 *
 * @author Jose
 */
public class ActivitatEduard {


    public static void main(String[] args) {
        // Obté la data i l'hora actuals
        LocalDateTime now = LocalDateTime.now();

        // Dóna format a la data i hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Escriu la data i hora a la consola
        System.out.println("Data i hora actuals: " + formattedDateTime);

        Scanner scanner = new Scanner(System.in);

        // Obté el nom
        System.out.print("Escriu el teu nom: ");
        String name = scanner.nextLine();

        System.out.print("Escriu els teus cognoms: ");
        String familyName = scanner.nextLine();

        System.out.println("El teu nom complet és: " + name + " " + familyName);
        
        int edat = 18;
        // substitueix text pel teu nom 
        String nom = "Jose Duran"; 
        System.out.printf("Tinc %d anys", nom);

    }
}


