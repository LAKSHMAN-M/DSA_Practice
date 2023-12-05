package com.binarySearch.problems;

public class CeilingNumber {

	public static void main(String[] args) {
		int array[] = {3, 9, 20, 41, 52, 54, 55, 63, 94};
		
			System.out.println(solution(array, 12));
		
	}
//	return the index of smallest number >= target
	static int solution(int[] array, int target){
		int start = 0;
		int end = array.length - 1;
		if(target > array[end]) {
			return array[end];
		}
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target == array[mid]) {
				return mid;
			}else if(target > array[mid]) {
				start = mid + 1;
			}else if(target < array[mid]){
				end = mid - 1;
			}else {
				return end;
			}
		}
		return end;
	}
}
