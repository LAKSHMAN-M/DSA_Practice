package com.sorting;


import java.util.Arrays;
public class MergeSort2 {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0, 5};

        System.out.println(Arrays.toString(mergeSort2(arr)));
    }
    static int[] mergeSort2(int arr[]){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort2(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort2(Arrays.copyOfRange(arr, mid, arr.length));
        return merge2(left, right);
    }

    static int[] merge2(int[] left, int[] right){
        int[] temp = new int[left.length + right.length];
        int low =0;
        int high = 0;
        int i = 0;
        int len1 = left.length - 1;
        int len2 = right.length - 1;
        while(low <= len1 && high <= len2){
            if(left[low] <= right[high]){
                temp[i] = left[low];
                low++;
            }else{
                temp[i] = right[high];
                high++;
            }
            i++;
        }
        while(low <= len1){
            temp[i] = left[low];
            i++;
            low++;
        }
        while(high <= len2){
            temp[i] = right[high];
            i++;
            high++;
        }
        return temp;
    }
}