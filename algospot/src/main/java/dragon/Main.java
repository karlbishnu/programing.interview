package dragon;
/**
 * https://algospot.com/judge/problem/read/DRAGON
 */

import java.util.Scanner;

public class Main {
    private static Scanner in;
    public static void main(String[] arg){
        in = new Scanner(System.in);
        int cases = in.nextInt();
        while(cases-- > 0) {
            main2();
        }
    }

    private static void main2() {
        int g = in.nextInt();
        int p = in.nextInt();
        int l = in.nextInt();
        System.out.println(curve(g, p, l));
    }

    private static int[] lengths = preCalc();

    private static final int MAX = 1000000000 + 1;
    private static int[] preCalc() {
        int[] res = new int[51];
        res[0] = 1;
        for(int i=1; i<res.length; i++){
            res[i] = Integer.min(res[i-1]*2 + 2, MAX);
        }
        return res;
    }

    public static String curve(int generation, int p, int l){
        StringBuilder sb = new StringBuilder(l);
        for(int i=p-1; i<p+l-1; i++){
            sb.append(curve2("FX", generation, i));
        }
        return sb.toString();
    }

    private static char curve2(String seed, int generation, int skip) {
        if(generation==0){
            return seed.charAt(skip);
        }

        for(int i=0; i<seed.length(); i++){
            if(seed.charAt(i)=='X' || seed.charAt(i)=='Y'){
                if(skip>=lengths[generation]){
                    skip-=lengths[generation];
                }else if(seed.charAt(i)=='X'){
                    return curve2("X+YF", generation-1, skip);
                }
                else{
                    return curve2("FX-Y", generation-1, skip);
                }
            }else if(skip>0)    skip--;
            else return seed.charAt(i);
        }

        return '#';
    }

    private static StringBuilder curve(String seed, int generation, StringBuilder sb) {
        if(generation==0)   return sb.append(seed);

        for(int i=0; i<seed.length(); i++){
            if(seed.charAt(i)=='X'){
                curve("X+YF", generation-1, sb);
            }
            else if(seed.charAt(i)=='Y'){
                curve("FX+Y", generation-1, sb);
            }else sb.append(seed.charAt(i));
        }

        return sb;
    }
}
