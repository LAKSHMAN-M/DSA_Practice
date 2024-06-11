package com.sorting;
public class FindDuplicateNum {
	public static void main(String[] args) {
		int[] array = {1,2, 3, 3};
		System.out.println(findDuplicate(array));
	}
    public static int findDuplicate(int[] nums) {
    	int i = 0;
//		we use while loop because when the element is at correct position then only we increment to next element
		while (i < nums.length) {
			int correctIndex = nums[i] - 1;
			if (i != correctIndex) {
				if(nums[i] == nums[correctIndex]) {
					break;
				}
				swap(nums, i, correctIndex);
			} else {
				i++;
			}
		}
		return nums[i];
    }
    static void swap(int arr[], int i, int correctIndex) {
		int temp = arr[correctIndex];
		arr[correctIndex] = arr[i];
		arr[i] = temp;
	}
}