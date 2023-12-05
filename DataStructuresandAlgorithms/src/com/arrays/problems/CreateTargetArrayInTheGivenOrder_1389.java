package com.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder_1389 {

	public static void main(String[] args) {
		int nums[] = {0,1,2,3,4};
		int index[] = {0, 1, 2, 2 ,1};
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}
	public static int[] createTargetArray(int[] nums, int[] index) {
		 List<Integer> targetList = new ArrayList<>();

	        for (int i = 0; i < nums.length; i++) {
	            targetList.add(index[i], nums[i]);
	        }

	        // Convert the ArrayList to an array
	        int[] targetArray = new int[targetList.size()];
	        for (int i = 0; i < targetList.size(); i++) {
	            targetArray[i] = targetList.get(i);
	        }

	        return targetArray;	
	        }
}
