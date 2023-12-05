package com.binarySearch.theory;

import java.util.Arrays;

public class SortedBinarySearch {
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, 
						  { 4, 5, 7 } 
						};
		System.out.println(Arrays.toString(binarySearch(array, 3)));
	}

	// return the index of element from an array
	static int[] binarySearch(int[][] array, int target) {
		int row = array.length;
		int col = array[0].length;
		if (row == 0 || target < array[0][0] || target > array[row - 1][array[row - 1].length - 1])
			return new int[] { -1, -1 };
		if (row == 1 || col == 1) {
			return search(array, 0, 0, col - 1, target);
		}

//		now we have more than one row
		int rowStart = 0;
		int rowEnd = row - 1;
		int colMid = (col - 1)/ 2;
		// run the loop till only two rows
		while (!(rowEnd - rowStart == 1)) {
			int rowMid = rowStart + (rowEnd - rowStart) / 2;
			if (array[rowMid][colMid] == target) {
				return new int[] { rowMid, colMid };
			} else if (array[rowMid][colMid] > target) {
				rowEnd = rowMid;
			} else {
				rowStart = rowMid;
			}
		}
		// now we have only two rows
		// if the element is at middle of first row or second row
		if (array[rowStart][colMid] == target)
			return new int[] { rowStart, colMid };
		if (array[rowStart + 1][colMid] == target)
			return new int[] { rowStart + 1, colMid };

		// we need to check four cases
//		case 1: element <= target at first row 
		if(array[rowStart][colMid - 1] >= target)
			return search(array, rowStart, 0, colMid - 1, target);
//		case 2: element >= target && target <= last element of first row 
		else if(array[rowStart][colMid + 1] <= target && target<= array[rowStart][col -1])
			return search(array, rowStart, colMid + 1, col - 1, target);
		
		
//		case 3: element <= target at second row 
		else if(array[rowStart + 1][colMid - 1] >= target)
			return search(array, rowStart + 1, 0, colMid - 1, target);
//		case 4: element >= target at second row 
		else{
			
			return search(array, rowStart + 1 , colMid + 1, col - 1, target);
		}
		
		
	}

	static int[] search(int[][] array, int rowStart, int colStart, int colEnd, int target) {
		
		while (colStart <= colEnd) {
			
			int colMid = colStart + (colEnd - colStart) / 2;
			if (array[rowStart][colMid] == target) {
				return new int[] { rowStart, colMid };
			} else if (array[rowStart][colMid] > target) {
				colEnd = colMid - 1;
			} else {
				colStart = colMid + 1;
			}
			
		}

		return new int[] { -1, -1 };
	}

}
