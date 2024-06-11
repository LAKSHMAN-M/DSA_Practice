package com.hashing;//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution {
    public static void main(String[] args) {
        System.out.println(hashString("aA1 b"));
    }
    static long hashString(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        String str = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0 ; i < str.length(); i++){
            hm.put(str.charAt(i), i);
        }
        String[] sArray = s.split(" ");
        int len = s.split(" ").length;
        long ans = 0;
        for(int i = 0 ; i < len; i++){
           ans += cip(hm, sArray[i]);
        }
        ans = ans * len;
        return ans;
        
    }
    static long cip(HashMap<Character, Integer> hm, String str){
        long cIndexNPosition = 0;
        for(int i = 0 ; i < str.length(); i++){
            cIndexNPosition += i + hm.get(str.charAt(i));
        }
        return cIndexNPosition;
    }
}
