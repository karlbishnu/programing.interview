package net.bishnu.leetcode.bombEnemy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-04-03.
 */
public class BombEnemyTest {
    @Test
    public void maxKilledEnemies1() throws Exception {
        BombEnemy solution = new BombEnemy();

        char[][] grid = new char[][]{{'0','E','0','0'},{'E','0','W','E'},{'0','E','0','0'}};

        Assert.assertEquals(3, solution.maxKilledEnemies(grid));
    }

    @Test
    public void maxKilledEnemies2() throws Exception {
        BombEnemy solution = new BombEnemy();

        char[][] grid = new char[][]{{'E','E','E'}};

        Assert.assertEquals(0, solution.maxKilledEnemies(grid));
    }

    @Test
    public void maxKilledEnemies3() throws Exception {
        BombEnemy solution = new BombEnemy();

        char[][] grid = new char[][]{{'E'}};

        Assert.assertEquals(0, solution.maxKilledEnemies(grid));
    }

    @Test
    public void maxKilledEnemies4() throws Exception {
        BombEnemy solution = new BombEnemy();

        char[][] grid = new char[][]{{'0'}};

        Assert.assertEquals(0, solution.maxKilledEnemies(grid));
    }

    @Test
    public void maxKilledEnemies5() throws Exception {
        BombEnemy solution = new BombEnemy();

        char[][] grid = new char[][]{{'E'},{'E'},{'E'}};

        Assert.assertEquals(0, solution.maxKilledEnemies(grid));
    }

    @Test
    public void maxKilledEnemies6() throws Exception {
        BombEnemy solution = new BombEnemy();

        char[][] grid = new char[][]{"0000000000".toCharArray(),"EEEEEEEEEE".toCharArray(),"WWWWWWWWWW".toCharArray()};

        Assert.assertEquals(1, solution.maxKilledEnemies(grid));
    }
}