package net.bishnu.kakao.first2017.round1.no1;

/**
 * http://tech.kakao.com/2017/09/27/kakao-blind-recruitment-round-1/
 */
public class SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2){
        String[] result = new String[arr1.length];
        for(int i=0; i<arr1.length; i++){
            int buf = arr1[i] | arr2[i];

            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append((buf & (1<<j))!=0 ? '#' : ' ');
            }
            result[i] = sb.reverse().toString();
        }

        return result;
    }
}
