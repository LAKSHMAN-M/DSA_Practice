package com.Math;


public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }

    private static int reverse(int x) {
        boolean isNegative = x <= 0;
        x = x > 0 ? x : -1 * x;
        int ans  = 0;
        while(x > 0){
            int rem = x % 10;
            if(ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10)
                return 0;
            ans = ans * 10 + rem;
            x /= 10;
        }
        if(isNegative)
            ans = -ans;
        return ans;
    }

}
