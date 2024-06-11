package com.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 1, 2 ,31 ,4, 5};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
// 	Bubble sort is a simple algorithm, where the adjacent elements are compared(pairs) then sorted the array
//	Time complexity : Best case : O(n), worst Case : O(n^2)
//	Space Complexity : O(1), in place(i.e we r not creating any extra memory

	
//	this will sort the array
	static void bubbleSort(int[] arr) {
		int len = arr.length;
		boolean swapped;
		for (int pass = 0; pass < arr.length; pass++) {
			swapped = false;
			for (int j = 1; j < arr.length - pass; j++) {
				if(arr[j] < arr[j - 1 ]) {
					int temp = arr[j]; // lesser element need to shift
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}
			// till this executed pass * n times
			//if the original array is sorted (ascending) then the loop will break after n times of execution
			if(!swapped) break;// !false = true;
		}
	}
}
