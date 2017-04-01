package net.bishnu.leetcode.zigzagIterator;

import java.util.*;

/**
 * 281. Zigzag Iterator
 * https://leetcode.com/problems/zigzag-iterator/#/description
 *
 * Created by karlb on 2017-04-01.
 */
public class ZigzagIterator {

    private Deque<Iterator<Integer>> iterators;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        iterators = new LinkedList<>();

        if(!v1.isEmpty()) iterators.offer(v1.iterator());
        if(!v2.isEmpty()) iterators.offer(v2.iterator());
    }

    public int next() {
        Iterator<Integer> poll = iterators.poll();
        int result = poll.next();
        if(poll.hasNext())   iterators.add(poll);
        return result;
    }

    public boolean hasNext() {
        return !iterators.isEmpty();
    }
}
