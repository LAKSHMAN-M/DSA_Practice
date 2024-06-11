package com.list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    //    public static void rotate(int[] nums, int k) {
//        List<Integer> list = new ArrayList<>();
//        for(int i : nums){
//            list.add(i);
//        }
//
//        for(int j = 1; j <= k; j++){
//            list.add(0, list.get(nums.length - 1));
//            list.remove(list.size() - 1);
//        }
//
//        for(int index = 0; index < nums.length; index++){
//            nums[index] = list.get(index);
//        }
//    }
//    public static void rotate2(int[] nums , int k){
//        if(k > nums.length){
//            k = k % nums.length;
//        }
//        int len = nums.length;
//        int[] temp = new int[len];
//        int i = 0;
//        int origK = k;
//        while(k != 0){
//            temp[i] = nums[len - k];
//            i++;
//            k--;
//        }
//
//        for(int j = 0 ; j < len - origK && origK > 0; j++){
//            temp[i] = nums[j];
//            i++;
//        }
//        for(int j = 0; j < len  && origK > 0; j++){
//            nums[j] = temp[j];
//        }
//    }
    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k %= nums.length;
        }
        swap(nums, 0, nums.length - k - 1);
        swap(nums, nums.length - k, nums.length - 1);
        swap(nums, 0, nums.length - 1);
    }

    public static void swap(int[] nums, int st, int end) {
        while (st < end) {
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
}
