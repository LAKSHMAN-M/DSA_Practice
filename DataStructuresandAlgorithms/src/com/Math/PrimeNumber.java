package com.Math;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(20*Math.log(Math.log(20)));
//		for (int i = 1; i <= 20; i++) {
//			if (primeOrNot(i))
//				System.out.println(i);
//
//		}
	}

	static boolean primeOrNot(int n) {
		if(n <= 1) {
			return false;
		}
//	approch 2
		int c = 2;
		while( c * c <= n) {
			if( n % c == 0) {
				return false;
			}
			c++;
		}
//		for (int i = 2; i <= Math.sqrt(n); i++) {
//			if (n % i == 0)
//				return false;
//		}
		return true;
	}
}
