package Ites;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void ites1(){
        int k=8791;
        int n=20;
        assertEquals(1, Main.ites(k, n));
    }

    @Test
    public void ites2(){
        int k=5265;
        int n=5000;
        assertEquals(4, Main.ites(k, n));
    }

    @Test
    public void ites3(){
        int k=3578452;
        int n=5000000;
        assertEquals(1049, Main.ites(k, n));
    }

    @Test
    public void next(){
        long next=0;
        assertEquals(1983, next = Main.next(next));
        assertEquals(8791, (next = Main.next(next))%10000+1);
        assertEquals(4770, (next = Main.next(next))%10000+1);
        assertEquals(7665, (next = Main.next(next))%10000+1);
        assertEquals(3188, (next = Main.next(next))%10000+1);

    }
}