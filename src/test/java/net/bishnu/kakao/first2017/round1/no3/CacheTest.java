package net.bishnu.kakao.first2017.round1.no3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CacheTest {
    @Test
    public void cache1() throws Exception {
        String[] input = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int size = 3;
        int expected = 50;
        assertEquals(expected, Cache.Cache(size, input));
    }

    @Test
    public void cache2() throws Exception {
        String[] input = new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        int size = 3;
        int expected = 21;
        assertEquals(expected, Cache.Cache(size, input));
    }

    @Test
    public void cache3() throws Exception {
        String[] input = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int size = 2;
        int expected = 60;
        assertEquals(expected, Cache.Cache(size, input));
    }

    @Test
    public void cache4() throws Exception {
        String[] input = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int size = 5;
        int expected = 52;
        assertEquals(expected, Cache.Cache(size, input));
    }

    @Test
    public void cache5() throws Exception {
        String[] input = new String[]{"Jeju", "Pangyo", "NewYork", "newyork"};
        int size = 2;
        int expected = 16;
        assertEquals(expected, Cache.Cache(size, input));
    }

    @Test
    public void cache6() throws Exception {
        String[] input = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int size = 0;
        int expected = 25;
        assertEquals(expected, Cache.Cache(size, input));
    }
}