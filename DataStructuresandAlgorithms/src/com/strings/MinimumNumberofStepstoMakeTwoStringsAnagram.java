package com.strings;


import com.Math.SqureRoot;

import java.util.HashMap;

public class MinimumNumberofStepstoMakeTwoStringsAnagram {
    public static void main(String[] args) {
        String s = "babs";
        String t = "basa";
        System.out.println(minSteps(s, t));
    }
    static int minSteps(String s, String t) {
        int steps = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for(char ch : t.toCharArray()){
            if(hm.containsKey(ch) && hm.get(ch) > 0 ){
                hm.put(ch, hm.getOrDefault(ch, 0) - 1);
            }else{
                steps++;
            }
        }
        return steps;
    }
}
