package com.hashing;

import java.util.Arrays;

public class BasicModuloHashing {
    public static void main(String[] args) {
        basicModulo();
    }
    private static void basicModulo() {
        int a[] = {5, 1, 10, 26, 99, 11};
        int hash[] = new int[10];
        for (int i : a) {
            int index = i % 10;
            hash[index] = i;
        }
        System.out.println(Arrays.toString(hash));
    }
    private static void basicModulo2() {
        String str[] = {"Hello", "there", "eww", "ramu", "jonny"};
        int[] a = {5, 1, 10, 26, 99};
        String[] hash = new String[10];
        for (int i = 0; i < a.length; i++) {
            hash[a[i] % 10] = str[i];
        }
        System.out.println(Arrays.toString(hash));
    }
}
