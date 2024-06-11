package com.recursion.arrays;

import java.util.ArrayList;

public class PascalsTriangle2 {
	public static void main(String[] args) {
		
		for(ArrayList<Integer> al : pascalTriangle(5)) {
			System.out.println(al);
		}
	}
//	print rth and cth column
	static int pascalsNthNum(int r, int c) {
		return rcc(r - 1, c - 1);
	}

	private static int rcc(int r, int c) {
		int ans = 1;
		for(int i = 1; i <= c; i++) {
			ans *= r;
			ans /= i;
			r--;
		}
		return ans;
	}
//	nth row
	static void nthrow(int n) {
		int ans = 1;
		System.out.print(ans+" ");
		for(int i = 1; i < n; i++) {
			ans = ans * (n - i);
			ans /= i;
			System.out.print(ans+" ");
		}
	}
//	print pascal's triangle 1 to n
	static ArrayList<ArrayList<Integer>> pascalTriangle(int n){
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for(int row  = 1; row <= n ; row ++) {
			ArrayList<Integer> al = new ArrayList<>();
			for(int col = 1; col <= row ; col++) {
				al.add(pascalsNthNum(row, col));
			}
			ans.add(al);
		}
		return ans;
	}
}
