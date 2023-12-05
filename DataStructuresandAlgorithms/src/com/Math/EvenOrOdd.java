package com.Math;

public class EvenOrOdd {

	public static void main(String[] args) {
		int a = 10;
		String evenOrOdd = ( a&1 ) == 1 ? "Odd" : "Even";
		String evenOrOdd2 = ( a|1 ) == a ? "Odd" : "Even";
		System.out.println(evenOrOdd2);
		System.out.println(isOdd(a));
		int arr[] = {2, 3, 3, 4, 2, 6, 4, 5, 5};
		System.out.println(findNonRepeatedNum(arr));
//		rough
//		double n1 = 0.1;
//		double n2 = 0.2;
//		if(n1 + n2 == 0.3) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
	}

	private static boolean isOdd(int a) {
		return (a & 1) == 1;
	}

//	problem 2
	private static int findNonRepeatedNum(int[] arr) {
		int ans = 0;
		for(int n : arr) {
			ans ^= n;
		}
		return ans;
	}

}
