package com.Math;

public class IthBItOfNumber {//ith bit a number 

	public static void main(String[] args) {
		int n = 32;
		int ith = 9;
		int ans = (n>>ith)&1;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(ans);
//		set the ith bit 
		
		n += (1<<ith - 1);
		System.out.println(Integer.toBinaryString(n));
		System.out.println("set "+ ith+" th bit " +n);
		
	}

}
