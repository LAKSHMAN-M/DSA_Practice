package com.binarySearch.problems;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		int[] nums = {7,2,5,10,8};
		int k = 2;
		System.out.println(splitArray(nums, k));
	}
	//it will return the splitArray largest sum 
	 public static int splitArray(int[] nums, int k) {
	        int start = 0;
	        int end = 0;
	        for(int i = 0; i < nums.length; i++){
	            start = Math.max(start, nums[i]);
	            end += nums[i];
	        }
	        while(start < end ){
	            int sum = 0;
	            int pieces = 1;
	            int mid = start + (end - start)/2;
	            for(int i = 0 ; i < nums.length; i++){
	                if(sum + nums[i] > mid ){
	                    sum = nums[i];
	                    pieces++;
	                }else{
	                    sum += nums[i];
	                }
	            }
	            if(pieces <= k){
	                end = mid;
	            }else{
	                start = mid + 1;
	            }
	        }
	        return start;
	    }
}
