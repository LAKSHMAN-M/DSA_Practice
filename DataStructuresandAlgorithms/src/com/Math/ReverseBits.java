package com.Math;

public class ReverseBits {
    public static void main(String[] args) {
       int n = Integer.parseInt("11111111111111111111111111111101", 2);
        System.out.println(n);
    }

    static int reverseBits(int n){
        if(n == 0) return 0;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if((n & 1) == 0) result++;
            n >>= 1;
        }
        return result;
    }
}
