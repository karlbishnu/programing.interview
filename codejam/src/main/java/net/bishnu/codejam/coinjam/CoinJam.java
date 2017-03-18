package net.bishnu.codejam.coinjam;

/**
 * Created by karlb on 2017-03-17.
 * https://code.google.com/codejam/contest/6254486/dashboard#s=p2
 */

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


public class CoinJam {
    public static final String NAME = "test";
    private static boolean SUBMIT = false;
    private static InputReader in;
    private static PrintWriter out;

    public static void main(String[] args) throws IOException {
        if (SUBMIT) {
            in = new InputReader(new FileInputStream(new File(NAME + ".in")));
            out = new PrintWriter(new BufferedWriter(new FileWriter(NAME + ".out")));
        } else {
            in = new InputReader(System.in);
            out = new PrintWriter(System.out, true);
        }

        int numCases = in.nextInt();
        for (int test = 1; test <= numCases; test++) {
            out.print("Case #" + test + ":\n");
            main2();
        }

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
        String input = in.next();
        String[] inputs = input.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int j = Integer.parseInt(inputs[1]);

        Map<String, List<String>> map = new HashMap<>();
        while(map.size() < j){
            for(int i=1; i<n-1; i++){
                //String curr = String.format()
            }
        }

        for(String key: map.keySet()){
            out.print(key+" ");
            for(String e: map.get(key)){
                out.print(e+" ");
            }
            out.println();
        }
    }

    private boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
