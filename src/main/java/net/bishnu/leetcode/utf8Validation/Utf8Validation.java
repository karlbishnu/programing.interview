package net.bishnu.leetcode.utf8Validation;

/**
 * Created by karlb on 2017-05-14.
 * 393. UTF-8 Validation
 * https://leetcode.com/problems/utf-8-validation/#/description
 */
public class Utf8Validation {
    int getByteCount(int aByte){
        if(aByte >= 248 || (aByte>=128 && aByte<192)) return -1;
        if(aByte <128) return 1;

        int count = 0;
        for(int i=7; i>3;i--){
            int msb = (aByte>>i)&1;
            if(msb==0) break;
            count++;
        }
        return count;
    }

    public boolean validUtf8(int[] data){
        int numOfBytes = 0;

        for(int i=0; i<data.length; i+=numOfBytes){
            numOfBytes = getByteCount(data[i]);
            if(numOfBytes<0 || !validChar(data, numOfBytes, i)) return false;
        }

        return true;
    }

    private boolean validChar(int[] data, int numOfBytes, int offset) {
        if(numOfBytes==1)   return true;
        if(offset+numOfBytes > data.length) return false;
        for(int i=offset+1; i<offset+numOfBytes; i++){
            if(data[i]>>6 != 2) return false;
        }
        return true;
    }
}
