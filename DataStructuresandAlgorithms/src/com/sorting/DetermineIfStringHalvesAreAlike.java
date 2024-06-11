package com.sorting;

import java.util.regex.Pattern;

// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/?envType=daily-question&envId=2024-01-12
public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String str = "Aeioue";
        String str1 = str.substring(0, str.length() / 2);
        String str2 = str.substring( str.length() / 2, str.length());
        int count = 0;
        for(char ch : str.toCharArray()){
            String s = ch+"";
            if(Pattern.matches("[aeiouAEIOU]", s)){
                count++;
            }
        }
        System.out.println(count);
    }
}
