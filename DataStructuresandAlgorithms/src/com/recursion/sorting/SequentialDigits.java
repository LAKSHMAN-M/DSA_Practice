package com.recursion.sorting;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        System.out.println(sequentialDigits(low, high));
    }

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        while (low < high) {
            int lastDigit = low % 10;
            int firstDigit = getFirstDigit(low);
            if (lastDigit <= 9) {
                low = getSequence(firstDigit, high, 0);
            } else {
                low = getSequence(1, high, 0);
            }
            list.add(low);
        }
        return list;
    }

    private static int getFirstDigit(int num) {
        while (num > 9) {
            num /= 10;
        }
        return num;
    }


    static int getSequence(int p, int high, int ans) {
        if (p < high) {
            ans = p;
            int low = p * 10;
            return getSequence(low + (p % 10) + 1, high, ans);
        }else{
            return ans;
        }
    }
}