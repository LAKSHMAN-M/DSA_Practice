package com.recursion.arrays;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(35));
	}
//	factorial is multiply of previous numbers of a number
	static long fact(int n) {
		if(n == 1) return n;//if the n == 1 i.e 1*1 == 1, otherwise 1*0 == 0
							// this will become entire number to 0;
		return n*fact(n - 1);
	}
}
