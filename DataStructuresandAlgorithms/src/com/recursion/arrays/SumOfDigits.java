package com.recursion.arrays;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sod(1342));
	}
//	with using loops
	static int sumOfDigits(int n) {
		int ans = 0;
		while( n > 0) {
			ans += n % 10 ;// taking the last digit and add to variable ans
			n /= 10;// removing the last digit and stores in same variable
		}
		return ans;
	}
//	with using recursion 
	static int sod(int n) {
		if( n <= 0) return 0;
		return  sod(n / 10) + n % 10 ;
	}
}
