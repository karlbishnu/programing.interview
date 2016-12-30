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
        String expected = "a";

        Assert.assertEquals(expected, findFirstNonRepeatedChar(input));
    }

    @Test
    public void ShouldReturn가(){
        String input = "가나다";
        String expected = "가";

        Assert.assertEquals(expected, findFirstNonRepeatedChar(input));
    }

    @Test
    public void ShouldReturnNull(){
        String input = "가가가";
        String expected = null;

        Assert.assertEquals(expected, findFirstNonRepeatedChar(input));
    }

    @Test
    public void ShouldReturnSmile(){
        String input = "😊가";
        String expected = "😊";
        Assert.assertEquals(expected, findFirstNonRepeatedChar(input));
    }

    private static String findFirstNonRepeatedChar(String input) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int i=0; i<input.length();){
            int count;
            count = countMap.containsKey(input.codePointAt(i)) ?
                    countMap.get(input.codePointAt(i)) + 1:
                    1;

            countMap.put(input.codePointAt(i), count);
            i += Character.charCount(input.codePointAt(i));
        }

        for(int i=0; i<input.length(); i++){
            if(countMap.get(input.codePointAt(i)) == 1)    return new String(Character.toChars(input.codePointAt(i)));
        }
        return null;
    }
}
