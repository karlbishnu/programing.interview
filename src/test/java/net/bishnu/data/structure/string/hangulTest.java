package net.bishnu.data.structure.string;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by karlb on 2016-12-26.
 */
public class hangulTest {
    @Test
    public void printModernHangulConsonantsAndVowelsAsUtf8Encoded() throws UnsupportedEncodingException {
        String[] ConsonantsAndVowels = {"ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄸ",
                "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ",
                "ㅁ", "ㅂ", "ㅃ","ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ",
                "ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ","ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ",
                "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ"};
        for(String s: ConsonantsAndVowels){
            print(s);
        }
    }

    @Test
    public void printUtf8CharactersBetweenTheEndOfTheVowelAndTheBeginningOfTheMorphemeOfModernHangul() throws UnsupportedEncodingException {
        byte[] start = "ㅣ".getBytes("utf-8");
        byte[] end = "가".getBytes("utf-8");
        int startIndex = Integer.parseInt(bytesToHex(start), 16)+1;
        int endIndex = Integer.parseInt(bytesToHex(end), 16);

        Assert.assertEquals(14910884, startIndex);
        Assert.assertEquals(15380608, endIndex);

        for(int i=startIndex; i<endIndex; i++){
            print(new String(intToByteArray(i), "utf8"));
        }
    }

    public static final byte[] intToByteArray(int value) {
        return new byte[] {
                (byte)(value >>> 16),
                (byte)(value >>> 8),
                (byte)value};
    }

    private void print(String str) throws UnsupportedEncodingException {
        if(str.startsWith("�")) return;
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
