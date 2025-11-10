package Conversion;

import java.util.Scanner;

public class Entiers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNumber;

        do {
            System.out.print("Entrez un nombre entre 0 et 1023 : ");
            decimalNumber = sc.nextInt();
        } while (decimalNumber < 0 || decimalNumber > 1023);

        StringBuilder binaryNumber = new StringBuilder();
        int number = decimalNumber;

        do {
            binaryNumber.insert(0, number % 2);
            number /= 2;
        } while (number > 0);

        System.out.println("Le nombre " + decimalNumber + " en base 2 est : " + binaryNumber.toString());

        sc.close();
    }
}
