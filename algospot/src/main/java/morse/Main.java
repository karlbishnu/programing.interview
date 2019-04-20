package morse;
/**
 * https://algospot.com/judge/problem/read/MORSE
 */

import java.util.Scanner;

public class Main {
    private static Scanner in;
    public static void main(String[] arg){
        clacBino();
        in = new Scanner(System.in);
        int cases = in.nextInt();
        while(cases-- > 0) {
            main2();
        }
    }

    private static void main2() {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        System.out.println(morse(n, m, k));
    }

    private static int MAX = 1000000100;
    private static final int[][] bino = new int[201][201];
    static void clacBino() {
        for(int i=0; i<=200; i++){
            bino[i][0] = bino[i][i] = 1;
            for(int j=1; j<i; j++){
                bino[i][j] = Integer.min(MAX, bino[i-1][j-1] + bino[i-1][j]);
            }
        }
    }

    public static String morse(int n, int m, int k) {
        //morse(n,m,k-1, new StringBuilder());
        return morse2(n, m, k-1, new StringBuilder());
    }

    private static String morse2(int n, int m, int k, StringBuilder sb) {
        if(n<=0){
            for(int i=0; i<m; i++) sb.append('o');
            return sb.toString();
        }
        if(bino[n+m-1][n-1]>k)  return morse2(n-1, m, k, sb.append('-'));
        return morse2(n, m-1, k-bino[n+m-1][n-1], sb.append('o'));
    }

    private static int morse(int n, int m, int k, StringBuilder sb) {
        if(k<0) return k;
        if(n==0 && m==0){
            if(k==0)    System.out.println(sb.toString());
            return k-1;
        }

        if(bino[n+m][n]<=k){
            return k-bino[n+m][n];
        }

        if(n>0) {
            k = morse(n-1, m, k, sb.append('-'));
            sb.setLength(sb.length()-1);
        }
        if(m>0){
            k = morse(n, m-1, k, sb.append('o'));
            sb.setLength(sb.length()-1);
        }

        return k;
    }
}
