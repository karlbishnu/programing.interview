package net.bishnu.leetcode.encodeAndDecodeTinyUrl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 535. Encode and Decode TinyURL
 * https://leetcode.com/problems/encode-and-decode-tinyurl/description/
 */
public class Codec {
    private final Map<String, String> LONG_MAP = new HashMap<>();
    private final Map<String, String> SHORT_MAP = new HashMap<>();

    private final String BASE_URL = "http://tinyurl.com/";
    private final String CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final int SHORT_LEN = 6;
    private Random random = new Random();

    public String encode(String longUrl){
        String shortUrl = LONG_MAP.get(longUrl);
        while(shortUrl==null){
            StringBuilder candidate = new StringBuilder();
            double gaussian = Math.abs(random.nextGaussian());
            for(int i=0; i<SHORT_LEN; i++){
                gaussian*=10;
                candidate.append(CHARS.charAt((int)gaussian%CHARS.length()));
            }
            if(!SHORT_MAP.containsKey(candidate.toString())){
                shortUrl = candidate.toString();
                LONG_MAP.put(longUrl, shortUrl);
                SHORT_MAP.put(shortUrl, longUrl);
            }
        }
        return BASE_URL+shortUrl;
    }


    public String decode(String shortUrl){
        if(shortUrl==null || shortUrl.length()<SHORT_LEN)   return "";
        String res = SHORT_MAP.get(shortUrl.replace(BASE_URL, ""));
        return res==null ? "" : res;
    }
}
