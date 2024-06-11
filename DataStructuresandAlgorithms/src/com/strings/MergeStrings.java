package com.strings;

public class MergeStrings {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int s1 = 0, s2 = 0; //starting index of both strings
        String res = "";
        while (s1 < len1 && s2 < len2) {
            res += word1.charAt(s1);
            res += word2.charAt(s2);
            s1++;
            s2++;
        }
        while (s1 < len1) {
            res += word1.charAt(s1);
            s1++;
        }
        while (s2 < len2) {
            res += word2.charAt(s2);
            s2++;
        }
        return res;
    }

}
