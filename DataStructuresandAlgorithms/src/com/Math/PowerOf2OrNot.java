package com.Math;

public class PowerOf2OrNot {

	public static void main(String[] args) {
		System.out.println(powerof2orNot(3));
		Math.pow(3, 6);
	}
	static boolean powerof2orNot(int n) {
		return (n&(n-1)) == 0;
	}
}
