package com.recursion.arrays;

public class CountGoodNumbers {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(4));
    }

    public static int MOD = 1_00_00_00_000 + 7;

    public static int countGoodNumbers(long n) {

        long even = (n / 2) + (n % 2);
        even = pow(5, even);
        long odd = n / 2;
        odd = pow(4, odd);
        return (int) ((even * odd) % MOD);
    }

    static long pow(int base, long exp) {
        if (exp == 0) {
            return 1;
        }
        long ans = pow(base, exp / 2);
        ans = (ans * ans) % MOD;
        if (exp % 2 == 1) {
            ans = (ans * base) % MOD;
        }
        return ans;
    }

//    public static int countGoodNumbers(long n) {  // Return long for potential large values
//        long even = n / 2 + n % 2;
//        long odd = n / 2;
//        even = pow(5, even);
//        odd = pow(4, odd);
//        return (int) (even * odd) % (1000000000 + 7);
//    }

//    static long pow(int base, long exp) {  // Use long for result and modulo after each multiplication
//        if (exp == 1) {
//            return base;
//        }
//        long ans = pow(base, exp / 2);
//        ans = (ans * ans) % (1000000000 + 7);
//        if (exp % 2 == 1) {
//            ans = (ans * base) % (1000000000 + 7);
//        }
//        return ans;  // No need for cast
//    }
}
