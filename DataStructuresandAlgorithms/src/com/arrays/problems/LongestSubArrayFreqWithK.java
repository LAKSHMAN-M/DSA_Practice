package com.arrays.problems;

import java.util.*;

public class LongestSubArrayFreqWithK {
    public static void main(String[] args) {
        int[] nums = {1,4,4,3};
        int k = 1;
        LongestSubArrayFreqWithK obj = new LongestSubArrayFreqWithK();
        System.out.println(obj.maxSubarrayLength(nums, k));
    }

    public int maxSubarrayLength(int[] nums, int k) {
        int maxLen = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            hm.put(nums[r], hm.getOrDefault(nums[r], 0) + 1);
            if(hm.getOrDefault(nums[r], 0) <= k){
                maxLen = Math.max(maxLen, r - l + 1);
            }else{
                hm.put(nums[r], hm.getOrDefault(nums[r], 0) - 1);
                l++;
            }
        }
        return maxLen;
    }
}
