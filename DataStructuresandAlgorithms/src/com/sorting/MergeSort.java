package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, -3, 2, -1, 0, 15};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
//    static void mergeSort(int arr[], int low, int high){
//        if(low >= high){
//            return;
//        }
//        int mid = low + (high - low) / 2;
//        mergeSort(arr, low, mid);
//        mergeSort(arr, mid + 1, high);
//        merge(arr, low, mid, high);
//    }
//
//    private static void merge(int[] arr, int low, int mid, int high) {
//        int left = low, right = mid + 1;
//        ArrayList<Integer> al = new ArrayList<>();
//        while(left <= mid && right <= high){
//            while (left <= mid && arr[left] <= arr[right]){
//                al.add(arr[left]);
//                left++;
//            }
//            while(right <= high && arr[left] > arr[right]){
//                al.add(arr[right]);
//                right++;
//            }
//        }
//        while(left <= mid){
//            al.add(arr[left]);
//            left++;
//        }
//        while(right <= high){
//            al.add(arr[right]);
//            right++;
//        }
//        int index = 0;
//        for(int i = low; i <= high; i++){
//            arr[i] = al.get(index++);
//        }
//    }

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l >= r) return;
        int mid = l + ( r - l )/ 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }
    private static void merge(int[] arr, int low, int mid, int high){
        int leftSt = low, rightSt = mid+1;
        ArrayList<Integer> al = new ArrayList<>();
        while(leftSt <= mid && rightSt <= high){
            if(arr[leftSt] < arr[rightSt]){
                al.add(arr[leftSt]);
                leftSt++;
            }else{
                al.add(arr[rightSt]);
                rightSt++;
            }
        }

        //left over elements
        while(leftSt <= mid){
            al.add(arr[leftSt]);
            leftSt++;
        }
        while(rightSt <= high){
            al.add(arr[rightSt]);
            rightSt++;
        }

        int i = 0;
        for (int j = low; j <= high; j++) {
            arr[j] = al.get(i++);
        }
    }
}
