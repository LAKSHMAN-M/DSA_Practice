package com.recursion.arrays;

public class NoOfNZeros {
	static int noz(int n, int count) {
		if (n % 10 == n)
			return count;
		if (n % 10 == 0)
			count++;
		return noz(n / 10, count);
	}

	public static void main(String[] args) {
		int n = 30204;
		int noofzeros = 2;
		int count = 0;
		for (int i = 100; i < 10000; i++) {
			if (noz(i, 0) >= noofzeros) {
				count++;
			}
		}
		System.out.println(count);
	}

}
