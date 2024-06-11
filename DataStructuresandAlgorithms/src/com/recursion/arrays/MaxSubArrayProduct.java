package com.recursion.arrays;

public class MaxSubArrayProduct {
	public static void main(String[] args) {
		int arr[] = {-2,0,-1};
		System.out.println(maxSubArrayProduct(arr));
	}
	
//	maxSubArrayProduct will return the max of subArray product
	static int maxSubArrayProduct(int arr[]) {
		return maxSubArrayProduct(arr, 0, 1, 1, Integer.MIN_VALUE);
	}
	
	static int maxSubArrayProduct(int nums[], int index, int prefix, int suffix,  int maxProduct) {
		if(index == nums.length ) return maxProduct;
		if(prefix == 0) prefix = 1;
		if(suffix == 0) suffix = 1;
		prefix *= nums[index];
		suffix *= nums[nums.length - 1 - index];
		maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
		return maxSubArrayProduct(nums, index + 1, prefix, suffix, maxProduct);
	}
}
