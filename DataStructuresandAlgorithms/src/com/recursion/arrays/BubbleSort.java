package com.recursion.arrays;

import java.util.Arrays;

public class BubbleSort {
	static int[] sort(int arr[], int pass, int i) {
		if(pass == 0) return arr;
		if(i <= pass) {
			if(arr[i - 1] > arr[i]) {
				int temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}
			return sort(arr, pass, i + 1);
		}
		return sort(arr, pass - 1, 1);
	}
	static void bs(int[] arr, int r, int c){//r - row , c - column
		if(r == 0){
			return;
		}
		if(c <= r){
			if( arr[c - 1] > arr[c]){
				swap(arr, c, c - 1);
			}
			bs(arr, r, c + 1);
		}
		bs(arr, r-1, 1);
	}
	static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main(String[] args) {
		int arr[] = {45, 216, 198, 795, 484, 650, 590, 431, 705, 316, 557, 189, 652, 606, 153, 829, 813, 367, 658, 961 };
		bs(arr, arr.length - 1, 1);
		System.out.println(Arrays.toString(arr));
	}
}
