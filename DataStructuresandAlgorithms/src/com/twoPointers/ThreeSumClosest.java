package com.twoPointers;
// https://leetcode.com/problems/3sum-closest/

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-5, 10, 12, 13,300, 20, 33, 999};
        int target = 1000;
        ThreeSumClosest obj = new ThreeSumClosest();
        System.out.println(obj.threeSumClosest(nums, target));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        long closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                long sum = nums[i] + nums[start] + nums[end];
                if (sum == target) {
                    return (int) sum;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
                if(Math.abs(closestSum - target) > Math.abs(sum - target)){
                    closestSum  = sum;
                }
            }
        }
        return (int)closestSum;
    }
}

