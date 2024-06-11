package com.strings;

import java.util.regex.Pattern;

public class ReverseVowels {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        String vowels = "[aeiouAEIOU]";
        char[] ch = s.toCharArray();
        while (start < end) {
            while (start < end && !(Pattern.matches(vowels, ch[start] + ""))) {
                start++;
            }
            while (end > start && !(Pattern.matches(vowels, ch[end] + ""))) {
                end--;
            }
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String result = new String(ch);
        return result;
    }
    public static String reverseVowels2(String s) {
        String preS = "";
        String sufS = "";
        int start = 0;
        int end = s.length() - 1;
        String vowels = "[^aeiouAEIOU]";
        while(start < end){
            while(start < end && Pattern.matches(vowels, s.charAt(start)+"")){
                preS = preS + s.charAt(start);
                start++;
            }
            while(end >= start && Pattern.matches(vowels, s.charAt(end)+"")){
                sufS = s.charAt(end) + sufS;
                end--;
            }
            if(start < end){
                preS += s.charAt(end);
                sufS = s.charAt(start) + sufS;
            }
            start++;
            end--;
        }
        String res = preS + sufS;
        return res;
    }
}
