package game;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PlayerUnitTest {

    private static final int DICE_RESULT = 3;
    private static final int NO_WIN_DICE_RESULT = 4;

    private Player player = new Player();


    @Test
    void shouldMovePlayerOnThreeSpaces() {
        assertThat(player.move(DICE_RESULT)).isEqualTo(4);
    }

    @Test
    void shouldMovePlayerOnSquareNumberEight() {
        player.move(DICE_RESULT);
        assertThat(player.move(4)).isEqualTo(8);
    }

    @Test
    void shouldNotMovePlayerIfDiceResultNotEquals100InSum() throws Exception {
        Field positionField = player.getClass().getDeclaredField("position");
        positionField.setAccessible(true);
        positionField.setInt(player, 97);
        
        assertThat(player.move(NO_WIN_DICE_RESULT)).isEqualTo(97);
    }

    @Test
    void shouldThrowExceptionIfDiceResultIsZero() {
        assertThatIllegalArgumentException().isThrownBy(() -> player.move(0));
    }

    @Test
    void shouldThrowExceptionIfDiceResultIsMoreThanSix() {
        assertThatIllegalArgumentException().isThrownBy(() -> player.move(7));
    }
}