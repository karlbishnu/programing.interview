package net.bishnu.kakao.first2017.round1.no2;

/**
 * http://tech.kakao.com/2017/09/27/kakao-blind-recruitment-round-1/
 */
public class Dart {
    public static int sum(String dart){
        int sum = 0;
        int accIndex = 0;
        String[] splited = dart.split("[SDT]");
        int[] scores = new int[splited.length];
        int[] exponents = new int[splited.length];
        int[] bonuses = new int[splited.length];

        for(int i=0; i<splited.length; i++){
            String score = splited[i].replaceAll("[^0-9]", "");
            if(score.isEmpty())    continue;
            scores[i] = Integer.parseInt(score);

            accIndex+= splited[i].length();
            char exponent =  dart.charAt(accIndex);
            if(exponent == 'S'){
                exponents[i] = 1;
            }else if(exponent == 'D'){
                exponents[i] = 2;
            }else if(exponent == 'T'){
                exponents[i] = 3;
            }

            char bonus = dart.charAt(++accIndex >= dart.length() ?  dart.length()-1: accIndex);
            if(bonus=='*'){
                bonuses[i] = 2;
                if(i>0) bonuses[i-1] *= 2;
            }else if(bonus=='#'){
                bonuses[i] = -1;
            }else{
                bonuses[i] = 1;
            }
        }

        for(int i=0; i<splited.length; i++){
            sum += Math.pow(scores[i], exponents[i]) * bonuses[i];
        }

        return sum;
    }
}
