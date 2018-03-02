package net.bishnu.leetcode.mergeIntervals;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static net.bishnu.leetcode.mergeIntervals.MergeIntervals.Interval;
import static org.junit.Assert.*;

public class MergeIntervalsTest {
    MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    public void merge() {
        List<Interval> list = mergeIntervals.merge(Arrays.asList(new Interval(1, 9), new Interval(1, 6)));
        assertEquals(1, list.size());
        assertEquals(1, list.get(0).start);
        assertEquals(9, list.get(0).end);
    }

    @Test
    public void merge2() {
        List<Interval> list = mergeIntervals.merge(Arrays.asList(new Interval(1, 3), new Interval(2, 6), new Interval(8, 10), new Interval(15, 18)));
        assertEquals(3, list.size());
        assertEquals(new Interval(1, 6), list.get(0));
        assertEquals(new Interval(8, 10), list.get(1));
        assertEquals(new Interval(15, 18), list.get(2));
    }
}