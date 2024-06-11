package com.arrays.problems;

//https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(Integer.toBinaryString(102));
//        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = Integer.MIN_VALUE;
        int count = 0;
        for (int num : nums) {
            if (num != 0) {
                count++;
            } else {
                count = 0;
            }
            if (maxCount < count)
                maxCount = count;
        }
        return maxCount;
    }
}
