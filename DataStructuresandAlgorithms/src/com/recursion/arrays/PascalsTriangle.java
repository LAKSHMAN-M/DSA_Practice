package com.recursion.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
	public static void main(String[] args) {
		for (int[] i : pascalTriangle(5)) {
			System.out.println(Arrays.toString(i));
		}
	}
//	this is fine for finding nth row of mth column
//	static int ncr(int n, int r) {
//		n = n - 1;
//		r = r - 1;
//		int ans = 1;
//		for (int i = 0; i < r; i++) {
//			ans = ans * (n - i);
//			ans = ans / (i + 1);
//		}
//		return ans;
//	}

	static int[][] pascalTriangle(int n) {
		int[][] arr = new int[n][n];
		arr[0][0] = 1;
		arr[1][0] = 1;
		arr[1][1] = 1;
		for (int i = 2; i < n; i++) {
			arr[i][0] = 1;
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
			arr[i][i] = 1;
		}
		return arr;
	}
}
