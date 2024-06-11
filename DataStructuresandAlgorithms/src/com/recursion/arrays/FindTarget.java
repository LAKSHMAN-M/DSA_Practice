package com.recursion.arrays;

import java.util.ArrayList;

public class FindTarget {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 4, 0};
		System.out.println(search(arr, 4, 0));
	}
	static ArrayList<Integer> search(int arr[], int target, int index){
		ArrayList<Integer> list = new ArrayList<>();
		if(index == arr.length) {//base condition
			return list;
		}
		if(arr[index] == target) {
			list.add(index);
		}
		ArrayList<Integer> aboveCalls = search(arr, target, ++index);
		list.addAll(aboveCalls);
		return list;
	}
}
