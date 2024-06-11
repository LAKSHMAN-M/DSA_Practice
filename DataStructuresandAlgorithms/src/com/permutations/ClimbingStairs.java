package com.permutations;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
//        climbingStairs(0, n);
        System.out.println(climbingStairs2(0, n));

    }


    static void climbingStairs(long p, int n) {
        if (n <= 0) {
            System.out.println(1);
            return;
        }
        if (n >= 1) {
            climbingStairs(p + 1, n - 1);
        }
        if (n >= 2) {
            climbingStairs(p + 2, n - 2);
        }
    }
    static int climbingStairs2(long p, int n) {
        if (n <= 0) {
            return 1;
        }
        int count = 0;
        if (n >= 1) {
            count += climbingStairs2(p + 1, n - 1);
        }
        if (n >= 2) {
            count += climbingStairs2(p + 2, n - 2);
        }
        return count;
    }

}
