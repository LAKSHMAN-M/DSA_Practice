package com.arrays.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccrunces {
    public static void main(String[] args) {
        int[] nums = {1,3, 2, 4, 100, 200};
        System.out.println(longestConsecutive(nums));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> hs = new HashSet<>();
        int count = 0;
        int start = 0;
        int end = 0;
        while(end < arr.length){
            while(end < arr.length && arr[start] == arr[end]){
                count++;
                end++;
            }
            if(hs.contains(count)){
                return false;
            }else{
                hs.add(count);
            }
            start = end;
            count = 0;
        }

        return true;
    }
    public static int longestConsecutive(int[] nums) {
        //brute force
        Arrays.sort(nums);
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        int start = 0;
        int end = start + 1;
        while(end < nums.length){
            while(end < nums.length && nums[start] == nums[end] - 1){
                count++;
                end++;
                start++;
            }
            if(maxCount < count){
                maxCount = count;
            }
            count = 0;
            start++;
        }
        return maxCount;
    }
}
