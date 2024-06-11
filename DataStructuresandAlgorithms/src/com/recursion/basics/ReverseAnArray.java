package com.recursion.basics;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        ReverseAnArray obj = new ReverseAnArray();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
//        System.out.println("Before : "+Arrays.toString(arr));
//        obj.reverse(arr, 0, arr.length - 1);
//        System.out.println("After : "+Arrays.toString(arr));
        System.out.println("Before : "+Arrays.toString(arr));
        obj.reverse2(arr, 0);
        System.out.println("After : "+Arrays.toString(arr));

    }
    public void reverse(int[] arr, int l, int r){
        if(l > r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l + 1, r - 1);
    }
    public void reverse2(int[] arr, int i){
        if(i >= arr.length / 2) return;
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1 ] = temp;
        reverse2(arr, i + 1);
    }
}
