package com.arrays.problems;

import java.util.*;

public class SubarraywithgivenXOR {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int b = 6;
        System.out.println(solve(arr, b));
    }
    public static int solve(int[] a, int b) {
        // brute force
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor ^= a[i];
            int x = xor ^ b;
            if (hm.containsKey(x)) {
                count += hm.get(x);
            }
            hm.put(xor, hm.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}
