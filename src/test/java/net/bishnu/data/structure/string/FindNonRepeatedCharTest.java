package net.bishnu.data.structure.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by karlb on 2016-12-30.
 */
public class FindNonRepeatedCharTest {
    @Test
    public void ShouldReturnFirstChar(){
        String input = "abc";
        Character expected = 'a';

        Assert.assertEquals(expected, findFirstNonRepeatedChar(input));
    }

    @Test
    public void ShouldReturn가(){
        String input = "가나다";
        Character expected = '가';

        Assert.assertEquals(expected, findFirstNonRepeatedChar(input));
    }

    @Test
    public void ShouldReturnNull(){
        String input = "가가가";
        Character expected = null;

        Assert.assertEquals(expected, findFirstNonRepeatedChar(input));
    }

    private Character findFirstNonRepeatedChar(String input) {
        Map<Character, Integer> countMap = new HashMap<>();
        char[] charArray = input.toCharArray();

        for(char aChar : charArray){
            int count;
            count = countMap.containsKey(aChar) ?
                    countMap.get(aChar) + 1:
                    1;

            countMap.put(aChar, count);
        }

        for(char aChar : charArray){
            if(countMap.get(aChar) == 1)    return aChar;
        }
        return null;
    }
}
