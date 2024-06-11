package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class NoOfInversions {
    public static void main(String[] args) {
//        int[] arr = {5, 3, 2, 1, 4};
//        int count = mergeSort(Arrays.copyOfRange(arr, 0, arr.length), 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(count);
        String s1 = "fl";
        String s2 = "flight";
        StringBuilder sb = new StringBuilder();
        
        System.out.println(s2.indexOf(s1));
    }
    static int mergeSort(int copiedArray[], int low, int high){
        if(low >= high){
            return 0;
        }
        int count = 0;
        int mid = low + (high - low) / 2;
        count += mergeSort(copiedArray, low, mid);
        count += mergeSort(copiedArray, mid + 1, high);
        count += merge(copiedArray, low, mid, high);
        return count;
    }

    private static int merge(int[] copiedArray, int low, int mid, int high) {
        int left = low, right = mid + 1;
        int count = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while(left <= mid && right <= high){
            if(copiedArray[left] <= copiedArray[right]){
                al.add(copiedArray[left]);
                left++;
            }else{
                al.add(copiedArray[right]);
                count += (mid - left + 1);
                right++;
            }
        }
        while(left <= mid){
            al.add(copiedArray[left]);
            left++;
        }
        while(right <= high){
            al.add(copiedArray[right]);
            right++;
        }
        int index = 0;
        for(int i = low; i <= high; i++){
            copiedArray[i] = al.get(index++);
        }
        return count;
    }

}
