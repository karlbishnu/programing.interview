package net.bishnu.codejam.revengeOfThePancakes;

/**
 * Created by karlb on 2017-03-17.
 * https://code.google.com/codejam/contest/6254486/dashboard#s=p1
 */

import java.io.*;
import java.util.StringTokenizer;


public class RevengeOfThePancakes {
    public static final String NAME = "B-large-practice";
    private static boolean SUBMIT = true;
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
            out.print("Case #" + test + ": ");
            main2();
            out.println();
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
        int count = 0;
        String input = in.next();
        StringBuilder sb = new StringBuilder(input);

        char blank = '-';
        while(sb.length() != 0){
            int lastBlank = sb.lastIndexOf(String.valueOf(blank));
            if(lastBlank != -1){
                sb.setLength(lastBlank+1);
                count++;
                blank = blank=='-' ? '+' : '-';
            }else{
                sb.setLength(0);
            }
        }

        out.print(count);
    }

}
