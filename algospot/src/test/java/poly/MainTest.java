package poly;

import org.junit.Test;

import static org.junit.Assert.*;
import static poly.Main.poly;

public class MainTest {
    @Test
    public void poly1() {
        int n=1;
        int expected = 1;
        assertEquals(expected, poly(n));
    }

    @Test
    public void poly2() {
        int n=2;
        int expected = 2;
        assertEquals(expected, poly(n));
    }

    @Test
    public void poly3() {
        int n=4;
        int expected = 19;
        assertEquals(expected, poly(n));
    }

    @Test
    public void poly4() {
        int n=92;
        int expected = 4841817;
        assertEquals(expected, poly(n));
    }
}