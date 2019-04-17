package coins;
/**
 * https://algospot.com/judge/problem/read/COINS
 */

import java.util.Arrays;
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
        int m = in.nextInt();
        int c = in.nextInt();
        int[] coins = new int[c];
        for(int i=0; i<c; i++){
            coins[i] = in.nextInt();
        }
        Arrays.sort(coins);
        System.out.println(coinChange(m, coins));
    }

    private static int MOD = 1000000007;
    public static int coinChange(int m, int[] coins) {
        Integer[] memo = new Integer[m+1];
        memo[0]=1;
        for(int i=0; i<coins.length; i++){
            for(int j=coins[i]; j<=m; j++) {
                memo[j] = ((memo[j]==null ? 0 :memo[j]) + dp(j-coins[i], coins, i, memo)) % MOD;
            }
        }
        return memo[m];
    }

    private static int dp(int m, int[] coins, int index, Integer[] memo){
        if(m < 0)    return 0;
        if(memo[m] != null) return memo[m];

        return dp(m-coins[index], coins, index, memo);
    }
}
