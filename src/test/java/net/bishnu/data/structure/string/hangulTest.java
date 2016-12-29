package net.bishnu.data.structure.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by karlb on 2016-12-26.
 */
public class hangulTest {
    @Test
    public void printHangulMorphemesAndVowelsAsUtf8Encoded() throws UnsupportedEncodingException {
        String[] MorphemesAndVowels = {"ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄸ",
                "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ",
                "ㅁ", "ㅂ", "ㅃ","ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ",
                "ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ","ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ",
                "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ"};
        for(String s: MorphemesAndVowels){
            print(s);
        }
    }

    private void print(String str) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        sb.append(str)
                .append(" :")
                .append(bytesToHex(str.getBytes("utf-8")));
        System.out.println(sb.toString());
    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
