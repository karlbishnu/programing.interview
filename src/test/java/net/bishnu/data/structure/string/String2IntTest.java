package net.bishnu.data.structure.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by karlb on 2016-12-31.
 */
public class String2IntTest {
    @Test
    public void positive(){
        int expected = 30;
        String input = String.valueOf(expected);

        Assert.assertEquals(expected, string2int(input));
    }

    @Test
    public void negative(){
        int expected = -30;
        String input = String.valueOf(expected);

        Assert.assertEquals(expected, string2int(input));
    }

    @Test
    public void zero(){
        int expected = 0;
        String input = String.valueOf(expected);

        Assert.assertEquals(expected, string2int(input));
    }

    @Test
    public void maxInteger(){
        int expected = Integer.MAX_VALUE;
        String input = String.valueOf(expected);

        Assert.assertEquals(expected, string2int(input));
    }

    @Test
    public void minInteger(){
        int expected = Integer.MIN_VALUE;
        String input = String.valueOf(expected);

        Assert.assertEquals(expected, string2int(input));
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgument(){
        string2int("test");
    }

    private int string2int(String input) {
        boolean negative = input.charAt(0)=='-' ? true : false;
        int result = 0;
        for(int i=negative?1:0; i<input.length(); i++){
            char digit = input.charAt(i);
            if(digit<'0' || digit>'9'){
                throw new IllegalArgumentException();
            }
            result *= 10;
            result += digit-'0';
        }
        if(negative) result = -result;
        return result;
    }
}
