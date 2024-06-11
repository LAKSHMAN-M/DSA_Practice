package com.strings;

import java.util.Arrays;

public class ReverseOfString {
    public static void main(String[] args) {
        String str = "  hello world ";
        String res = "";
        int i = 0;
        int st = 0;
        while (i < str.length()) {
            while (i < str.length() && str.charAt(i) != ' ') {
                i++;
            }

            res = str.substring(st, i) + " " + res;

            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }
            st = i;
        }
        System.out.println(res);
    }
}
