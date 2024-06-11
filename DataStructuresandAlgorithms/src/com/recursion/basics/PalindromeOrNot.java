package com.recursion.basics;

public class PalindromeOrNot {
    public static void main(String[] args) {
        PalindromeOrNot obj = new PalindromeOrNot();
        String str = "12&&**racecar21";
        System.out.println(obj.palindrome2(str));


    }

    public boolean palindrome(String str, int l, int r) {
        if (l >= r) return true;
        if (str.charAt(l) == str.charAt(r)) return palindrome(str, l + 1, r - 1);
        return false;
    }

    public boolean palindrome2(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return helper(str);
    }
    public boolean helper(String str){
        if(str.length() <= 1) return true;
        if(str.charAt(0) == str.charAt(str.length() - 1)){
            return helper(str.substring(1, str.length() - 1));
        }else{
            return false;
        }
    }
}

