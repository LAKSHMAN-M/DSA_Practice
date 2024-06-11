package com.recursion.sorting;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		int arr[] = {3,1};
		System.out.println(rbs(arr, 1, 0, arr.length - 1));
	}
//	static int rbs(int arr[], int target, int s, int e) {
//		if(s > e) return -1;
//		int m = s + (e - s) / 2;
//		if(arr[m] == target) return m;
//		if(arr[s] < arr[m]) {
//			if(target >= arr[s] && target < arr[m]) {
//				return rbs(arr, target, s, m - 1);
//			}
//			else {
//				return rbs(arr, target, m + 1, e);
//			}
//		}
//		else if(target <= arr[m]) {
//			return rbs(arr, target, s, m - 1);
//		}else {
//			return rbs(arr, target, m + 1, e);
//		}
//	}
	static int Search(int array[], int target)
	{
	    // code here
	    int s = 0;
	    int e = array.length - 1;
	    return rbs(array, target, s, e);
	}
	static int rbs(int arr[], int t, int s, int e){
	    if(s > e) return -1;
	    int m = s + (e - s) / 2;
	    if(arr[m] == t) return m;
	    if(arr[s] <= arr[m] ) {
	        if(t >= arr[s] && t < arr[m])
	            return rbs(arr, t, s, m - 1);
	        else
	            return rbs(arr, t, m + 1, e);
	    }
	    else if( t > arr[m] && t <= arr[e]){
	    	return rbs(arr, t, m + 1, e);
	    }else{
	        return rbs(arr, t, s, m - 1);
	    }
	}
}
