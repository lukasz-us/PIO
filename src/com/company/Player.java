package com.company;

import java.util.Random;

public class Player {
    private Random random = new Random();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int guess() {
        return random.nextInt(6) + 1;
    }
}
