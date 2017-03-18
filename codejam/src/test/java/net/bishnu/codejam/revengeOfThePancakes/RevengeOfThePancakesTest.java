package net.bishnu.codejam.revengeOfThePancakes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-18.
 */
public class RevengeOfThePancakesTest {
    @Test
    public void main() throws Exception {
        StringBuilder sb = new StringBuilder("-");
        StringBuilder expected = new StringBuilder("+");
        Assert.assertEquals(expected.toString(), reverse(sb, 0).toString());
    }

    private static StringBuilder reverse(StringBuilder pancakes, int bottom){
        for(int i=0; i<=bottom; i++){
            pancakes.setCharAt(i, pancakes.charAt(i)=='+' ? '-' : '+');
        }
        return pancakes;
    }

    @Test
    public void test(){
        StringBuilder sb = new StringBuilder("+-++");
        String s = "-+";
        sb.replace(0, s.length(), s);
        String expected = "-+++";
        Assert.assertEquals(expected, sb.toString());
    }

}