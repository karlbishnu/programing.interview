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

    static int count = 0;
    private static void main2() {
        count = 0;
        String input = in.next();
        StringBuilder pancakes = new StringBuilder(input);

        search(pancakes);

        out.print(count);
    }

    private static String search(StringBuilder pancakes) {
        char e = pancakes.charAt(pancakes.length()-1);
        char s = pancakes.charAt(0);

        if(e == '-' && s == '-'){
            pancakes = reverse(pancakes, pancakes.length()-1);
        }else if(e=='-' && s=='+'){
            pancakes = reverse(pancakes, pancakes.lastIndexOf("+"));
        }
        int bottom = pancakes.lastIndexOf("-");
        if(bottom != -1){
            String subPancakes = search(new StringBuilder(pancakes.substring(0, bottom+1)));
            pancakes.replace(0, subPancakes.length(), subPancakes);
        }
        return pancakes.toString();
    }

    private static StringBuilder reverse(StringBuilder pancakes, int bottom){
        for(int i=0; i<=bottom; i++){
            pancakes.setCharAt(i, pancakes.charAt(i)=='+' ? '-' : '+');
        }
        count++;
        return pancakes;
    }

}
