package com.recursion.arrays;

public class NoOfZeros {
	static int noz(int n, int count) {
		if (n % 10 == n)
			return count;
		if (n % 10 == 0)
			count++;
		return noz(n / 10, count);
	}

	static int cntz(int n) {
		if (n % 10 == n)
			return 0;
		if (n % 10 == 0)
			return cntz(n / 10) + 1;
		else
			return cntz(n / 10);
	}

	public static void main(String[] args) {
		int n = 30204;
		System.out.println(noz(300003, 0));
		
		System.out.println(cntz(20004));
	}
	
}
