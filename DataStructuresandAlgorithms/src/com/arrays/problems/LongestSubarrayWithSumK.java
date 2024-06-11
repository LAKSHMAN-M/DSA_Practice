package com.arrays.problems;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        System.out.println(subarraySum(a, k));
    }

    //optimal approach
    static int longestSubarrayWithSumK(int[] a, long k) {
        int left = 0, right = 0;
        long currSum = 0;
        int len = a.length;
        int maxLen = 0;
        while (right < len) {
            currSum += a[right];
            if (currSum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            } else if (currSum > k) {
                while (left <= right && currSum > k) {
                    currSum -= a[left];
                    left++;
                }
                if (currSum == k) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
            }
            right++;
        }
        return maxLen;
    }

    //Better approach
    static int longestSubarrayWithSumK2(int[] a, long k) {
        HashMap<Long, Integer> hm = new HashMap<>();
        int maxLen = 0;
        long preSum = 0;
        for (int i = 0; i < a.length; i++) {
            preSum += a[i];
            if (preSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = preSum - k;
            if (hm.containsKey(rem)) {
                maxLen = Math.max(maxLen, i - hm.getOrDefault(rem, 0));
            }
            if (!hm.containsKey(preSum)) {
                hm.put(preSum, i);
            }
        }
        return maxLen;
    }

    //    https://leetcode.com/problems/subarray-sum-equals-k/description/
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        long prefSum = 0;
        int count = 0;
        hm.put(0, 1);
        for (int num : nums) {
            prefSum += num;
            long rem = prefSum - k;
            if (hm.containsKey((int)rem)) {
                count += hm.getOrDefault((int) rem, 0);
            }
            hm.put((int) prefSum, hm.getOrDefault((int) prefSum, 0) + 1);
        }
        return count;
    }
}
