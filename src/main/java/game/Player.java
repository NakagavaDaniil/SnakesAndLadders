package game;

public class Player {

    private static final int LAST_SQUARE_NUMBER = 100;
    private int position = 1;

    public int move(int diceResult) {
        if (isPossiblePosition(diceResult)) {
            position = position + diceResult;
        }
        return position;
    }

    private boolean isPossiblePosition(int diceResult) {
        if (diceResult < 1 || diceResult > 6) {
            throw new IllegalArgumentException();
        }
        return position + diceResult <= LAST_SQUARE_NUMBER;
    }
}
