package com.recursion.arrays;

import java.util.regex.Pattern;

public class Atoi {
    public static void main(String[] args) {
        String s = "-+12";
        System.out.println(myAtoi3(s));
    }

    public static int myAtoi(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        String res = helper("", s.substring(i));
        if (res.isEmpty()) {
            return 0;
        }
        int ans = 0;
        boolean isNegative = false;
        i = 0;
        if (res.charAt(0) == '-') {
            isNegative = true;
            i++;
        } else if (res.charAt(0) == '+') {
            i++;
        }
        res = res.substring(i);
        for (char c : res.toCharArray()) {
            if (!Character.isDigit(c)) {
                break;  // Stop at non-digit characters
            }
            // Check for overflow before each multiplication
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && c - '0' > 7)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + (c - '0');
        }
        if (isNegative) {
            return -ans;
        }
        return ans;

    }

    static String helper(String p, String up) {
        if (up.isEmpty() || isLetter(up.charAt(0))) {
            return p;
        }

        char c = up.charAt(0);
        if (c == '+' || c == '-' || (c >= 48 && c <= 57)) {
            return helper(p + c, up.substring(1));
        }
        return p;
    }

    private static boolean isLetter(char c) {
        if (c == ' ' || c == '.') {
            return true;
        }
        if ((c != '+' && c != '-')) {
            boolean flag = Pattern.matches("[^a-zA-Z0-9]", c + "");
            if (flag) {
                return true;
            }
        }
        return false;
    }

    public static int myAtoi2(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int ans = 0, i = 0;
        boolean neg = s.charAt(0) == '-';
        boolean pos = s.charAt(0) == '+';
        if (neg || pos) {
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            i++;
        }
        return neg ? -ans : ans;
    }
    public static int myAtoi3(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        int ans = 0, i = 0;
        boolean isNeg = false;
        if(s.charAt(i) == '-'){
            isNeg = true;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int temp = s.charAt(i) - '0';
            if(ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && temp > 7)){
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans*10 + temp;
            i++;
        }
        return isNeg ? -ans : ans;
    }
}
