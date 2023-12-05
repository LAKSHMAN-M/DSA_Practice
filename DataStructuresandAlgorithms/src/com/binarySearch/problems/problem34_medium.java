package com.binarySearch.problems;

import java.util.Arrays;

public class problem34_medium {

	public static void main(String[] args) {
		int []nums = {5,7,7,8,8,10};
		int  target = 8;
		System.out.println(Arrays.toString(searchRange(nums, target)));
	}
//return the first and last position of element in an array
	static  int[] searchRange(int[] nums, int target) {
		return new int[] {search(nums, target, true), search(nums, target, false)};
    }
	
	//it will return the first and last position of the element 
	static int search(int[] nums, int target, boolean findStartIndex) {
		int result = -1;
		int start = 0;
		int end = nums.length -1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < nums[mid]) {
				end = mid-1;
			}else if(target > nums[mid]) {
				start = mid+1;
			}else {
				result = mid;
				if(findStartIndex) {
					end = end - 1;
				}else {
					start = mid + 1;
				}
			}
		}
		
		return result;
	
	}
}
