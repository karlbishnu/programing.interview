package net.bishnu.kakao.first2017.round1.no6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Friends4BlockTest {
    Friends4Block friends4Block;
    @Before
    public void setUp(){
        friends4Block = new Friends4Block();
    }
    @Test
    public void countBlocks1() throws Exception {
        int m = 4;
        int n = 5;
        String[] input = new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"};
        int expected = 14;
        assertEquals(expected, friends4Block.countBlocks(m,n,input));
    }

    @Test
    public void countBlocks2() throws Exception {
        int m = 6;
        int n = 6;
        String[] input = new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
        int expected = 15;
        assertEquals(expected, friends4Block.countBlocks(m,n,input));
    }


}