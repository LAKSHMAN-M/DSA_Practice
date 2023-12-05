package com.arrays.problems;
//https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		int array[] = { 1,2,3,4};
		System.out.println(Arrays.toString(runningSum(array)));
//		System.arraycopy(args, 0, array, 0, 0);
	}

//	this will return the array of size double of given array
	static int[] runningSum(int[] nums) {
		if(nums.length < 1) {
			return nums;
		}
		int temp = 0;
        for (int i = 0; i < nums.length; i++) {
        	temp += nums[i];
        	nums[i]= temp;
		}
        
        return nums;
    }
}
