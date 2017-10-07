package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random cube = new Random();
        Scanner odczyt = new Scanner(System.in);
        int randomNumber;
        int userNumber;

        do {
            randomNumber = cube.nextInt(6) + 1;
            System.out.print("Podaj liczbe: ");
            userNumber = odczyt.nextInt();

            if (randomNumber == userNumber) {
                System.out.println("Bingo!!!");
                break;
            } else {
                System.out.println("Zle. Wylosowana liczba to: " + randomNumber);
            }
        } while (true);
    }
}
