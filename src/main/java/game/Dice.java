package game;

import java.util.Random;

public class Dice {

    private Random randomGenerator = new Random();
    
    public int roll() {
        return randomGenerator.nextInt(5) + 1;
    }
}
