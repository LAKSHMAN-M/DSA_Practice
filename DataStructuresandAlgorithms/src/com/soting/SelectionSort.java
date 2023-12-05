package com.soting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 12, 4, 12, -231, 0, 231 };
		selectionSort3(array);
		System.out.println(Arrays.toString(array));
	}

//	selection sort is a simple sorting algorithm, it will divide the array into two parts,
//	left part, where it will hold the sorted elements and the right part which contains unsorted elements 
//	process: It will find the minimum element from the right part then place at the first unsorted element i.e left part
//	this will repeat until the array is sorted
//	Time complexity : for all scenarios(Best Case , Average Case and Worst Case) it will take (n * n) comparisons and (n) swaps
//	Space complexity : in place , we don't create any extra memory
	static void selectionSort(int[] array) {
		int len = array.length;
		for (int i = 0; i < array.length; i++) {
//			Find the minimum element index from the unsorted part(i.e right part)
			int minimumIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minimumIndex])
					minimumIndex = j;
			}
//			so far we found the minimum element so swap it
			int temp = array[minimumIndex];
			array[minimumIndex] = array[i];
			array[i] = temp;
//			now we store the minimum element in left part of array(i.e i th unsorted element)
		}
	}

// we also do this by finding the maximum element
	static void selectionSort2(int[] array) {
		int len = array.length;
		for (int i = 0; i < array.length; i++) {
//			Find the minimum element index from the unsorted part(i.e right part)
			int maximumIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[maximumIndex])
					maximumIndex = j;
			}
//			so far we found the minimum element so swap it
			int temp = array[maximumIndex];
			array[maximumIndex] = array[i];
			array[i] = temp;
//			now we store the minimum element in left part of array(i.e i th unsorted element)
		}
	}

	static void selectionSort3(int[] arr) {
		// Your code goes here
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[maxIndex]) { // 6<8
					maxIndex = j; // 1-index
				}
			}
			int temp = arr[maxIndex]; // 6
			arr[maxIndex] = arr[i]; // 8
			arr[i] = temp; //
		}
	}
}
