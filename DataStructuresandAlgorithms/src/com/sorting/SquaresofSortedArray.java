package com.sorting;

import java.util.Arrays;

public class SquaresofSortedArray {
    //    https://leetcode.com/problems/squares-of-a-sorted-array/solutions/221922/java-two-pointers-o-n/
    public static void main(String[] args) {
        int[] nums = {-5,-3,-2,-1};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return nums;
        }
        int left = 0;
        int right = len - 1;
        int index = len - 1;

        int[] result = new int[len];

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index--] = nums[left] * nums[left];
                left++;
            } else {
                result[index--] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

}