package poly;
/**
 * https://algospot.com/judge/problem/read/POLY
 */

import java.util.Scanner;

public class Main {
    private static Scanner in;
    public static void main(String[] arg){
        in = new Scanner(System.in);
        int cases = in.nextInt();
        while(cases-- > 0) {
            main2();
        }
    }

    private static void main2() {
        int p = in.nextInt();
        System.out.println(poly(p));
    }

    public static int poly(int n) {
        int res=0;
        Integer[][] memo = new Integer[n+1][n+1];
        for(int first=1; first<=n; first++){
            res = (res +  poly(n, first, memo)) % MOD;
        }
        return res;
    }

    private static int MOD = 10000000;
    public static int poly(int remaining, int upper, Integer[][] memo) {
        if(remaining==upper)    return 1;
        if(memo[remaining][upper]!=null)    return memo[remaining][upper];

        int res=0;
        int maxCurr = remaining-upper;
        for(int curr=1; curr<=maxCurr; curr++){
            res = (res + (upper+curr-1) * poly(maxCurr, curr, memo) % MOD) % MOD;
        }
        return memo[remaining][upper] = res;
    }
}
