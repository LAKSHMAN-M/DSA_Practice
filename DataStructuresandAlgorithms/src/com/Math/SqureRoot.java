package com.Math;

public class SqureRoot {

	public static void main(String[] args) {
		System.out.println(sqrt(5));
	}
	public static float sqrt(int n) {
		int start = 2;
		int end = n;
		float mid = 0.0f;
		if(n == 1) {
			return 1.0f;
		}else if( n < 1) {
			return 0	;
		}else {
			while(start <= end) {
				mid = start + (end - start)/2;
				if(mid * mid == n) {
					return mid;
				}else if(mid * mid > n){
					end  = (int)mid - 1;
				}else {
					start = (int)mid + 1;
				}
			}
		}
		float increment = 0.1f;
		for(int i = 0; i < 3; i++) {
			while(mid * mid <= n) {
				mid += increment;
			}
		}
		return mid;
	}
}