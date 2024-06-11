package com.kadanes.arrayProblems;

import java.util.Arrays;

public class MaxSubArraySum {

	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(Arrays.toString(maxSubArray(arr)));
	}

//	Brute force approach 
	static int maxSubArraySum(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int len = arr.length - 1;
		for (int i = 0; i <= len; i++) {
			for (int j = i; j <= len; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
//		Time complexity : O(n^3) 
//		space complexity : O(1)
	}

//	Better approach 
	static int maxSubArraySum2(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int len = arr.length - 1;
		for (int i = 0; i <= len; i++) {
			int sum = 0;
			for (int j = i; j <= len; j++) {
				sum += arr[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
//		Time complexity : O(n^2) 
//		space complexity : O(1)
	}

//	Optimal Approach : kadane's algorithm
	static int maxSubArraySum3(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (maxSum < sum)
				maxSum = sum;
			if (sum < 0)
				sum = 0;
		}
		return maxSum;
	}

	static int[] maxSubArray(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		int s = -1;
		int e = -1;
		int temp = s;
		for (int i = 0; i < arr.length; i++) {
			if(sum == 0) { 
				temp = i;
			}
			sum += arr[i];
			if(maxSum < sum) {
				 maxSum = sum;
				 s = temp;
				 e = i;
			}
			if(sum < 0) sum = 0;
		}
		return new int[] {s, e};
	}

}
