package com.binarySearch.problems;

public class SearchInRotatedSortedArray {
	public static void main(String[] args) {
		int nums[] = { 3 ,4 ,5 ,6 ,9 ,2 };
		System.out.println(search(nums, 4));
	}

//	it will return the target element if not found will return -1
	public static int search(int[] nums, int target) {
		int pivot = pivot(nums);
		if (pivot == -1) {
			return binarySearch(nums, target, 0, nums.length - 1);
		}
		if (nums.length == 0) {
			return -1;
		} else if (nums.length == 1) {
			return target == nums[0] ? 0 : -1;
		} else if (nums[pivot] == target) {
			return pivot;
		}

		else {
			int rightPart = binarySearch(nums, target, 0, pivot - 1);
			int leftPart = binarySearch(nums, target, pivot + 1, nums.length - 1);
			return rightPart >= leftPart ? rightPart : leftPart;
		}
	}

//	search for Pivot or highest element index if not return -1
	static int pivot(int[] nums) {
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

//	it will check for target element with in provided range of start and end to the array
	static int binarySearch(int[] array, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < array[mid]) {
				end = mid - 1;
			} else if (target > array[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}
}
