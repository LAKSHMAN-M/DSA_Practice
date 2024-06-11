package com.Math;

public class PowerOf2OrNot {

	public static void main(String[] args) {
		System.out.println(powerof2orNot(4));
	}
	static boolean powerof2orNot(int n) {
		if(n <= 1) {
			return false;
		}
		return (n&(n-1)) == 0;
	}
}
