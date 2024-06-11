package com.hashing;

import java.util.Arrays;
// https://leetcode.com/problems/frequency-of-the-most-frequent-element/description
public class FrequencyOfMostFrequentElement1838 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 4};
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }
    static int maxFrequency(int[] nums, int k) {
        int len = nums.length;
        if(len == 0 || k == 0){
            return 0;
        }
        //sort the given array
        Arrays.sort(nums);
        int count = 0;
        int l = 0, r = 0;
        int total = 0;
        while(r < len){
            total += nums[r];
            while(nums[r] * (r - l + 1) > total + k){
                total -= nums[l];
                l++;
            }
            count = Math.max(count, r - l + 1);
            r++;
        }
        return count;
    }

}
