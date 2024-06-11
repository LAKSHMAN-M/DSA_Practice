package com.recursion.arrays;

import java.util.Arrays;

public class PrintNums {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4 , 5};
        int n = nums.length;
        System.out.println(Arrays.toString(reverseArray(n, nums)));
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[] = new int[x];
        return addNums(arr, x - 1);
    }
    static int[] addNums(int arr[], int st){
        if(st< 0) return arr;
        addNums(arr, st - 1);
        arr[st]=st + 1;
        return arr;
    }
    static int i = 0;
    public static int[] reverseArray(int n, int []nums) {
        if( i == n) return nums;
        int temp = nums[i];
        nums[i] = nums[n - 1 - i];
        nums[n - 1 - i] = temp;
        i++;
        reverseArray(n, nums);
        return nums;
    }
}