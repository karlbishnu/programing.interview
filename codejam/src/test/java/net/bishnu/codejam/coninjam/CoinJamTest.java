package net.bishnu.codejam.coninjam;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by karlb on 2017-03-18.
 */
public class CoinJamTest {
    @Test
    public void LongMaxValue(){
        String longMax = String.valueOf(Long.MAX_VALUE);
        Assert.assertTrue(longMax.length()<32);
    }
}
