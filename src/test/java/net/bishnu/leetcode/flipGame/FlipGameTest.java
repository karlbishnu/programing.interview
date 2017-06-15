package net.bishnu.leetcode.flipGame;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * 293. Flip Game
 * https://leetcode.com/problems/flip-game/#/description
 * Created by karlb on 2017-06-15.
 */
public class FlipGameTest {
    @Test
    public void generatePossibleNextMoves() throws Exception {
        String input = "++++";
        Set<String> expected = new HashSet<>();
        expected.add("--++");
        expected.add("+--+");
        expected.add("++--");

        List<String> result = new FlipGame().generatePossibleNextMoves(input);
        assertEquals(expected, new HashSet<>(result));
    }

}