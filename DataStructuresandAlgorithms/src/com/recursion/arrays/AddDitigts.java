package com.recursion.arrays;
// https://leetcode.com/problems/add-digits/
public class AddDitigts {
	
	
	static int addDigits(int n) {
		if(n < 10) return 0;
		n = helper(n);
		return addDigits(n) + 1;
	}
	
	static int helper(int n) {
		if(n % 10 == 0) return 0;
		return (n % 10) + helper(n / 10);
	}
	
	public static void main(String[] args) {
		System.out.println(addDigits(28));
	}
}
