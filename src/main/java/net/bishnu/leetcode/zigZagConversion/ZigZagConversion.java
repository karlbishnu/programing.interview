package net.bishnu.leetcode.zigZagConversion;

/**
 * 6. ZigZag Conversion
 * https://leetcode.com/problems/zigzag-conversion/description/
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1 || s==null || s.isEmpty())  return s;
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            sbs[i] = new StringBuilder();
        }

        boolean decrease = false;
        for(int i=0, j=0; i<s.length(); i++){
            sbs[j].append(s.charAt(i));
            j+=decrease ?-1:1;
            if(j==sbs.length-1) decrease = true;
            if(j==0)    decrease = false;
        }

        for(int i=1; i<sbs.length; i++){
            sbs[0].append(sbs[i]);
        }
        return sbs[0].toString();
    }
}
