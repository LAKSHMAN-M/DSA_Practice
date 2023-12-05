package com.Math;

public class SieveOfEsthones {

	public static void main(String[] args) {
		int n = 40;
        boolean[] primes = new boolean[n+1];
        primes(n, primes);
	}

	static void primes(int n, boolean primes[]) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (!primes[i]) {
				for (int j = i * 2; j <= n; j += i) {
					primes[j] = true;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (!primes[i]) {
				System.out.println(i);
			}
		}
	}
}
