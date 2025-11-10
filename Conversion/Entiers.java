// Raphaël Desjardins
// 2025-11-10
package Conversion;

import java.util.Scanner;

public class Entiers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre;

        do {
            System.out.print("Entrez un nombre entre 0 et 1023 : ");
            nombre = sc.nextInt();
        } while (nombre < 0 || nombre > 1023);

        StringBuilder Binaire = new StringBuilder();
        int number = nombre;

        do {
            Binaire.insert(0, number % 2);
            number /= 2;
        } while (number > 0);

        System.out.println("Le nombre " + nombre + " en base 2 est : " + Binaire.toString());
        String binaryInput;
        boolean valid;

        do {
            System.out.print("\nEntrez un nombre binaire (1 à 10 chiffres, ex: 1, 010, 1011, etc.) : ");
            binaryInput = sc.next();
            valid = binaryInput.matches("[01]{1,10}");
            if (!valid) {
                System.out.println("Erreur : vous devez entrer entre 1 et 10 chiffres binaires (0 ou 1).");
            }
        } while (!valid);

        int decimalFromBinary = Integer.parseInt(binaryInput, 2);
        System.out.println("Le nombre binaire " + binaryInput + " correspond à " + decimalFromBinary + " en base 10.");

        sc.close();
    }
}
