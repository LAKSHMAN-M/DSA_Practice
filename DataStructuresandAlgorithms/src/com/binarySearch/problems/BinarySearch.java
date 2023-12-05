package com.binarySearch.problems;

public class BinarySearch {

	public static void main(String[] args) {
		int array[] = { -29, 0, 4, 5, 55, 65 };
		int target = -2;
		int indexValue = binarySearch(array, target);
		System.out.println(indexValue);
	}

//	return the index value for the target in an array
	static int binarySearch(int[] array, int target) {
		int start = 0;
		int end = array.length -1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < array[mid]) {
				end = mid-1;
			}else if(target > array[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}
}
