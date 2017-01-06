package net.bishnu.recursive_call;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by karlb on 2017-01-06.
 */
public final class StringPermutation {
    private StringPermutation(){}

    public static List<String> getStringPermutation(String input){
        List<String> permutation = new LinkedList<>();
        permutation.add(input);

        setStringPermutation(input, permutation, 0);

        return permutation;
    }

    private static void setStringPermutation(String input, List<String> permutation, int startIndex) {
        for(int i=startIndex; i<input.length(); i++){
            for(int j=i+1; j<input.length(); j++){
                String swappedString = swapChars(input, i, j);
                permutation.add(swappedString);
                setStringPermutation(swappedString, permutation, i+1);
            }
        }

    }

    static String swapChars(String input, int i, int j) {
        int smallerIndex;
        int biggerIndex;

        if(i<j){
            smallerIndex = i;
            biggerIndex = j;
        }else if(i==j){
            return new String (input);
        }else{
            smallerIndex = j;
            biggerIndex = i;
        }

        if(Character.isLowSurrogate(input.charAt(smallerIndex))){
            smallerIndex--;
        }

        if(Character.isLowSurrogate(input.charAt(biggerIndex))){
            biggerIndex--;
        }
        StringBuilder sb = new StringBuilder(input.substring(0, smallerIndex));
        sb.appendCodePoint(input.codePointAt(biggerIndex));
        if(biggerIndex-smallerIndex > 1){
            sb.append(input.substring(smallerIndex+Character.charCount(input.codePointAt(smallerIndex)), biggerIndex));
        }
        sb.appendCodePoint(input.codePointAt(smallerIndex));
        if(biggerIndex < input.length()-1){
            sb.append(input.substring(biggerIndex+Character.charCount(input.codePointAt(biggerIndex))));
        }
        return sb.toString();
    }
}
