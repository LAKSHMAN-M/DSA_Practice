package com.binarySearch.problems;
//This code works for unique elements and array may be rotated sorted array or sorted array

public class pivotElement {

	public static void main(String[] args) {
		int[] nums = {4, 67, 5, 6, 7};
		System.out.println(peakSearch(nums));
	}

	// this will return the highest element or peak element in an array
	static int peakSearch(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && nums[mid] >= nums[mid + 1]) {
				return mid;
			} else if (mid > start && nums[mid] <= nums[mid - 1]) {
				//it the nums in ascending order then loop will terminate here
				return mid - 1;
			} else if (nums[mid] >= nums[start]) {
				start = start + 1;
			} else {
				end = end - 1;
			}
		}
		return -1;
	}
}
