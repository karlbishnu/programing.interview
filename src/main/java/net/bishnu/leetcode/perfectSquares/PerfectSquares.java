package net.bishnu.leetcode.perfectSquares;

/**
 * 279. Perfect Squares
 * https://leetcode.com/problems/perfect-squares/#/description
 * Created by karlb on 2017-07-13.
 */
public class PerfectSquares {
    public static int numSquares(int n){
        if (n < 0) return 0;
        int[] p = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = n;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, p[i - j * j] + 1);
            }
            p[i] = min;
        }
        return p[n];
    }
}
