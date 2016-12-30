package net.bishnu.data.structure.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by karlb on 2016-12-30.
 */
public class RemoveCharsTest {
    @Test
    public void test(){
        String input = "Battle of the Vowels: Hawaii vs. Grozny";
        String remove = "aeiou";
        String expected = "Bttl f th Vwls: Hw vs. Grzny";

        Assert.assertEquals(expected, removeChars(input, remove));
    }

    @Test
    public void testWithSmile(){
        String input = "Battle of the Vowels"+ String.valueOf(Character.toChars(0x1F60A)) + ": Hawaii vs. Grozny";
        String remove = "aeiou";
        String expected = "Bttl f th Vwls" + String.valueOf(Character.toChars(0x1F60A)) +": Hw vs. Grzny";

        System.out.println(expected);
        Assert.assertEquals(expected, removeChars(input, remove));
    }

    @Test
    public void removeSmile(){
        String input = "Battle of the Vowels"+ String.valueOf(Character.toChars(0x1F60A)) + ": Hawaii vs. Grozny";
        String remove = "aeiou"+String.valueOf(Character.toChars(0x1F60A));
        String expected = "Bttl f th Vwls: Hw vs. Grzny";

        Assert.assertEquals(expected, removeChars(input, remove));
    }

    static String removeChars(String str, String remove){
        Set<Integer> removeSet = convertStringToSet(remove);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length();){
            int codePoint = str.codePointAt(i);
            if(!removeSet.contains(codePoint)){
                sb.append(Character.toChars(codePoint));
            }
            i += Character.charCount(codePoint);
        }
        return sb.toString();
    }

    private static Set<Integer> convertStringToSet(String input) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<input.length();){
            int codePoint = input.codePointAt(i);
            set.add(codePoint);
            i += Character.charCount(codePoint);
        }
        return Collections.unmodifiableSet(set);
    }
}
