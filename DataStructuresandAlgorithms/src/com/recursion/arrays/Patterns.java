package com.recursion.arrays;

public class Patterns {
    static void pattern1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            pattern1(r, c + 1);
        } else {
            System.out.println();
            pattern1(r - 1, 0);
        }
    }

    static void pattern2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            pattern2(r, c + 1);
            System.out.print("* ");
        } else {
            pattern2(r - 1, 0);
            System.out.println();
        }
    }

    static void pattern3(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            pattern3(r, c + 1);
            System.out.print("* ");
        } else {
            System.out.println();
            pattern3(r - 1, 0);
            System.out.println();
        }
    }

    static void pattern4(int n, int spaces) {
        if (n < 0) {
            return;
        }
        for (int i = 1; i <= spaces; i++) {
            System.out.print("  ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern4(n - 1, spaces + 1);
    }

    public static void main(String[] args) {
        pattern3(4, 0);
    }
}
