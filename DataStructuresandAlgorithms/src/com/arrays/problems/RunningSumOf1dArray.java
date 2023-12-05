package com.arrays.problems;

import java.util.Arrays;

public class RunningSumOf1dArray {

	public static void main(String[] args) {
		int array[] = { 1, 3, 2, 1 };
		System.out.println(Arrays.toString(getConcatenation(array)));
//		System.arraycopy(args, 0, array, 0, 0);
	}

//	this will return the array of size double of given array
	static int[] getConcatenation(int[] nums) {
		if(nums.length < 1) {
			return nums;
		}
        int ans[] = new int[nums.length*2];
        int index = 0;
        
        for(int i = 0; i < ans.length; i++){
//        	ans[i] = nums[index];
//            if(index == nums.length - 1){
//                index = 0;
//            }else {
//            	index++;
//            }
        	if(i < nums.length) {
        		ans[i] = nums[i];
        	}else {
        		ans[i] = nums[i - nums.length];
        	}
        }
        return ans;
    }
}
