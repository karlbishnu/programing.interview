package net.bishnu.codejam;

/**
 * Created by karlb on 2017-03-17.
 */

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class CountingSheep {
    public static final String NAME = "A-small-practice";
    private static boolean SUBMIT = true;
    private static InputReader in;
    private static PrintWriter out;

    public static void main(String[] args) throws IOException {
        if (SUBMIT) {
            in = new InputReader(new FileInputStream(new File(NAME + ".in")));
            out = new PrintWriter(new BufferedWriter(new FileWriter(NAME + ".out")));
        } else {            in = new InputReader(System.in);
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
        Set<Integer> set = new HashSet<Integer>();

        int input = in.nextInt();
        if(input == 0) {
            out.print("INSOMNIA");
            return;
        }
        int m = input, curr = input;
        int i = 1;
        while(m >= 0){
            set.add(m%10);
            if(set.size() == 10){
                out.print(curr);
                break;
            }

            if(m<10){
                m = curr = input * ++i;
            }else{
                m /= 10;
            }
        }
    }

}
