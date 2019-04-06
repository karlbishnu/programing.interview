package net.bishnu.codejam.foregonesolution;

/**
 * Created by karlb on 2017-03-17.
 */

import java.io.*;
import java.util.StringTokenizer;


public class Solution {
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
            out.print("Case #" + test + ": ");
            main2();
            out.print('\n');
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

    private static final int[] digits = new int[]{0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
    private static void main2() {
        String n = in.next();
        StringBuilder a = new StringBuilder(n.length());
        StringBuilder b = new StringBuilder(n.length());

        for(int i=n.length()-1, carry=0; i>=0; i--){
            int d = n.charAt(i)=='0' ? 10+carry : n.charAt(i)-'0' + carry;
            a.append(digits[d]);
            b.append(d-digits[d]);
            carry = n.charAt(i)=='0' ? -1 : 0;
        }
        trimZeroPrefix(a);
        trimZeroPrefix(b);

        out.print(a.reverse().toString() + ' ' + b.reverse().toString() );
    }

    private static void trimZeroPrefix(StringBuilder sb) {
        int count = 0;
        for(int i=sb.length()-1; i>0 && sb.charAt(i)=='0'; i--){
            count++;
        }
        sb.setLength(sb.length()-count);
    }

}
