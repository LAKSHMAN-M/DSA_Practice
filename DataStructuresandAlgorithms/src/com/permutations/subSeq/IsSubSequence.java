package com.permutations.subSeq;

public class IsSubSequence {
    public static void main(String[] args) {
        String s = "fesfewahexbegd";
        String t = "ahexbegd";
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }
        int i = 0, j = 0;
        int tLen = t.length(), sLen = s.length();
        while(j < tLen){
            if(i < sLen && s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i == sLen){
            return true;
        }
        return false;
    }
}
