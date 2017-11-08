package net.bishnu.leetcode.hammingDistance;

/**
 * 461. Hamming Distance
 * https://leetcode.com/problems/hamming-distance/description/
 */
public class HammingDistance {
    public int hammingDistance(int x, int y){
        int xor = x^y;
        int dist = 0;
        while(xor != 0){
            dist += (xor&0x01)==1 ? 1 : 0;
            xor = xor>>1;
        }
        return dist;
    }
}
