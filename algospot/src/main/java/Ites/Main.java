package Ites;

/**
 * https://algospot.com/judge/problem/read/ITES
 */

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
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
        int k = in.nextInt();
        int n = in.nextInt();

        out.print(ites(k, n));
    }

    static int ites(int k, int n) {
        int res = 0;
        Deque<Integer> q = new LinkedList<>();
        long signal = 0;
        int sum=0;
        for(int right=0; right<=n; right++){
            signal = next(signal);
            int input = (int)(signal%10000) +1;
            sum += input;
            q.add(input);
            sum = renewSum(q, sum, k);
            if(sum!=0 && sum%k==0)    res++;
        }
        return res;
    }

    private static int renewSum(Deque<Integer> q, int sum, int k) {
        while(!q.isEmpty() && sum>k){
            sum-=q.poll();
        }
        return sum;
    }

    static long next(long signal) {
        if(signal==0)   return 1983;
        return ((signal*214013L + 2531011L) % (1L<<32));
    }


}
