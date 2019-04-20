package morse;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @BeforeClass
    public static void setUp(){
        Main.clacBino();
    }

    @Test
    public void morse1() {
        assertEquals("o--o", Main.morse(2, 2, 4));
    }

    @Test
    public void morse2() {
        assertEquals("--o-ooo-oooo", Main.morse(4, 8, 13));
    }

    @Test
    public void morse3() {
        assertEquals("------oooo", Main.morse(6, 4, 1));
    }
}