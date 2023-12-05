package com.binarySearch.theory;

public class orderAgnosticBinarySearch {

	public static void main(String[] args) {
//		int array[] = { -29, 0, 4, 5, 55, 65 };
		int array[] = { -29, 0, 4, 5, 55, 65};
		int target = -29;
		int indexValue = orderAgnosticBS(array, target);
		System.out.println(indexValue);
	}

//	method to return the index of target element in an array
	static int orderAgnosticBS(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
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
