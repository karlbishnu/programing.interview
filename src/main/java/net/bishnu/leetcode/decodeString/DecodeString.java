package net.bishnu.leetcode.decodeString;

/**
 * 394. Decode String
 * https://leetcode.com/problems/decode-string/#/description
 * Created by karlb on 2017-03-29.
 */
public class DecodeString {
    public String decodeString(String s) {
        StringBuilder orgSb = new StringBuilder(s);
        StringBuilder sb = new StringBuilder();
        int lastBracketStart, lastRepeatCountStart;

        while((lastBracketStart = orgSb.lastIndexOf("[")) != -1){
            int lastBracketEnd = orgSb.indexOf("]", lastBracketStart);
            lastRepeatCountStart = lastBracketStart-1;
            char aChar = orgSb.charAt(lastRepeatCountStart);

            while(aChar>='0' && aChar<='9' && lastRepeatCountStart>0){
                aChar = orgSb.charAt(--lastRepeatCountStart);
            }
            lastRepeatCountStart += lastRepeatCountStart<=0 ? 0 : 1;
            int repeatCount = Integer.parseInt(orgSb.substring(lastRepeatCountStart, lastBracketStart));
            String subString = orgSb.substring(lastBracketStart+1, lastBracketEnd);

            for(int i=0; i<repeatCount; i++){
                sb.append(subString);
            }
            orgSb.replace(lastRepeatCountStart, lastBracketEnd+1, sb.toString());
            sb.setLength(0);

        }

        return orgSb.toString();
    }
}
