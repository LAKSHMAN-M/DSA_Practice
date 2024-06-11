package com.arrays.problems;

import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        Solution4 obj = new Solution4();
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int[nums.length], suff = new int[nums.length];
        pref[0] = 1;
        suff[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] * nums[i - 1];
            suff[nums.length - i - 1] = suff[nums.length - i] * nums[nums.length - i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = pref[i] * suff[i];
        }
        return nums;
    }
}
