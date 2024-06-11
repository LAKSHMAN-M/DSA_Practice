package com.recursion;

import java.util.*;

public class PalindromePartioning {
    public static void main(String[] args) {
        PalindromePartioning obj = new PalindromePartioning();
        List<List<String>> res = obj.partition("aab");
        for (List<String> list : res) {
            System.out.println(list);
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> palindromes = new ArrayList<>();
        backtrack(0, s.length(), new StringBuilder(s), palindromes, res);
        return res;
    }

    private void backtrack(int start, int size, StringBuilder sb, List<String> palindromes, List<List<String>> res) {
        if (start >= size) {
            res.add(new ArrayList<>(palindromes));
            return;
        }
        for (int i = start; i < sb.length(); i++) {
            if (isPalindrome(sb, start, i)) {
                String str = sb.substring(start, i + 1);
                palindromes.add(str);
                backtrack(i + 1, size, sb, palindromes, res);
                palindromes.remove(palindromes.size() - 1);
            }
        }
    }

    private boolean isPalindrome(StringBuilder sb, int start, int end) {
        while (start < end) {
            if (sb.charAt(start) != sb.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
