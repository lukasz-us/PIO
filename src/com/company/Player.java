package com.company;

import java.util.Random;

public class Player {
    private Random random = new Random();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nie podano imienia");
        }
    }

    public int guess() {
        return random.nextInt(6) + 1;
    }
}
