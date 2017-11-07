package com.company;

import java.util.Random;

public abstract class Player {

    private String name = "Antoni";

    public Player() {
    }

    public Player(String name) {
        setName(name);
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nie podano imienia");
        }
    }

    public abstract int guess();
}