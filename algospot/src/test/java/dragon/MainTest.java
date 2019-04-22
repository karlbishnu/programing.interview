package dragon;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void curve1() {
        assertEquals("FX", Main.curve(0, 1, 2));
    }

    @Test
    public void curve2() {
        assertEquals("FX+YF", Main.curve(1, 1,5));
    }

    @Test
    public void curve3() {
        assertEquals("+FX-Y", (Main.curve(2, 6,5)));
    }

    @Test
    public void curve4() {
        assertEquals("FX-YF-FX+YF+FX-YF-FX+YF-FX-YF-", Main.curve(42, 764853475, 30));
    }
}