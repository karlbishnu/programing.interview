package net.bishnu.leetcode.longestAbsoluteFilePath;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-05.
 */
public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void lengthLongestPath() throws Exception {
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        Assert.assertEquals(20, solution.lengthLongestPath(input));
    }

    @Test
    public void lengthLongestPath2() throws Exception{
        String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        Assert.assertEquals(32, solution.lengthLongestPath(input));
    }

    @Test
    public void lengthLongestPathNoFile() throws Exception{
        String input = "a";
        Assert.assertEquals(0, solution.lengthLongestPath(input));
    }

    @Test
    public void lengthLongestPathNoFile2() throws Exception{
        String input = "a\n\tb";
        Assert.assertEquals(0, solution.lengthLongestPath(input));
    }

    @Test
    public void fileNameWithWhiteSpace() throws Exception{
        String input = "tes t.txt";
        Assert.assertEquals(input.length(), solution.lengthLongestPath(input));
    }

    @Test
    public void fileNameStartWithWhiteSpace() throws Exception{
        String input = "dir\n    te st.txt";
        Assert.assertEquals("    te st.txt".length(), solution.lengthLongestPath(input));
    }

    @Test
    public void test(){
        String input = "a\n\tb.txt\na2\n\tb2.txt";
        Assert.assertEquals("a/b.txt\na2/b2.txt","a\n\tb.txt\na2\n\tb2.txt".replaceAll("\n\t", "/"));
        //Assert.assertEquals("a2/b2.txt".length(), solution.lengthLongestPath(input));
    }


}