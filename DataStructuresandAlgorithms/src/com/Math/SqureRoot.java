package com.Math;

public class SqureRoot {

	public static void main(String[] args) {
		System.out.println(sqrt(145));
	}
//	time complexity 
	public static double sqrt(int n) {
		int s = 1;
		int end = n;
		int mid = 0;
		if (n == 1) {
			return 1;
		}
		while (s <= end) {//from here to 
			mid = s + (end - s) / 2;
			if(mid * mid == n ) {
				return mid;
			}else if(mid * mid > n) {
				end = mid - 1;
			}else {
				s = mid + 1;
			}
		}//					here log(n)
		double inc = 0.1;//
		double root = mid;
		for(int i = 1; i < 4; i++) {
			while(root * root < n) {
				root += inc;
			}
			root -= inc;
			inc /= 10;
		}
		return root;// here log(n) + 4 ==> log(n) && space complexity is O( 1 + 1 + 1 + 1 + 1) ==> O(1);
	}
}