package com.binarySearch.problems;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
//Find position of an element in a sorted array of infinite numbers
//array = [1, 3, 4, 5, 5, 23, 25,43, 55, 244, 870, 2390] target = 870 output = 10
public class FindElementAtInfiniteArray {

	public static void main(String[] args) {
		int[] array = {1, 3, 4, 5, 5, 23, 25,43, 55, 244, 870, 2390};
		System.out.println(searchKey(array, 870));
	}

//	this method will return the index of the target
	static int searchKey(int[] array, int target) {
		int start = 0;
		int end = 1;
		
		//if my target is out of the range then 
		//i am going to double the size and compare
		
		try {
			while(target > array[end]) {
				int newStart  = end + 1;
				//doubling the box of the size
				end = end + (end - start + 1) * 2;
				start = newStart;
			}
		} catch (Exception e) {
			try {
				for(int i = start; ; i++) {
					if(target == array[i]) {
						return i;
					}
				}
			} catch (Exception e1) {
				System.out.println("Element not Found");
			}
		}
		
		return binarySearch(array, target, start, end );
	}
//binary search to get the element index
	static int binarySearch(int[] array, int target , int start , int end) {
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(target == array[mid]) {
				return mid;
			}else if(target > array[mid]) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return -1;// if target is not found in the specified range
	}
}
