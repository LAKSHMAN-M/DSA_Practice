package com.twoPointers;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            if(nums[i] == 0){
                while(j != nums.length){
                    if(nums[j] != 0){
                      swap(nums, i, j);
                      break;
                    }else{
                        j++;
                    }
                }
            }
        }
    }
    static void swap (int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void moveZeroes2(int[] nums)
    {
        int i = 0;
        for (int num : nums)
        {
            if (num != 0)
            {
                nums[i] = num;
                i++;
            }
        }
        while (i <= nums.length - 1)
        {
            nums[i] = 0;
            i++;
        }
    }
}
