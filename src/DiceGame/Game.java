package DiceGame;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Game {

    private Map<String, Integer> stats = new HashMap();
    private Random cube = new Random();
    private List<Player> players = new ArrayList();

    void printStats(){
        System.out.println();
        stats.forEach((name,points)->System.out.println(name + ": " + points));
    }

    void add(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("Nie podano gracza");
        }
        for (Player player1 : players) {
            if (player1.getName().equals(player.getName())) {
                player.setName(player.getName() + "2");
            }
        }
        stats.put(player.getName(),0);

        players.add(player);
    }

    void play() {
        if (players.isEmpty()) {
            throw new IllegalArgumentException("Nie podano zadnego gracza");
        }

        try {
            int randomNumber;
            boolean bingo = false;

            do {
                randomNumber = cube.nextInt(6) + 1;

                for (Player player1 : players) {
                    if (player1.guess() == randomNumber) {
                        System.out.println("Gracz " + player1.getName() + " trafil!");
                        bingo = true;

                        stats.put(player1.getName(), stats.get(player1.getName()) + 1);
                    }
                }
                if (bingo) {
                    System.out.println("Wylosowana liczba to: " + randomNumber);
                }

            } while (!bingo);

        } catch (IllegalArgumentException e) {
            System.err.println("Blad: " + e.getMessage());
        }
    }
}
