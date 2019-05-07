package palindromize;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void getPi(){
        String pattern = "revresppa";
        int[] expected = new int[]{0,0,0,1,2,0,0,0,0};
        assertArrayEquals(expected, Main.getPi(pattern.toCharArray()));
    }

    @Test
    public void maxOverlap1(){
        String s = "appserver";
        String rev = new StringBuilder(s).reverse().toString();
        int expected = 1;
        assertEquals(expected, Main.maxOverlap(s.toCharArray(), rev.toCharArray()));
    }

    @Test
    public void maxOverlap2(){
        String s = "app";
        String rev = new StringBuilder(s).reverse().toString();
        int expected = 2;
        assertEquals(expected, Main.maxOverlap(s.toCharArray(), rev.toCharArray()));
    }

    @Test
    public void maxOverlap3(){
        String s = "there";
        String rev = new StringBuilder(s).reverse().toString();
        int expected = 3;
        assertEquals(expected, Main.maxOverlap(s.toCharArray(), rev.toCharArray()));
    }

    @Test
    public void maxOverlap4(){
        String s = "amanaplanacanal";
        String rev = new StringBuilder(s).reverse().toString();
        int expected = 9;
        assertEquals(expected, Main.maxOverlap(s.toCharArray(), rev.toCharArray()));
    }

    @Test
    public void maxOverlap5(){
        String s = "xyz";
        String rev = new StringBuilder(s).reverse().toString();
        int expected = 1;
        assertEquals(expected, Main.maxOverlap(s.toCharArray(), rev.toCharArray()));
    }

    @Test
    public void maxOverlap6(){
        String s = "a";
        String rev = new StringBuilder(s).reverse().toString();
        int expected = 1;
        assertEquals(expected, Main.maxOverlap(s.toCharArray(), rev.toCharArray()));
    }

    @Test
    public void maxOverlap7(){
        String s = "";
        String rev = new StringBuilder(s).reverse().toString();
        int expected = 0;
        assertEquals(expected, Main.maxOverlap(s.toCharArray(), rev.toCharArray()));
    }

    @Test
    public void maxOverlap8(){
        String s = "anon";
        String rev = new StringBuilder(s).reverse().toString();
        int expected = 3;
        assertEquals(expected, Main.maxOverlap(s.toCharArray(), rev.toCharArray()));
    }

    @Test
    public void maxOverlap9(){
        String s = "abcba";
        String rev = new StringBuilder(s).reverse().toString();
        int expected = 5;
        assertEquals(expected, Main.maxOverlap(s.toCharArray(), rev.toCharArray()));
    }

    @Test
    public void maxOverlap10(){
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String rev = new StringBuilder(s).reverse().toString();
        int expected = 35;
        assertEquals(expected, Main.maxOverlap(s.toCharArray(), rev.toCharArray()));
    }

    @Test
    public void palindromize1(){
        assertEquals(2, Main.palindromize("aa"));
    }

    @Test
    public void palindromize2(){
        String s = "there";
        assertEquals(7, s.length()*2-Main.palindromize(s));
    }

    @Test
    public void palindromize3(){
        String s = "amanaplanacanal";
        assertEquals(21, s.length()*2-Main.palindromize(s));
    }

    @Test
    public void palindromize4(){
        String s = "xyz";
        assertEquals(5, s.length()*2-Main.palindromize(s));
    }

    @Test
    public void palindromize5(){
        String s = "appserver";
        assertEquals(17, s.length()*2-Main.palindromize(s));
    }

    @Test
    public void palindromize6(){
        String s = "appaserver";
        assertEquals(19, s.length()*2-Main.palindromize(s));
    }

    @Test
    public void palindromize7(){
        String s = "serverappa";
        assertEquals(16, s.length()*2-Main.palindromize(s));
    }

}