package net.bishnu.data.structure.string;

import net.bishnu.data.structure.list.LinkedStack;
import net.bishnu.data.structure.list.Stack;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by karlb on 2016-12-31.
 */
public class Int2StringTest {
    @Test
    public void positive(){
        int input = 30;
        String expected = String.valueOf(input);

        Assert.assertEquals(expected, int2String(input));
    }

    @Test
    public void negative(){
        int input = -30;
        String expected = String.valueOf(input);

        Assert.assertEquals(expected, int2String(input));
    }

    @Test
    public void zero(){
        int input = 0;
        String expected = String.valueOf(input);

        Assert.assertEquals(expected, int2String(input));
    }

    @Test
    public void maxInteger(){
        int input = Integer.MAX_VALUE;
        String expected = String.valueOf(input);

        Assert.assertEquals(expected, int2String(input));
    }

    @Test
    public void minInteger(){
        int input = Integer.MIN_VALUE;

        String expected = String.valueOf(input);
        Assert.assertEquals(expected, int2String(input));
    }

    private String int2String(int input) {
        if(input ==0) return "0";
        boolean negative = input<0 ? true : false;

        long tmp = input;
        if(negative) tmp *= -1;

        int size = negative ? 1 : 0;

        Stack<Character> digits = new LinkedStack<>();

        while (tmp>0){
            char digit = (char) ((tmp%10) + 0x30);
            digits.push(digit);
            tmp /= 10;
            size++;
        }

        char[] chars = new char[size];
        for(int i=0; i<size; i++){
            if(i==0 && negative){
                chars[i] = '-';
            }else{
                chars[i] = digits.pop();
            }
        }
        return new String(chars);
    }
}
