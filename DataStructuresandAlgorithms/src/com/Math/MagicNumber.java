package com.Math;

public class MagicNumber {

	public static void main(String[] args) {
		
		System.out.println(noOfdigits(8, 2));
		System.out.println(findMagicNumber(2, 5));
	}
//	approch 1
	static int findMagicNumber(int n, int base) {
		int ans = 0;
		int bas = base;
		while(n > 0) {
			int last = n & 1;
			n = n>>1;
			ans += last * bas;
			bas = bas*base;
		}
		return ans;
	}

	static int noOfdigits(int n, int base) {
		return (int)(Math.log(n) / Math.log(base)) + 1 ;
	}
}
