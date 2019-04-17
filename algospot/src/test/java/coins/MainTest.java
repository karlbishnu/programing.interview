package coins;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void coinChange1() {
        int m = 110;
        int[] coins = new int[]{10, 50, 100, 500};
        assertEquals(4, Main.coinChange(m, coins));
    }

    @Test
    public void coinChange2() {
        int m = 850;
        int[] coins = new int[]{10, 50, 100, 500};
        assertEquals(110, Main.coinChange(m, coins));
    }

    @Test
    public void coinChange3() {
        int m = 3600;
        int[] coins = new int[]{100,300,500,900,2000};
        assertEquals(130, Main.coinChange(m, coins));
    }

    @Test
    public void coinChange4() {
        int m = 1278;
        int[] coins = new int[]{1, 2, 4, 8, 16, 32, 64, 128};
        assertEquals(873794561, Main.coinChange(m, coins));
    }
}