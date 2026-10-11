package com.andreeaanghel.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user;
        boolean areSpatii;
        boolean contineCifra;
        boolean lungimeInvalida;

        do {
            System.out.print("Introdu un username: ");
            user = scanner.nextLine();
            areSpatii = false;
            contineCifra = false;
            lungimeInvalida = false;
            char[] cifre = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

            if ((user.length() < 6 || user.length() > 12)) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                lungimeInvalida = true;
            }

            for (int i = 0; i < user.length(); i++) {
                char litera = user.charAt(i);
                if (litera == ' ') {
                    System.out.println("Eroare: Username-ul nu poate sa contina spatii.");
                    areSpatii = true;
                    break;
                }

                for (char c : cifre) {
                    if (c == litera) {
                        contineCifra = true;
                        break;
                    }
                }
                }
            if (!contineCifra){
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
            }
        } while (lungimeInvalida || areSpatii || !contineCifra);
        System.out.println("Username acceptat: " + user);
        scanner.close();
    }
}