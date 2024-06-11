package com.Math;

public class PowerOfFour {
	public static void main(String[] args) {
		int n = 16;
		int originalNum = n;
		int count = 0;
		while(n > 1) {
			n >>=2;
			count += 2;
		}
		System.out.println(originalNum == n<< count);
//		System.out.println(Integer.toBinaryString(0xaaaaaaaa));
		System.out.println(powerof4(1));
	}
	static boolean powerof4(int n) {
//		return ( n % 3 == 1 ) && ((n & (n -1 ))== 0);
	    return (n > 0) && ((n & (n - 1)) == 0) && ((n & 0x55555555) != 0);
	}
}
