package com.recursion.sorting;

import java.util.Arrays;

public class selectionSort {
	static int[] sort(int arr[], int i, int j, int maxIndex) {
		if(i == 0) return arr;
		if(j < i) {
			if(arr[j] > arr[maxIndex]) {
				return sort(arr, i, j + 1, maxIndex);
			}
			return sort(arr, i, j + 1, maxIndex);
		}else {
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex]= temp;
			return sort(arr, i - 1, 0, 0);
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(sort(arr, arr.length - 1, 0, 0)));
	}
}
