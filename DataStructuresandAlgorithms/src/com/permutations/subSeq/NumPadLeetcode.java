package com.permutations.subSeq;

import java.util.ArrayList;
import java.util.List;

public class NumPadLeetcode {
    public static void main(String[] args) {
        List<String> result = numpadList("", "245");
        System.out.println(result);
        numpadListCount("", "233");
        System.out.println(count);
    }

    static void numpad(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + ", ");
            return;
        }
        int num = Integer.valueOf(up.charAt(0) + "");
        if (num <= 6) {
            int start = (num - 2) * 3;
            int end = (num - 1) * 3;
            for (int i = start; i < end; i++) {
                numpad(p + (char) ('a' + i), up.substring(1));
            }
        } else if (num == 7) {
            int start = (num - 2) * 3;
            int end = (num - 1) * 3;
            for (int i = start; i <= end; i++) {
                numpad(p + (char) ('a' + i), up.substring(1));
            }
        } else if (num == 8) {
            int start = (num - 2) * 3;
            int end = (num - 1) * 3;
            start += 1;
            for (int i = start; i <= end; i++) {
                numpad(p + (char) ('a' + i), up.substring(1));
            }
        } else {
            int start = (num - 2) * 3;
            int end = (num - 1) * 3;
            start += 1;
            end += 2;
            for (int i = start; i < end; i++) {
                numpad(p + (char) ('a' + i), up.substring(1));
            }
        }
    }

    static List<String> numpadList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        int num = Integer.valueOf(up.charAt(0) + "");
        ArrayList<String> result = new ArrayList<>();
        int start = (num - 2) * 3;
        int end = (num - 1) * 3;
        switch (num) {
            case 7: {
                end += 1;
                break;
            }
            case 8: {
                start += 1;
                end += 1;
                break;
            }
            case 9: {
                start += 1;
                end += 2;
                break;
            }
        }
        for (int i = start; i < end; i++) {
            result.addAll(numpadList(p + (char) ('a' + i), up.substring(1)));
        }
        return result;
    }

    static int count = 0;

    static void numpadListCount(String p, String up) {
        if (up.isEmpty()) {
            count++;
            return;
        }
        int num = Integer.valueOf(up.charAt(0) + "");
//        ArrayList<String> result = new ArrayList<>();
        int start = (num - 2) * 3;
        int end = (num - 1) * 3;
        switch (num) {
            case 7: {
                end += 1;
                break;
            }
            case 8: {
                start += 1;
                end += 1;
                break;
            }
            case 9: {
                start += 1;
                end += 2;
                break;
            }
        }
        for (int i = start; i < end; i++) {
            numpadListCount(p + (char) ('a' + i), up.substring(1));

        }

    }
}
