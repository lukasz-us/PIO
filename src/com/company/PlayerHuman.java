package com.company;

import java.util.Scanner;

public class PlayerHuman extends Player {

    private Scanner getNumber = new Scanner(System.in);

    public PlayerHuman() {
    }

    public PlayerHuman(String name) {
        super(name);
    }

    @Override
    public int guess() {
        System.out.print("Podaj liczbe: ");

        return getNumber.nextInt();
    }
}