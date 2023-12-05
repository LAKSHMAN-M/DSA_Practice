package com.binarySearch.problems;
//mistake in this code check it later today date is 25/9/2023
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class PeakIndexInMountainArray {
	public static void main(String[] args) {
		int[] array = { 5, 1, 3 };
		int target = 3;
		System.out.println(searchTarget(array, target));
	}

	// method will check which side of element is greater if not found will -1
	static int searchTarget(int[] nums, int target) {
		int peak = searchPeakElement(nums);
		int leftSideOfMid = orderAgnosticBS(nums, target, 0, peak);
		// this will check if peak element index is greater or equal to leght of nums
		// that means our target lies in left side
		
		int rightSideOfMid = orderAgnosticBS(nums, target, peak + 1, nums.length - 1);
		if (leftSideOfMid != -1) {
			return leftSideOfMid;
		} else if (rightSideOfMid != -1) {
			return rightSideOfMid;
		}
		return -1;
	}

// method will return the peak element index in an array
	static int searchPeakElement(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (array[mid] < array[mid + 1]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start;
	}

//	this method will return the target index
	static int orderAgnosticBS(int arr[], int target, int start, int end) {

		// to check the sorted array is ascending or descending order
		boolean isAsc = arr[start] < arr[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target > arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
