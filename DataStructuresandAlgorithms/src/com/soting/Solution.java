package com.soting;

class Solution {
	public static void main(String[] args) {
		int nums[] = {2147483647,2147483646,2147483645,3,2,1,-1,0,-2147483648};
		System.out.println(firstMissingPositive(nums));
	}

	public static int firstMissingPositive(int[] nums) {
		int i = 0;
//		we use while loop because when the element is at correct position then only we increment to next element
		while (i < nums.length) {
			int correctIndex = nums[i] - 1;
			if (correctIndex >= 0 && i != correctIndex && nums[i] > 0 && nums[i] <= nums.length && nums[correctIndex] != nums[i]) {
			    swap(nums, i, correctIndex);
			} else {
			    i++;
			}

			
		}
		for (int j = 0; j < nums.length; j++) {
			if (j != nums[j] - 1) {
				return j + 1;
			}
		}
		return nums.length + 1;
	}

	static void swap(int arr[], int i, int correctIndex) {
		int temp = arr[correctIndex];
		arr[correctIndex] = arr[i];
		arr[i] = temp;
	}
}