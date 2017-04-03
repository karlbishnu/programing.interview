package net.bishnu.codejam.fractiles;

/**
 * Created by karlb on 2017-03-17.
 */

import java.io.*;
import java.util.StringTokenizer;


public class Fractiles {
    public static final String NAME = "D-small-practice";
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
        int k = in.nextInt(), c = in.nextInt(), s = in.nextInt();

        if(s<k) {
            out.print("IMPOSSIBLE");
            return;
        }

        StringBuilder sb = new StringBuilder("1")
                .append(" ");

        long distance = 0;
        for(int j=c-1; j>=0; j--){
            distance += Math.pow(k, j);
        }

        long tile = 1;
        for(int i=1; i<s; i++){
            sb.append(tile+=distance)
                    .append(" ");
        }
        sb.setLength(sb.length()-1);
        out.print(sb.toString());
    }

}
