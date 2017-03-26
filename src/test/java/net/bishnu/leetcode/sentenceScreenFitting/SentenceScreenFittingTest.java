package net.bishnu.leetcode.sentenceScreenFitting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-26.
 */
public class SentenceScreenFittingTest {
    @Test
    public void wordsTyping1() throws Exception {
        String[] sentence = new String[]{"hello", "world"};
        int rows = 2, cols = 8;
        int expected = 1;

        SentenceScreenFitting sentenceScreenFitting = new SentenceScreenFitting();
        Assert.assertEquals(expected, sentenceScreenFitting.wordsTyping(sentence, rows, cols));
    }

    @Test
    public void wordsTyping2() throws Exception {
        String[] sentence = new String[]{"a", "bcd", "e"};
        int rows = 3, cols = 6;
        int expected = 2;

        SentenceScreenFitting sentenceScreenFitting = new SentenceScreenFitting();
        Assert.assertEquals(expected, sentenceScreenFitting.wordsTyping(sentence, rows, cols));
    }

    @Test
    public void wordsTyping3() throws Exception {
        String[] sentence = new String[]{"I", "had", "apple", "pie"};
        int rows = 4, cols = 5;
        int expected = 1;

        SentenceScreenFitting sentenceScreenFitting = new SentenceScreenFitting();
        Assert.assertEquals(expected, sentenceScreenFitting.wordsTyping(sentence, rows, cols));
    }

    @Test
    public void wordsTyping4() throws Exception {
        String[] sentence = new String[]{"a", "b", "e"};
        int rows = 8, cols = 7;
        int expected = 10;

        SentenceScreenFitting sentenceScreenFitting = new SentenceScreenFitting();
        Assert.assertEquals(expected, sentenceScreenFitting.wordsTyping(sentence, rows, cols));
    }

    @Test
    public void wordsTyping5() throws Exception {
        String[] sentence = new String[]{"hello"};
        int rows = 1000, cols = 1;
        int expected = 0;

        SentenceScreenFitting sentenceScreenFitting = new SentenceScreenFitting();
        Assert.assertEquals(expected, sentenceScreenFitting.wordsTyping(sentence, rows, cols));
    }

    @Test
    public void wordsTyping6() throws Exception {
        String[] sentence = new String[]{"a"};
        int rows = 20000, cols = 20000;
        int expected = 200000000;

        SentenceScreenFitting sentenceScreenFitting = new SentenceScreenFitting();
        Assert.assertEquals(expected, sentenceScreenFitting.wordsTyping(sentence, rows, cols));
    }

    @Test
    public void wordsTyping7() throws Exception {
        String[] sentence = new String[]{"a", "bcd", "e"};
        int rows = 4, cols = 6;
        int expected = 2;

        SentenceScreenFitting sentenceScreenFitting = new SentenceScreenFitting();
        Assert.assertEquals(expected, sentenceScreenFitting.wordsTyping(sentence, rows, cols));
    }

}