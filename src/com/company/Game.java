package com.company;

import java.util.Random;

public class Game {

    private Player player=new PlayerComp("Adam");
    private Random cube = new Random();
    private int randomNumber;
    private int userNumber;

    void add(Player player) {
        this.player = player;
    }

    void play(){
        if (player == null) {
            throw new IllegalArgumentException("Nie podano gracza");
        }

        try {
            do {
                userNumber = player.guess();
                System.out.println("Strzal gracza " + player.getName() + " to " + userNumber);

                randomNumber = cube.nextInt(6) + 1;
                System.out.println("Wylosowano: " + randomNumber);

                if (randomNumber == userNumber) {
                    System.out.println("Bingo!!!");
                    break;
                } else {
                    System.out.println("Zle :(");
                }

            } while (true);

        } catch (IllegalArgumentException e) {
            System.err.println("Blad: " + e.getMessage());
        }
    }
}
