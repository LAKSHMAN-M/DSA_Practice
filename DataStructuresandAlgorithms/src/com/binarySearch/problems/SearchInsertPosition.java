package com.binarySearch.problems;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int nums[] = {-3, -1, 0};
		int target = 10;
		System.out.println(searchInsert(nums, target));
	}

	public static  int searchInsert(int[] nums, int target) {
		if(nums.length == 0) {
			return 0;
		}
		int s = 0;
		int e = nums.length - 1;
		int mid = 0;
		while (s <= e) {
			mid = s + (e - s) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				s = mid + 1;
			else
				e = mid - 1;
		}
		return s;
	}
}
