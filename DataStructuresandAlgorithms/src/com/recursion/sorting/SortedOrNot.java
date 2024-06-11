package com.recursion.sorting;

// Program to find the given array is sorted or not 
public class SortedOrNot {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 1 ,2 ,3 };
		System.out.println(sortedOrNot(arr));
	}

	static boolean sortedOrNot(int arr[]) {
		if (arr.length <= 1) {
			return true;
		}
//		boolean flag = helper(arr, 1, true);
		int i = 1;
		boolean flag = helper(arr, i);// taking help from other fuction
		return flag;
	}

//	Approach 1 using recursion
	static boolean helper(int arr[], int i, boolean flag) {
		if (i >= arr.length - 1) // if index reaches at end return flag
			return flag;
// checking if current element is less than previous element or not
		if (arr[i - 1] < arr[i])//if index is not at end then increase the index by 1
			return helper(arr, i + 1, true);
		return false;//if above if stmt is not executed that means array is not sorted
	}

//	Approach 2 using recursion
	static boolean helper(int arr[], int i) {
//		if index i is at end element that means every element is less than the next element
		if (i > arr.length - 1)
			return true;
//	checking if current element is less than previous element or not
//	and check for further elements as well
//	logical and return false if one statement is false
		return arr[i - 1] < arr[i] && helper(arr, i + 1);
	}
}
