package net.bishnu.leetcode.lruCache;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-02-25.
 */
public class LRUCacheTest {
    @Test
    public void test(){
        LRUCache cache = new LRUCache( 2 /* capacity */ );

        cache.put(1, 1);
        cache.put(2, 2);
        Assert.assertEquals(1, cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        Assert.assertEquals(-1, cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        Assert.assertEquals(-1, cache.get(1));       // returns -1 (not found)
        Assert.assertEquals(3, cache.get(3));       // returns 3
        Assert.assertEquals(4, cache.get(4));       // returns 4
    }

    @Test
    public void test2(){
        LRUCache cache = new LRUCache( 1 /* capacity */ );
        cache.put(2, 1);
        Assert.assertEquals(1,cache.get(2));
        cache.put(3, 2);
        Assert.assertEquals(-1,cache.get(2));
        Assert.assertEquals(2,cache.get(3));
    }

    @Test
    public void test3(){
        LRUCache cache = new LRUCache( 2 /* capacity */ );

        cache.put(2, 1);
        cache.put(2, 2);
        Assert.assertEquals(2,cache.get(2));

        cache.put(1, 1);
        cache.put(4, 1);
        Assert.assertEquals(-1,cache.get(2));
    }


    @Test
    public void test4(){
        LRUCache cache = new LRUCache( 2 /* capacity */ );

        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        Assert.assertEquals(-1,cache.get(1));
        Assert.assertEquals(3,cache.get(2));
    }

    @Test
    public void test5(){
        LRUCache cache = new LRUCache( 10 /* capacity */ );

        cache.put(10, 13);
        cache.put(3, 17);
        cache.put(6, 11);
        cache.put(10, 5);
        cache.put(9, 10);

        Assert.assertEquals(-1,cache.get(13));

        cache.put(2, 19);

        Assert.assertEquals(19,cache.get(2));
        Assert.assertEquals(17,cache.get(3));

        cache.put(5, 25);

        Assert.assertEquals(-1,cache.get(8));

        cache.put(9, 22);
        cache.put(5, 5);
        cache.put(1, 30);

        Assert.assertEquals(-1,cache.get(11));

        cache.put(9, 12);

        Assert.assertEquals(-1,cache.get(7));
        Assert.assertEquals(5,cache.get(5));
        Assert.assertEquals(-1,cache.get(8));
        Assert.assertEquals(12,cache.get(9));

        cache.put(4, 30);
        cache.put(9, 3);

        Assert.assertEquals(3,cache.get(9));
        Assert.assertEquals(5,cache.get(10));
        Assert.assertEquals(5,cache.get(10));

        cache.put(6, 14);
        cache.put(3, 1);

        Assert.assertEquals(1,cache.get(3));

        cache.put(10, 11);

        Assert.assertEquals(-1,cache.get(8));

        cache.put(2, 14);

        Assert.assertEquals(30,cache.get(1));
        Assert.assertEquals(5,cache.get(5));
        Assert.assertEquals(30,cache.get(4));

        cache.put(11, 4);
        cache.put(12, 24);
        cache.put(5, 18);

        Assert.assertEquals(-1,cache.get(13));

        cache.put(7, 23);

        Assert.assertEquals(-1,cache.get(8));
        Assert.assertEquals(24,cache.get(12));

        cache.put(3, 27);
        cache.put(2, 12);

        Assert.assertEquals(18,cache.get(5));

        cache.put(2, 9);
        cache.put(13, 4);
        cache.put(8, 18);
        cache.put(1, 7);

        Assert.assertEquals(-1,cache.get(6));

        cache.put(9, 29);
        cache.put(8, 21);

        Assert.assertEquals(18,cache.get(5));

        cache.put(6, 30);
        cache.put(1, 12);

        Assert.assertEquals(-1,cache.get(10));

        cache.put(4, 15);
        cache.put(7, 22);
        cache.put(11, 26);
        cache.put(8, 17);
        cache.put(9, 29);

        Assert.assertEquals(18,cache.get(5));

        cache.put(3, 4);
        cache.put(11, 30);

        Assert.assertEquals(-1,cache.get(12));

        cache.put(4, 29);

        Assert.assertEquals(4,cache.get(3));
        Assert.assertEquals(29,cache.get(9));
        Assert.assertEquals(30,cache.get(6));

        cache.put(3, 4);

        Assert.assertEquals(12,cache.get(1));
        Assert.assertEquals(-1,cache.get(10));

        cache.put(3, 29);
        cache.put(10, 28);
        cache.put(1, 20);
        cache.put(11, 13);

        Assert.assertEquals(29,cache.get(3));

        cache.put(3, 12);
        cache.put(3, 8);
        cache.put(10, 9);
        cache.put(3, 26);

        Assert.assertEquals(17,cache.get(8));
        Assert.assertEquals(22,cache.get(7));
        Assert.assertEquals(18,cache.get(5));

        cache.put(13, 17);
        cache.put(2, 27);
        cache.put(11, 15);

        Assert.assertEquals(-1,cache.get(12));

        cache.put(9, 19);
        cache.put(2, 15);
        cache.put(3, 16);

        Assert.assertEquals(20,cache.get(1));

        cache.put(12, 17);
        cache.put(9, 1);
        cache.put(6, 19);

        Assert.assertEquals(-1,cache.get(4));
        Assert.assertEquals(18,cache.get(5));
        Assert.assertEquals(18,cache.get(5));

        cache.put(8, 1);
        cache.put(11, 7);
        cache.put(5, 2);
        cache.put(9, 28);

        Assert.assertEquals(20,cache.get(1));

    }
}