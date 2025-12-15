

import java.util.Scanner;

public class Idk {

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

        System.out.println("Le nombre " + nombre + " en base 2 est : " + Binaire);

        String binaryInput;
        boolean valid;

        do {
            System.out.print("\nEntrez un nombre binaire (1 à 10 chiffres) : ");
            binaryInput = sc.next();
            valid = binaryInput.matches("[01]{1,10}");
            if (!valid) {
                System.out.println("Erreur : seulement des 0 et 1 (1 à 10 chiffres).");
            }
        } while (!valid);

        int decimalFromBinary = 0;
        for (int i = 0; i < binaryInput.length(); i++) {
            decimalFromBinary = decimalFromBinary * 2 + (binaryInput.charAt(i) - '0');
        }

        System.out.println("En base 10 : " + decimalFromBinary);

        StringBuilder complement1 = new StringBuilder();
        for (int i = 0; i < binaryInput.length(); i++) {
            complement1.append(binaryInput.charAt(i) == '0' ? '1' : '0');
        }

        StringBuilder complement2 = new StringBuilder(complement1);
        int retenue = 1;

        for (int i = complement2.length() - 1; i >= 0; i--) {
            if (complement2.charAt(i) == '1' && retenue == 1) {
                complement2.setCharAt(i, '0');
            } else if (retenue == 1) {
                complement2.setCharAt(i, '1');
                retenue = 0;
            }
        }

        System.out.println("Complément à 1 : " + complement1);
        System.out.println("Complément à 2 : " + complement2);

        sc.close();
    }
}
