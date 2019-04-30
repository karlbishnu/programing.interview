package christmas;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void pSum1(){
        int[] boxes = new int[]{1, 2, 3, 4, 5, 6};
        int k = 4;
        int[] expected = new int[]{0, 1, 3, 2, 2, 3, 1};
        assertArrayEquals(expected, Main.calc(boxes, k));
    }

    @Test
    public void pSum2(){
        int[] boxes = new int[]{1, 2, 3, 4};
        int k = 1;
        int[] expected = new int[]{0, 0, 0, 0, 0};
        assertArrayEquals(expected, Main.calc(boxes, k));
    }

    @Test
    public void maxBuy1() {
        int[] pSum = new int[]{0, 1, 3, 2, 2, 3, 1};
        int k = 4;
        assertEquals(1, Main.maxBuy(pSum, k));
    }

    @Test
    public void maxBuy2() {
        int[] pSum = new int[]{0, 0, 0, 0, 0};
        int k = 1;
        assertEquals(4, Main.maxBuy(pSum, k));
    }

    @Test
    public void waysToBuy1() {
        int[] pSum = new int[]{0, 1, 3, 2, 2, 3, 1};
        int k = 4;
        assertEquals(3, Main.waysToBuy(pSum, k));
    }

    @Test
    public void waysToBuy2() {
        int[] pSum = new int[]{0, 0, 0, 0, 0};
        int k = 1;
        assertEquals(10, Main.waysToBuy(pSum, k));
    }
}