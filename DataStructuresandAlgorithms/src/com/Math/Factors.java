package com.Math;

import java.util.Vector;

public class Factors {

	public static void main(String[] args) {
		factorsOptimizedWay(16);
	}

//	time complexity : O(n), space complexity : O(1)
	static void factors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i != n) {
				System.out.print(i + ", ");
			} else if (i == n) {
				System.out.print(i);
			}
		}
	}

//	time complexity : O(log(n)),  space complexity : O(1)
	static void factorsOptimized(int n) {
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println(i + "\t" + (n / i));
			}
		}
	}

//	time complexity : O(log(n)),  space complexity : O(1)
	static void factorsOptimizedWay(int n) {
		Vector<Integer> v = new Vector<>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				v.add(n / i);
			}
		}
		for (int i = v.size() - 2; i >= 0; i--) {
			System.out.print(v.get(i) + " ");
		}
	}
}
