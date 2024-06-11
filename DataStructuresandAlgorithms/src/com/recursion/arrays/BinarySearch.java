package com.recursion.arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 53};
		int target = 53;
		System.out.println(binarySearch(arr, target, 0, arr.length - 1));
	}
	static int binarySearch(int[] arr, int target, int start, int end) {
			int mid = start + (end - start) / 2;
			if(start <= end) {
				if(arr[mid] == target) return mid;
				else if(target < arr[mid]) return binarySearch(arr, target, start, mid - 1);
				else if(target> arr[mid])	return binarySearch(arr, target, mid + 1, end);
			}
		return -1;
	}
}
