package com.recursion.arrays;

public class ProductOfDigits {

	public static void main(String[] args) {
		System.out.println(pod(13023));
	}
//	with using loops
	static int productOfDigits(int n) {
		int ans = 0;
		while( n > 0) {
			ans *= n % 10 ;// taking the last digit and multiply to variable ans
			n /= 10;// removing the last digit and stores in same variable
		}
		return ans;
	}
//	with using recursion 
	static int pod(int n) {
		if( n % 10 == n) return n;
		return  pod(n / 10) * ( n % 10 );
	}
}
