package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random cube = new Random();
        int randomNumber;
        int userNumber;

        do {
            randomNumber = cube.nextInt(6) + 1;
            System.out.print("Podaj liczbe: ");
            userNumber = cube.nextInt(6) + 1;

            if (randomNumber == userNumber) {
                System.out.println("Bingo!!!");
                break;
            } else {
                System.out.println("Zle. Wylosowana liczba to: " + randomNumber);
            }
        } while (true);
    }
}
