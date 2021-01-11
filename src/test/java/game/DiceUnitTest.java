package game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiceUnitTest {

    private Dice dice1d6 = new Dice();

    @Test
    void rollShouldNotBeNull() {
        assertThat(dice1d6.roll()).isNotNull();
    }

    @Test
    void rollShouldReturnPositiveNumber() {
        assertThat(dice1d6.roll()).isPositive();
    }
}