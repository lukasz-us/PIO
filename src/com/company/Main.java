package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random cube = new Random();
        int randomNumber;
        int userNumber;

        Player player = new Player();
        player.setName("Ziutek");
        do {
            randomNumber = cube.nextInt(6) + 1;
            System.out.println("Wylosowano: " + randomNumber);
            userNumber = player.guess();
            System.out.println("Strzal gracza " + player.getName() + " to " + userNumber);

            if (randomNumber == userNumber) {
                System.out.println("Bingo!!!");
                break;
            } else {
                System.out.println("Zle :(");
            }

        } while (true);
    }
}