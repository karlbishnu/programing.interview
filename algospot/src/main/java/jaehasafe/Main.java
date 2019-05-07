package jaehasafe;

/**
 * https://algospot.com/judge/problem/read/JAEHASAFE
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static BufferedReader in;
    private static PrintWriter out;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out, false);

        int numCases = Integer.parseInt(in.readLine());
        for (int test = 1; test <= numCases; test++) {
            main2();
            if(test<numCases)   out.print('\n');
        }
        out.close();
        System.exit(0);
    }

    private static void main2() throws IOException {
        int step = Integer.parseInt(in.readLine());
        int count = 0;
        String curr = in.readLine();
        for(int i=0; i<step; i++){
            String next = in.readLine();
            count += i%2==0 ? shift(curr, next) : shift(next, curr);
            curr=next;
        }
        out.print(count);

    }

    static int shift(String curr, String next) {
        List<Integer> list = kmp(next+next, curr);
        return list.get(0);
    }

    static List<Integer> kmp(String s, String p) {
        return kmp(s.toCharArray(), p.toCharArray());
    }

    static List<Integer> kmp(char[] s, char[] p) {
        List<Integer> list = new LinkedList<>();
        int[] pi = getPi(p);
        for(int i=0, j = 0; i<s.length; i++){
            while(j>0 && s[i]!=p[j]){
                j=pi[j-1];
            }
            if(s[i]==p[j]){
                if(j==p.length-1){
                    list.add(i-j);
                    j=pi[j];
                }else{
                    j++;
                }
            }
        }
        return list;
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
