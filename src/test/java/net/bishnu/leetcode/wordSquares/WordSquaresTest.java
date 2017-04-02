package net.bishnu.leetcode.wordSquares;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-04-02.
 */
public class WordSquaresTest {
    @Test
    public void wordSquares() throws Exception {
        WordSquares solution = new WordSquares();
        String[] strings = new String[]{"area","lead","wall","lady","ball"};
        List<List<String>> expected = new LinkedList<>();
        List<String> list = new LinkedList<>();
        list.add(strings[2]);
        list.add(strings[0]);
        list.add(strings[1]);
        list.add(strings[3]);

        List<String> list1 = new LinkedList<>();
        list1.add(strings[4]);
        list1.add(strings[0]);
        list1.add(strings[1]);
        list1.add(strings[3]);
        expected.add(list);
        expected.add(list1);


        List<List<String>> result = solution.wordSquares(strings);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wordSquares1() throws Exception {
        WordSquares solution = new WordSquares();
        String[] strings = new String[]{"a","l","w","b","c"};
        List<List<String>> expected = new LinkedList<>();

        for(String aString: strings){
            List<String> list = new LinkedList<>();
            list.add(aString);
            expected.add(list);
        }

        List<List<String>> result = solution.wordSquares(strings);
        Assert.assertEquals(expected, result);
    }

}