package net.bishnu.leetcode.encodeAndDecodeTinyUrl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 535. Encode and Decode TinyURL
 * https://leetcode.com/problems/encode-and-decode-tinyurl/description/
 */
public class CodecTest {
    Codec codec;

    @Before
    public void setUp(){
        codec = new Codec();
    }
    @Test
    public void tinyUrl1(){
        String input = "https://leetcode.com/problems/design-tinyurl";
        String expected = input;
        assertEquals(expected, codec.decode(codec.encode(input)));
    }
}