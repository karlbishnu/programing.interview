package net.bishnu.leetcode.utf8Validation;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by karlb on 2017-05-14.
 * 393. UTF-8 Validation
 * https://leetcode.com/problems/utf-8-validation/#/description
 */
public class Utf8ValidationTest {
    Utf8Validation solution = new Utf8Validation();
    @Test
    public void validUtf81() throws Exception {
        assertTrue(solution.validUtf8(new int[]{197, 130, 1}));

    }

    @Test
    public void validUtf82() throws Exception {
        assertFalse(solution.validUtf8(new int[]{235, 140, 4}));
    }


    @Test
    public void validUtf83() throws Exception{
        byte[] bytes = "안녕하세요.asdf".getBytes("utf8");

        int[] array = new int[bytes.length];
        Arrays.setAll(array, operand -> bytes[operand]);

        for(int i=0; i<array.length; i++){
            assertTrue(array[i]==bytes[i]);
        }

        assertTrue(solution.validUtf8(array));
    }

    @Test
    public void validUtf84() throws Exception{
        assertFalse(solution.validUtf8(new int[]{237}));
    }

    @Test
    public void validUtf85() throws Exception{
        assertTrue(solution.validUtf8(new int[]{230,136,145}));
    }

    @Test
    public void validUtf86() throws Exception{
        assertFalse(solution.validUtf8(new int[]{250,145,145,145,145}));
    }

}