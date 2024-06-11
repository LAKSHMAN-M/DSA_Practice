package com.Math;
public class PowerOfThree {
	public static void main(String[] args) {
		int ans = (int) (Math.log(Integer.MAX_VALUE) / Math.log(3));
		System.out.println(ans % 27);
	}
}