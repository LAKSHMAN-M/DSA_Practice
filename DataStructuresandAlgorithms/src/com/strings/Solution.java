package com.strings;
import java.util.*;
class Solution {
    public List<String> commonChars(String[] words) {
        // if(words.length == 1) return words.toCharArray();
        Map<Character, Integer> firstWordCount = getCount(words[0]);
        for(int i = 1; i<words.length;i++){
            Map<Character, Integer> wordCount = getCount(words[i]);
            for(int j=0;j<words[0].length(); j++){
                char ch = words[0].charAt(j);
                int minOfBothStrings = Math.min(firstWordCount.get(ch), wordCount.getOrDefault(ch, 0));
                firstWordCount.put(ch, minOfBothStrings);
            }
        }
        List<String> res = new ArrayList<>();

        for(Map.Entry<Character, Integer> entry : firstWordCount.entrySet()){
            for (int i = 0; i < entry.getValue(); i++) {
                res.add(entry.getKey()+"");
            }
        }
        return res;
    }

    private Map<Character, Integer> getCount(String str){
        Map<Character, Integer> hs = new HashMap<>();
        for(char ch: str.toCharArray()){
            hs.put(ch, hs.getOrDefault(ch, 0)+ 1);
        }
        return hs;
    }

    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        Solution obj = new Solution();
        System.out.println(obj.commonChars(words));
    }
}