package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxLenOfSubStringWithoutCharReapted {
    public static void main(String[] args) {
        String str = "bbbbb";
        MaxLenOfSubStringWithoutCharReapted obj = new MaxLenOfSubStringWithoutCharReapted();
        System.out.println(obj.lengthOfLongestSubstring(str));
    }
    static int solution(String str, int len){
        // Intuition is simple take a hashmap(hashtable)if the currentCharacter is not present in map then add char with its index
        // if hashtable contains the character means we have a repeated character so set the start to current index
        // each time when you add a character take maxLen(initially at 0) as max(maxLen, end - start + 1)
        // as we are starting from 0 zero index we have added one to the maxLen
        int maxLen = 0;
        Map<Character, Integer> hm = new HashMap<>();
        int start = 0;
        for (int end = 0; end < len ; end++) {
            char currentChar = str.charAt(end);
            if(hm.containsKey(currentChar)){
                start = Math.max(start, hm.getOrDefault(currentChar, 0) + 1);
            }
            hm.put(currentChar, end);
            int currentlen = (end - start) + 1;
            maxLen = Math.max(maxLen, currentlen);
        }
        return maxLen;
    }
    public int lengthOfLongestSubstring(String str) {
        int len = str.length();
        int maxLen = 0;
        Map<Character, Integer> hm = new HashMap<>();
        int start = 0;

        for (int end = 0; end < len; end++) {
            char currentChar = str.charAt(end);
            if (hm.containsKey(currentChar)) {
                start = Math.max(start, hm.get(currentChar) + 1); // Prevent out-of-bounds issue
            }
            hm.put(currentChar, end);
            maxLen = Math.max(maxLen, end - start + 1); // Simplified calculation
        }

        return maxLen;
    }
}
