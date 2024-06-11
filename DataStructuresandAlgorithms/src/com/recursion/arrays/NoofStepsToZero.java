package com.recursion.arrays;

public class NoofStepsToZero {
	static int stepsToZero(int n ) {
		if( n <= 0) return 0;
		n = ( n % 2 == 0) ? n / 2 : n - 1 ;
		return stepsToZero(n) + 1;
	}
	public static void main(String[] args) {
		System.out.println(stepsToZero(14));
	}
}
