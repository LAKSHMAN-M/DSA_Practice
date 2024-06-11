package com.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String t1 = "psnw";
        String t2 = "vozsh";
        LongestCommonSubsequence obj = new LongestCommonSubsequence();

        System.out.println(obj.longestCommonSubsequence(t1, t2));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        if (len2 > len1) {
            return longestCommonSubsequence(text2, text1);
        }
        Set<Character> hs = new HashSet<>();

        for(char ch : text1.toCharArray()){
            hs.add(ch);
        }

        int j = 0;

        for(j = 0 ; j < len2; j++){
            char ch = text2.charAt(j);
            if(hs.contains(ch)){
                break;
            }
        }
        int count = 0;
        for (int i = 0; i <= len1 - 1; i++) {
            char ch = text1.charAt(i);
            if (j < len2 && ch == text2.charAt(j)) {
                count++;
                j++;
            }
        }
        return count;
    }
}
