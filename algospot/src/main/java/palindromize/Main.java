package palindromize;

/**
 * https://algospot.com/judge/problem/read/PALINDROMIZE
 */

import java.io.*;

public class Main {
    private static BufferedReader in;
    private static PrintWriter out;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out, true);

        int numCases = Integer.parseInt(in.readLine());
        for (int test = 1; test <= numCases; test++) {
            main2();
            if(test<numCases)   out.print('\n');
        }
        out.close();
        System.exit(0);
    }

    private static void main2() throws IOException {
        String s = in.readLine();
        out.print(s.length()*2-palindromize(s));
    }

    static int palindromize(String s) {
        char[] rev = new StringBuilder(s).reverse().toString().toCharArray();
        return maxOverlap(s.toCharArray(), rev);
    }

    static int maxOverlap(char[] s, char[] rev) {
        int[] pi = getPi(rev);
        int max=0, j = 0;
        for(int i=0; i<s.length; i++){
            while(j>0 && s[i]!=rev[j]){
                max = 0;
                j=pi[j-1];
            }
            if(s[i]==rev[j]){
                max = Integer.max(max, ++j);
            }
        }
        return j;
    }

    static int[] getPi(char[] s) {
        int[] pi = new int[s.length];
        for(int i=1, j=0; i<s.length; i++){
            while(j>0 && s[i]!=s[j]){
                j = pi[j-1];
            }
            if(s[i]==s[j]){
                pi[i]=++j;
            }
        }
        return pi;
    }
}
