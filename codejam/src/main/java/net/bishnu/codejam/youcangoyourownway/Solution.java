package net.bishnu.codejam.youcangoyourownway;

/**
 * Created by karlb on 2017-03-17.
 */

import java.io.*;
import java.util.HashSet;
import java.util.Set;
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

    private static final int[][] dirs = new int[][]{{0,1},{1,0}};
    private static void main2() {
        int size = in.nextInt();
        String path = in.next();
        Set<Long> lidia = new HashSet<>();
        travel(lidia, 0, 0, path, 0);

        StringBuilder myPath = new StringBuilder(path.length());
        travel(myPath, size, 0, 0, lidia, new HashSet<>());
        out.print(myPath.reverse().toString());
    }

    private static boolean travel(StringBuilder myPath, int size, int i, int j, Set<Long> lidia, Set<Long> memo) {
        if(j==size-1 && i==size-1)  return true;
        long curr = getPoint(i, j);
        if(memo.contains(curr) || j==size || i==size)   return false;

        boolean visit = lidia.contains(curr);
        for(int d=0; d<dirs.length; d++){
            int x=i+dirs[d][0], y = j+dirs[d][1];
            long next = getPoint(x, y);
            if(!(visit && lidia.contains(next))){
                boolean valid = travel(myPath, size, x, y, lidia, memo);
                if(valid){
                    myPath.append(d==0 ? 'E' : 'S');
                    return true;
                }
            }
        }
        memo.add(curr);
        return false;
    }

    private static long getPoint(int i, int j){
        long newJ = j*100000;
        return newJ+i;
    }

    private static void travel(Set<Long> memo, int i, int j, String path, int index) {
        memo.add(getPoint(i,j));
        if(index == path.length())  return;

        int d = path.charAt(index)=='E' ? 0 : 1;
        travel(memo, i+dirs[d][0], j+dirs[d][1], path, index+1);
    }


}
