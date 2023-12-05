package com.arrays.problems;

import java.util.Arrays;

public class SmalletThanCurrentNumber {

	public static void main(String[] args) {
		int[] nums = {8,1,2,2,3};
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
	}
	public  static int[] smallerNumbersThanCurrent(int[] nums) {
		int resNum[] = new int[nums.length];
        for(int i = 0; i < nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(j != i && nums[j] < nums[i]){
                    count++;
                }
            }
            resNum[i] = count;
        }
        return resNum;
    }
}
