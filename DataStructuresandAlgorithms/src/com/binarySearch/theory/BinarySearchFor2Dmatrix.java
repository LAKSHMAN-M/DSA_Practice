package com.binarySearch.theory;

import java.util.Arrays;

//this code is for the given array is sorted in row wise and column wise matrix


// row/col ====>
//||
//||
//||
//\/

public class BinarySearchFor2Dmatrix {

	public static void main(String[] args) {
		int array[][] = {{10, 20, 30},
						 {11, 21, 31},
						 {12, 22, 32},
						 {13, 23, 373}
						};
		System.out.println(Arrays.toString(search(array, 373)));
	}
	//return the index of the target element if exist else return -1 , -1
	static int[] search(int[][] array, int target) {
		int row = 0;
		int col = array[row].length -1;
		
		while(row <= array.length-1 && col >= 0 ) {
			if(array[row][col] == target) {
				return new int[] {row, col};
			}else if(array[row][col] > target){
				
				col = col -1;
			}else {
				row = row + 1;
				col = array[row].length - 1;
			}
		}
		
		return new int[] {-1, -1};
		
	}

}
