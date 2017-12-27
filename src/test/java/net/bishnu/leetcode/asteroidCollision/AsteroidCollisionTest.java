package net.bishnu.leetcode.asteroidCollision;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 735. Asteroid Collision
 * https://leetcode.com/problems/asteroid-collision/description/
 */
public class AsteroidCollisionTest {
    AsteroidCollision asteroidCollision = new AsteroidCollision();

    @Test
    public void asteroidCollision1() {
        int[] input = new int[]{5, 10, -5};
        int[] expected = new int[]{5, 10};

        assertArrayEquals(expected, asteroidCollision.asteroidCollision(input));
    }

    @Test
    public void asteroidCollision2() {
        int[] input = new int[]{8, -8};
        int[] expected = new int[]{};

        assertArrayEquals(expected, asteroidCollision.asteroidCollision(input));
    }

    @Test
    public void asteroidCollision3() {
        int[] input = new int[]{10, 2, -5};
        int[] expected = new int[]{10};

        assertArrayEquals(expected, asteroidCollision.asteroidCollision(input));
    }

    @Test
    public void asteroidCollision4() {
        int[] input = new int[]{-2, -1, 1, 2};
        int[] expected = new int[]{-2, -1, 1, 2};

        assertArrayEquals(expected, asteroidCollision.asteroidCollision(input));
    }
}