package com.soting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicateNums {
	public static void main(String[] args) {
		int[] array = {1,1,2};
		System.out.println(findDuplicates(array));
//		System.out.println(Arrays.toString(findErrorNums(array)));
	}
    public static List<Integer> findDuplicate(int[] nums) {
    	int i = 0;
    	List<Integer> list = new ArrayList<>();
    	Set<Integer> set = new HashSet<>();
//		we use while loop because when the element is at correct position then only we increment to next element
		while (i < nums.length) {
			int correctIndex = nums[i] - 1;
			if (i != correctIndex) {
				if(correctIndex + 1 != nums[correctIndex])
					swap(nums, i, correctIndex);
				else {
					set.add(nums[i]);
					i++;
				}
			} else {
				i++;
			}
		}
		for(Integer uni : set) {
			list.add(uni);
		}
		return list;
    }
    static void swap(int arr[], int i, int correctIndex) {
		int temp = arr[correctIndex];
		arr[correctIndex] = arr[i];
		arr[i] = temp;
	}
    
//    https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    static List<Integer> findDuplicates(int[] nums){
    	List<Integer> list = new ArrayList<>();
    	int i = 0;
    	while(i < nums.length) {
    		int ci = nums[i] - 1;
    		if(i != ci && nums[ci] != nums[i]) {
    			int temp = nums[ci];
    			nums[ci] = nums[i];
    			nums[i] = temp;
    		}else {
    			i++;
    		}
    	}
    	for (int j = nums.length - 1; j >= 0; j--) {
			if(nums[j] -1  != j) {
				list.add(nums[j]);
			}
		}
    	return list;
    }
//    https://leetcode.com/problems/set-mismatch/
    public static int[] findErrorNums(int[] nums){
    	int res[] = new int[nums.length];
    	int i = 0;
    	while(i < nums.length) {
    		int ci = nums[i] - 1;
    	} 
    	i = 0;
    	for (int j = nums.length - 1; j >= 0; j--) {
			if(nums[j] - 1  != j) {
				res[i++] = nums[j];
				res[i++] = j+1;
			}
		}
    	return res;
    }
}