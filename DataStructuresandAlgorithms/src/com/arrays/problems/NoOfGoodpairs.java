package com.arrays.problems;

import java.util.HashMap;

//https://leetcode.com/problems/number-of-good-pairs/description/
public class NoOfGoodpairs {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(nums));
	}
	public  static int numIdenticalPairs(int[] nums) {
		//this is written by me
//        int count = 0;
//        for(int i = 0; i < nums.length; i++){
//            for(int j = 0; j < nums.length; j++){
//                if(i < j && nums[i] == nums[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
		//others solution 
		 HashMap<Integer, Integer> hm = new HashMap<>();
	        int ans = 0;
	        
	        for(int friend:nums)
	        {
	            int friendCount = hm.getOrDefault(friend,0);
	            ans+=friendCount;
	            hm.put(friend,friendCount+1);
	        }
	        
	        
	        return ans;
    }
}
