package net.bishnu.recursive_call;

/**
 * Created by karlb on 2017-01-16.
 */
public final class StringCombination {
    private String input;
    private StringBuilder sb;

    public StringCombination(String input){
        this.input = input;
        this.sb = new StringBuilder();
    }

    public void printCombinations(){
        combine(0);
    }

    private void combine(int start) {
        for(int i=start; i<input.length();){
            String aString = String.valueOf(Character.toChars(input.codePointAt(i)));
            sb.append(aString);
            System.out.println(sb);
            combine(i+aString.length());
            sb.setLength(sb.length()-1);
            i+=aString.length();
        }
    }
}
