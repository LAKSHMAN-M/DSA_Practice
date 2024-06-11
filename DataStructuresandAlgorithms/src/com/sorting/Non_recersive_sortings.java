package com.sorting;

import java.util.Arrays;

public class Non_recersive_sortings {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 2, 4 };
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}

//	bubble sort 
	static void bubbleSort(int[] arr) {
		int len = arr.length;
		boolean swapped;
		for (int pass = 0; pass < len - 1; pass++) {
			swapped = false;
			for (int j = pass + 1; j < len; j++) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
	}

//	selection sort
	static void selectionSort(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int max = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[max] < arr[j]) {
					max = j;
				}
				swap(arr, max, j);
			}
		}
	}
//	insertion sort
	static void insertionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for(int j  = i + 1; j > 0 ; j--) {
				if(arr[j] < arr[j - 1]) {
					swap(arr, j - 1, j);
				}else {
					break;
				}
			}
		}
	}
//	cyclic sort 
	static void cyclicSort(int arr[]) {
		int i = 0;
		while(i < arr.length) {
			int ci = arr[i] - 1;
			if(i != ci) {
				swap(arr, i, ci);
			}else {
				i++;
			}
		}
	}
	//	swapped
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
