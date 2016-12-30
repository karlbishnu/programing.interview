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
        String input = String.valueOf(Character.toChars(0x1F60A)) + "가";
        String expected = String.valueOf(Character.toChars(0x1F60A));
        Assert.assertEquals(expected, findFirstNonRepeatedChar(input));
    }

    private static String findFirstNonRepeatedChar(String input) {
        Map<Integer, Boolean> countMap = new HashMap<>();

        for(int i=0; i<input.length();){
            int codePoint = input.codePointAt(i);
            Boolean isNonRepeated = countMap.containsKey(codePoint) ?
                    Boolean.FALSE:
                    Boolean.TRUE;

            countMap.put(input.codePointAt(i), isNonRepeated);
            i += Character.charCount(input.codePointAt(i));
        }

        for(int i=0; i<input.length();){
            int codePoint = input.codePointAt(i);
            if(countMap.get(codePoint))    return new String(Character.toChars(input.codePointAt(i)));
            i += Character.charCount(codePoint);

        }
        return null;
    }
}
