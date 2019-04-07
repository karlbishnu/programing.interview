package net.bishnu.codejam.cryptopangrams;

/**
 * Created by karlb on 2017-03-17.
 */

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;


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

    private static List<BigInteger> primes = getPrimes(new LinkedList<>(), BigInteger.valueOf(2), BigInteger.valueOf(10000));

    private static List<BigInteger> getPrimes(List<BigInteger> primes, BigInteger low, BigInteger hi) {
        BigInteger curr = low.nextProbablePrime();
        while(curr.compareTo(hi)<0){
            primes.add(curr);
            curr=curr.nextProbablePrime();
        }

        return primes;
    }

    private static void main2() {
        BigInteger N = new BigInteger(in.next());
        BigInteger[] c = getCipher(in.nextInt());
        BigInteger[] p = new BigInteger[c.length+1];
        int s= findFirstIndex(c, p, N);
        for(int i=s; i>0; i--){
            p[i-1] = c[i-1].divide(p[i]);
        }
        for(int i=s; i<p.length-1; i++){
            p[i+1] = c[i].divide(p[i]);
        }

        Map<BigInteger, Character> dict = getDict(p);
        StringBuilder ans = new StringBuilder(p.length);
        for(BigInteger num: p){
            ans.append(dict.get(num));
        }


        out.print(ans.toString());
    }

    private static int findFirstIndex(BigInteger[] c, BigInteger[] p, BigInteger n) {
        boolean theLeastPrime = n.equals(BigInteger.valueOf(101));
        int primeI = theLeastPrime ? 0 : 1;
        while(true){
            for(int i=1; i<c.length-1; i++){
                if(c[i-1].equals(c[i])) continue;
                for (int j=primeI; j < primes.size(); j++) {
                    BigInteger prime = primes.get(j);
                    if(prime.compareTo(n)>0)    break;
                    if (c[i].compareTo(prime)>0 && c[i].mod(prime).equals(BigInteger.ZERO) &&
                            c[i - 1].compareTo(prime)>0 && c[i -1].mod(prime).equals(BigInteger.ZERO)) {
                        p[i] = prime;
                        return i;
                    }
                }
            }
            primeI=primes.size();
            BigInteger low = primes.get(primes.size()-1).add(BigInteger.ONE);
            getPrimes(primes, low, low.add(BigInteger.valueOf(10000)));
        }
    }

    private static BigInteger[] getCipher(int length) {
        BigInteger[] c = new BigInteger[length];
        for(int i=0; i<length; i++){
            c[i] = new BigInteger(in.next());
        }
        return c;
    }

    private static Map<BigInteger, Character> getDict(BigInteger[] primes) {
        Map<BigInteger, Character> dict = new HashMap<>(26);
        List<BigInteger> sorted = Arrays.stream(primes).distinct().sorted().collect(Collectors.toList());
        for(int i=0; i<sorted.size(); i++){
            dict.put(sorted.get(i), (char) ('A'+i));
        }

        return dict;
    }


}
