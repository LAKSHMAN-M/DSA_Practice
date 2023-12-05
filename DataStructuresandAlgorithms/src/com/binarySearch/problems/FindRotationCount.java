package com.binarySearch.problems;
//this is for only distinct elements 
public class FindRotationCount {

	public static void main(String[] args) {
		int[] array = {15, 18, 19, 2, 3, 6, 12};
		System.out.println(solution(array));
	}
	
	//it will return the K th rotated elements length
	static int solution(int[] array) {
		int length = pivot(array);
		return length != -1? length + 1: 0;
	}
	//return the highest element index or pivot element 
	//this will return the -1 if the array is not rotated(i.e sorted array)
	static int pivot(int[] array) {
		int start = 0 ;
		int end = array.length -1 ;
		while(start <= end ) {
			int mid = start + (end - start)/2;
			if(array[mid] > array[mid + 1]) {
				return mid;
			}else if(array[mid] < array[mid - 1]) {
				return mid - 1;
			}else if(array[mid] <= array[start]) {
				end = mid - 1;
			}else {
				start = mid   + 1;
			}
		}
		return -1;
	}
}
