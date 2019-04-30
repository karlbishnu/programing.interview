package christmas;

/**
 * https://algospot.com/judge/problem/read/CHRISTMAS
 */

import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static final String NAME = "test";
    private static boolean SUBMIT = false;
    private static InputReader in;
    private static PrintWriter out;

    public static void main(String[] args) throws IOException {
        in = new InputReader(System.in);
        out = new PrintWriter(System.out, false);

        int numCases = in.nextInt();
        for (int test = 1; test <= numCases; test++) {
            main2();
            out.print('\n');
        }
        out.flush();
        out.close();
        System.exit(0);
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }

    private static void main2() {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] boxes = new int[n];
        for(int i=0; i<n; i++){
            boxes[i] = in.nextInt();
        }

        int[] pSum = calc(boxes, k);
        out.print(waysToBuy(pSum, k));
        out.print(" "+maxBuy(pSum, k));
    }

    private static int MOD = 20091101;
    static int maxBuy(int[] pSum, int k) {
        Integer[] memo = new Integer[pSum.length];
        Integer[] prev = new Integer[k];

        for(int i=0; i<pSum.length; i++){
            memo[i] = i>0 ? memo[i-1] : 0;
            Integer prevPos = prev[pSum[i]];
            if(prevPos!=null)   memo[i] = Integer.max(memo[i], memo[prevPos]+1);
            prev[pSum[i]] = i;
        }
        return memo[memo.length-1];
    }

    static int waysToBuy(int[] pSum, int k) {
        int res = 0;
        int[] counts = new int[k];
        for(int i=0; i<pSum.length; i++){
            counts[pSum[i]]++;
        }

        for(int i=0; i<counts.length; i++){
            if(counts[i]>=2){
                res = (res + (counts[i]*(counts[i]-1)) / 2) % MOD;
            }
        }
        return res;
    }

    static int[] calc(int[] boxes, int k) {
        int[] pSum = new int[boxes.length+1];
        for(int i=1; i<pSum.length; i++){
            pSum[i] = (pSum[i-1] + boxes[i-1]) % k;
        }
        return pSum;
    }
}
