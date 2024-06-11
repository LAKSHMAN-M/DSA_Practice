package com.recursion.arrays;

public class Palindrome {
//	Normal Approach 
	static int rev(int n) {
		int ans = 0;
		while (n > 0) {
			int temp = n % 10;
			ans = ans * 10 + temp;
			n /= 10;
		}
		return ans;
	}
//	Approach two 

	static int sum = 0;

	static void rev2(int n) {
		if (n <= 0)
			return;
		sum = sum * 10 + (n % 10);
		rev2(n / 10);
	}

//	Approach three 
	static int rev3(int n, int units) {
		if (n % 10 == n) {
			return n;
		}
		return (n % 10) * (int) Math.pow(10, units) + rev3(n / 10, units - 1);
	}

//	check the given number match with its reverse number
	static boolean palindorme(int n) {
		rev2(n);
		return n == sum;
	}

	public static void main(String[] args) {
//		rev2(1234);
//		System.out.println(sum);
		int n = 2002;
		int units = (int)(Math.log10(n));
		System.out.println(rev3(n, units));
//		System.out.println(palindorme(12321));
	}
}
