package com.twoPointers;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 90, 4, 5};
        System.out.println(longestConsecutive2(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] - 1) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 1;
            }
        }
        return maxCount < count ? count : maxCount;
    }


    //    Optimal Approach
    public static int longestConsecutive2(int[] nums) {
        int maxi = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            hs.add(i);
        }
        int arrLen = nums.length;
        for (int i : nums) {
            int len = 0;
            if (!hs.contains(i - 1)) {
                while (hs.contains(i + len)) {
                    maxi = Math.max(len + 1, maxi);
                    len++;
                }
            }
            if (maxi >= arrLen) {
                return maxi;
            }
        }
        return maxi;
    }
}
