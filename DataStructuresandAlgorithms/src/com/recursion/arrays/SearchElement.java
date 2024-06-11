package com.recursion.arrays;

import java.util.ArrayList;

// given an array and target search for its index if exists return its index, otherwise return -1;
public class SearchElement {
	static int searchElement(int arr[], int target) {
//		if the arr len is 0 return -1
		if (arr.length == 0)
			return -1;
//		otherwise search for element whether exists or not 
		return helperSearch(arr, target, 0);
	}

	static int helperSearch(int arr[], int target, int i) {
//		if element at index i is match with target
		if (arr[i] == target)
			return i;
//		if doesn't match return -1
//		because we came from 0 index to last index but target doesn't found
		if (i == arr.length - 1)
			return -1;
//		search in every element of index i 
		return helperSearch(arr, target, ++i);
	}

	static ArrayList search(int arr[], int target, int index, ArrayList<Integer> list) {
		if (index == arr.length) {
			return list;
		} else {
			if (arr[index] == target)
				list.add(index);
			return search(arr, target, index + 1, list);
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 1, 19,1 ,1, 2, 3, 0, 0, 0, 0, 4, 59, -1, 9, 0 };
		int target = 1;
//		System.out.println(searchElement(arr, target));
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(search(arr, target, 0, list));
	}
}
