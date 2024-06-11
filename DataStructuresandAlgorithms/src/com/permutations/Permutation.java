package com.permutations;

public class Permutation {
	public static void main(String[] args) {
		System.out.println(nPr(10, 3));
	}

	public static long nPr(int n, int r) {
		if (r == 0) {
			return 1;
		} else {
			return n * nPr(n - 1, r - 1);
		}
	}
	
}