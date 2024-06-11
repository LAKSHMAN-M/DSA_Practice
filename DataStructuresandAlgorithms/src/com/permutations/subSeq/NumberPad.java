package com.permutations.subSeq;

import java.util.ArrayList;
import java.util.List;

public class NumberPad {
    public static void main(String[] args) {
        List<String> ans = numpadList("", "12");
        System.out.println(ans);
    }

    static void numpad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int num = Integer.valueOf(up.charAt(0) + "");
        int start = (num - 1) * 3;
        int end = num * 3;
        for (int i = start; i < end; i++) {
            numpad(p + (char)('a' + i), up.substring(1));
        }
    }
    static List<String> numpadList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        int num = Integer.valueOf(up.charAt(0) + "");
        int start = (num - 1) * 3;
        int end = num * 3;

        ArrayList<String> result = new ArrayList<>();

        for (int i = start; i < end; i++) {
            result.addAll(numpadList(p + (char)('a' + i), up.substring(1)));
        }
        return result;
    }

}
