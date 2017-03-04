package net.bishnu.leetcode.MovingAverageFromDataStream;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-04.
 */
public class MovingAverageTest {
    @Test
    public void next() throws Exception {
        MovingAverage m = new MovingAverage(3);

        Assert.assertEquals(1, m.next(1), 0);
        Assert.assertEquals((double)(1 + 10) / 2, m.next(10), 0);
        Assert.assertEquals((double)(1 + 10 + 3) / 3, m.next(3), 0);
        Assert.assertEquals((double)(10 + 3 + 5) / 3, m.next(5), 0);
    }

}