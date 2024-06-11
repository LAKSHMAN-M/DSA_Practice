package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
//        MajorityElement obj = new MajorityElement();
//        int[] nums = {3, 3, 4};
//        System.out.println(obj.majorityElement3(nums));
        List<Integer> ls = new ArrayList<>();
        ls.toArray();
    }
    public int majorityElement(int[] nums) {
        // Brute force
        Map<Integer, Integer> hm = new HashMap<>();
        int len = nums.length;
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        int ans = 0;

        for(Map.Entry<Integer, Integer> map : hm.entrySet()){
            if(map.getValue() > len / 2){
                ans = map.getKey();
            }
        }
        return ans;
    }
    public int majorityElement2(int[] nums) {
        // better force
        int ans = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        int len = nums.length;
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
            if(hm.getOrDefault(i, 0) > len / 2){
                ans = i;
                break;
            }
        }
        return ans;
    }

    public int majorityElement3(int[] nums) {
        // Optimal approach
        //boyer - moore - majority voting alogithm
        int votes = 0;
        int candidate  = -1;
        for(int num : nums){
            if(votes == 0){
                candidate = num;
                votes = 1;
            }else{
                if(candidate == num){
                    votes++;
                }else{
                    votes--;
                }
            }
        }
        return candidate;
    }
}
