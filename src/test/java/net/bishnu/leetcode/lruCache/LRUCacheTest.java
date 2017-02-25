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
}