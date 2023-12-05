package com.arrays.problems;

import java.util.Arrays;

public class ShuffletheArray {

	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		System.out.println(Arrays.toString(shuffle(nums, 3)));
	}

	public static int[] shuffle(int[] nums, int n) {
		int ans[] = new int[nums.length];
		int j = 0;
		for (int i = 0; i < ans.length; i++) {
			if (i % 2 == 1) {
				ans[i] = nums[n];
				n++;
				
			}
			else {
				ans[i] = nums[j];
				j++;
			}
				
		}
		return ans;
	}
}
