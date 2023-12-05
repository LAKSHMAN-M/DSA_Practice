package com.soting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { -12312, 123 };
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}

//	Insertion Sort :
//	It is a simple comparison based sorting algorithm
//	that builds the sorted array by taking the one element at a time repeatedly
//	taking an element from the unsorted part and 
//	insert it into its correct position within sorted part
//	Time complexity : Best Case : O(n), Worst Case : O(n^2) comparisons 
	static void insertionSort(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

//	this will swap the passed elements to the array
	static void swap(int[] arr, int element1, int element2) {
		int temp = arr[element1];
		arr[element1] = arr[element2];
		arr[element2] = temp;
	}
}
