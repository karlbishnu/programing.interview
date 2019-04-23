package numbergame;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void numberGame1() {
        int[] board = new int[]{-1000, -1000, -3, -1000, -1000};
        assertEquals(-1000, Main.numberGame(board));
    }

    @Test
    public void numberGame2() {
        int[] board = new int[]{100, -1000, -1000, 100, -1000, -1000};
        assertEquals(1100, Main.numberGame(board));
    }

    @Test
    public void numberGame3() {
        int[] board = new int[]{7, -5, 8, 5, 1, -4, -8, 6, 7, 9};
        assertEquals(7, Main.numberGame(board));
    }
}