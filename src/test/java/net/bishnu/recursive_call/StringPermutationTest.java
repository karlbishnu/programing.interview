package net.bishnu.recursive_call;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static net.bishnu.recursive_call.StringPermutation.*;

/**
 * Created by karlb on 2017-01-06.
 */
public class StringPermutationTest {

    @Test
    public void testGetStringPermutation(){
        String input = "hat";
        Set<String> permutationSet = new HashSet<>();
        permutationSet.add("hat");
        permutationSet.add("aht");
        permutationSet.add("ath");
        permutationSet.add("tah");
        permutationSet.add("tha");
        permutationSet.add("hta");

        int expectedSize = permutationSet.size();

        List<String> result = getStringPermutation(input);
        Assert.assertEquals(expectedSize, result.size());
        for(String aString: result){
            Assert.assertTrue(permutationSet.contains(aString));
            permutationSet.remove(aString);
        }

        Assert.assertEquals(0, permutationSet.size());
    }

    @Test
    public void testGetStringPermutation4Characters(){
        String input = "abcd";
        Set<String> permutationSet = new HashSet<>();
        permutationSet.add("abcd");
        permutationSet.add("abdc");
        permutationSet.add("acbd");
        permutationSet.add("acdb");
        permutationSet.add("adbc");
        permutationSet.add("adcb");

        permutationSet.add("bacd");
        permutationSet.add("badc");
        permutationSet.add("bcad");
        permutationSet.add("bcda");
        permutationSet.add("bdac");
        permutationSet.add("bdca");

        permutationSet.add("cabd");
        permutationSet.add("cadb");
        permutationSet.add("cbad");
        permutationSet.add("cbda");
        permutationSet.add("cdab");
        permutationSet.add("cdba");

        permutationSet.add("dabc");
        permutationSet.add("dacb");
        permutationSet.add("dbac");
        permutationSet.add("dbca");
        permutationSet.add("dcab");
        permutationSet.add("dcba");

        int expectedSize = permutationSet.size();

        List<String> result = getStringPermutation(input);
        Assert.assertEquals(expectedSize, result.size());
        for(String aString: result){
            Assert.assertTrue(permutationSet.contains(aString));
            permutationSet.remove(aString);
        }

        Assert.assertEquals(0, permutationSet.size());
    }

    @Test
    public void testSwapCharsShortString(){
        String input = "12";
        String expected = "21";
        Assert.assertEquals(expected, swapChars(input, 0, input.length()-1));
    }

    @Test
    public void testSwapCharsNotTheLastInext(){
        String input = "123";
        String expected = "213";
        Assert.assertEquals(expected, swapChars(input, 0, 1));
    }

    @Test
    public void testSwapCharsNotFromZeroIndex(){
        String input = "abcd";
        String expected = "adcb";
        Assert.assertEquals(expected, swapChars(input, 1, input.length()-1));
    }

    @Test
    public void testSwapChars(){
        String input = "1234567890";
        String expected = "0234567891";
        Assert.assertEquals(expected, swapChars(input, 0, input.length()-1));
    }

    @Test
    public void testSwapCharsWithSmile(){
        String input = String.valueOf(Character.toChars(0x1F60A)) + "가";
        String expected = "가" + String.valueOf(Character.toChars(0x1F60A));
        Assert.assertEquals(expected, swapChars(input, 0, input.length()-1));
    }

    @Test
    public void testSwapCharsWithEmojis(){
        String input = String.valueOf(Character.toChars(0x1F60A)) + String.valueOf(Character.toChars(0x1F60B));
        String expected = String.valueOf(Character.toChars(0x1F60B)) + String.valueOf(Character.toChars(0x1F60A));
        Assert.assertEquals(expected, swapChars(input, 0, input.length()-1));
    }
}
