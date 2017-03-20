package net.bishnu.codejam.coninjam;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by karlb on 2017-03-18.
 */
public class CoinJamTest {
    @Test
    public void LongMaxValue(){
        String longMax = String.valueOf(Long.MAX_VALUE);
        Assert.assertTrue(longMax.length()<32);
    }
    @Test
    public void Lewin(){
        int n = 16, j = 100;
        char[] s1 = new char[n];
        Arrays.fill(s1, '0');
        s1[n-1] = '1';
        s1[n/2-1] = '1';
        BigInteger[] mult = new BigInteger[11];
        for (int i = 2; i <= 10; i++) {
            mult[i] = new BigInteger(new String(s1), i);
        }
        char[] s2 = new char[n];
        Arrays.fill(s2, '0');
        s2[n/2] = '1';
        BigInteger a1 = mult[2];
        int count = 0;
        for (int i = 1; count < j; i += 2) {
            BigInteger add = new BigInteger(new String(s2), 2);
            String s = add.toString(2);
            add = add.add(new BigInteger(""+i));
            s = add.toString(2);
            BigInteger result = add.multiply(a1);
            System.out.print(result.toString(2));
            for (int k = 2; k <= 10; k++) System.out.print(" "+mult[k]);
            count++;
            System.out.println();
        }
    }
}
