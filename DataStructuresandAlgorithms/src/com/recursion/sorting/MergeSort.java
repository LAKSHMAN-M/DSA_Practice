//package com.recursion.sorting;
//
//import java.util.Arrays;
//
//public class MergeSort {
//    static int[] mergeSort(int nums[]){
//        if(nums.length == 1){
//            return nums;
//        }
//        int mid = nums.length / 2;
//        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
//        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
//        return merge(left, right);
//    }
//
//    private static int[] merge(int[] firstArr, int[] secondArr) {
//        int[] mergerArray = new int[firstArr.length + secondArr.length];
//
//    }
//
//}
