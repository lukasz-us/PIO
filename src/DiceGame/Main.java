package DiceGame;

public class Main {

    public static void main(String[] args) {

        Player player = new PlayerComp("Ewa");

        Game game = new Game();
        game.add(player);
        game.add(new PlayerComp("Andrzej"));
        game.add(new PlayerComp("Waldek"));
        game.add(new PlayerComp("Waldek"));
        game.add(new PlayerComp("Waldek"));

        game.play();
        game.play();
        game.play();
        game.play();
        game.printStats();
    }
}