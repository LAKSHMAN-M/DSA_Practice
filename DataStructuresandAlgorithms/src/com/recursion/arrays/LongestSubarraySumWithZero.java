package com.recursion.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumWithZero {
    public static void main(String[] args) {
        int[] arr = {11, 21, 0, 9, -9};
        System.out.println(maxLen(arr, 0));
    }

    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        // Write your code here.
        long prefSum = 0;
        int maxLen = 0;
        HashMap<Long, Integer> hm = new HashMap<>();
        hm.put(0L, -1);
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if (prefSum == 0) {
                maxLen = Math.max(maxLen, i + 1);
            } else if (hm.containsKey((prefSum - 0))) {
                int len = i - hm.getOrDefault(prefSum - 0, 0) ;
                maxLen = Math.max(maxLen, len);
            } else {
                hm.put(prefSum, i);
            }
        }
        return maxLen;
    }
    static int maxLen(int arr[], int n){
        int prefix[] = new int[arr.length+1];
        for(int i = 1; i<= arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i-1];
        }
        Map<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < prefix.length ;i++){
            if(map.containsKey(prefix[i])){
                int left = map.get(prefix[i]);
                max = Math.max(max,i-left);
            }else
                map.put(prefix[i],i);

        }
        return max==Integer.MIN_VALUE?0:max;
    }
}
