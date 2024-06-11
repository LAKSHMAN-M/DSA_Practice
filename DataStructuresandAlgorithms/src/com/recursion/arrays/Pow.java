package com.recursion.arrays;

public class Pow {
    public static void main(String[] args) {
        int n = -2;
        double x = -10.00000;
        double ans2 = pow(x, n);
        if (n < 0) {
            n = -n;
            System.out.println(1 / ans2);
        } else {
            System.out.println(ans2);
        }
    }

    static double pow(double b, int exp) {
        if (exp == 0) {
            return 1;
        }
        double ans = pow(b, exp / 2);
        ans *= ans;
        if (exp % 2 != 0) {
            ans *= b;
        }
        return ans;
    }
}
