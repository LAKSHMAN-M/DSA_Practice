package com.binarySearch.problems;

public class SearchInRotatedSortedArrayWithDuplicates2 {
	public static void main(String[] args) {
		int nums[] = {1};
		System.out.println(search(nums, 6));
	}

//	it will return the target element if not found will return -1
	public static boolean search(int[] nums, int target) {
		if (nums.length == 0) {
			return false;
		}if (nums.length == 1) {
			return target == nums[0] ? true : false;
		} 
		int pivot = pivot(nums);
		if (pivot == -1) {
			boolean flag = binarySearch(nums, target, 0, nums.length - 1) != -1 ? true : false;
			return flag;
		}
		
		 if (nums[pivot] == target) {
			boolean flag = pivot != -1 ? true : false;
			return flag;
		}

		else {
			int rightPart = binarySearch(nums, target, 0, pivot - 1);
			int leftPart = binarySearch(nums, target, pivot + 1, nums.length - 1);
			if((rightPart >= leftPart ? rightPart : leftPart) != -1) {
				return true;
			}
			return false;
		}
	}

//	search for Pivot or highest element index if not return -1
	static int pivot(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && nums[mid] > nums[mid + 1]) {
				return mid;
			} else if (mid > start && nums[mid] < nums[mid - 1]) {
				return mid - 1;
			}
			if (nums[start] == nums[mid] && nums[start] == nums[end]) {
				//check whether the start is greater than next element
				if (nums[start] > nums[start + 1]) {
					return start;
				}
//				//check whether at start and end are pivot
				start++;
				if (nums[end] < nums[end - 1]) {
					return end - 	1;
				}
				end--;
			}
			if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
				start = mid + 1;
			}else {
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
