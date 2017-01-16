package net.bishnu.recursive_call;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by karlb on 2017-01-16.
 */
public class StringCombinationTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void threeAsciiCharacters(){
        String input = "123";
        StringCombination stringCombination = new StringCombination(input);

        stringCombination.printCombinations();

        String[] strings = outContent.toString().split(System.lineSeparator());
        Assert.assertEquals(7, strings.length);
    }

    @Test
    public void threeAsciiCharactersPlusSmile(){
        String input = "12"+String.valueOf(Character.toChars(0x1F60A))+"3";
        StringCombination stringCombination = new StringCombination(input);

        stringCombination.printCombinations();

        String[] strings = outContent.toString().split(System.lineSeparator());
        Assert.assertEquals(15, strings.length);
    }
}
