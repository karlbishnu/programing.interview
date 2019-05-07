package jaehasafe;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void shift1() {
        String curr = "abbab";
        String next = "babab";
        assertEquals(3, Main.shift(curr, next));
    }

    @Test
    public void shift2() {
        String curr = "babab";
        String next = "ababb";
        assertEquals(1, Main.shift(next, curr));
    }


    @Test
    public void shift3() {
        String curr = "ababb";
        String next = "bbaba";
        assertEquals(2, Main.shift(curr, next));
    }

    @Test
    public void shift4() {
        String curr = "babab";
        String next = "ababb";
        assertEquals(4, Main.shift(curr, next));
    }

    @Test
    public void shift5() {
        String curr = "babab";
        String next = "ababb";
        assertEquals(4, Main.shift(curr, next));
    }

}