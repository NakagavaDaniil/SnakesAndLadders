package game;

public class Board {
    private Dice dice1D6 = new Dice();
    private Player player = new Player();

    public int makeTurn() {
        return player.move(dice1D6.roll());
    }
}
