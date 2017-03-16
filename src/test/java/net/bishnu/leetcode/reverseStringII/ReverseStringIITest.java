package net.bishnu.leetcode.reverseStringII;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-16.
 */
public class ReverseStringIITest {
    ReverseStringII reverseStringII = new ReverseStringII();
    @Test
    public void reverseStr() throws Exception {
        String input = "abcdefg";
        int k = 2;
        String expected ="bacdfeg";

        String result = reverseStringII.reverseStr(input, k);
        Assert.assertEquals(expected, result);
    }

}