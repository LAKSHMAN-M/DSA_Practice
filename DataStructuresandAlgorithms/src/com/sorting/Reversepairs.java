package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Reversepairs {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 3, -5, -5};
        int count = mergeSort(Arrays.copyOfRange(arr, 0, arr.length), 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }

    static int mergeSort(int copiedArray[], int low, int high) {
        int count = 0;
        if (low >= high) {
            return count;
        }
        int mid = low + (high - low) / 2;
        count += mergeSort(copiedArray, low, mid);
        count += mergeSort(copiedArray, mid + 1, high);
        count += beforeMerge(copiedArray, low, mid, high);
        merge(copiedArray, low, mid, high);
        return count;
    }

    private static int beforeMerge(int[] copiedArray, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for(int i = low; i <= mid; i++){
            while(right <= high && copiedArray[i] > 2 * (long) copiedArray[right]) right++;
            count += (right - ( mid + 1));
        }
        return count;
    }

    private static void merge(int[] copiedArray, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> al = new ArrayList<>();
        while (left <= mid && right <= high) {
            if(copiedArray[left] < copiedArray[right]) {
                al.add(copiedArray[left]);
                left++;
            } else {
                al.add(copiedArray[right]);
                right++;
            }
        }
        while (left <= mid) {
            al.add(copiedArray[left]);
            left++;
        }
        while (right <= high) {
            al.add(copiedArray[right]);
            right++;
        }
        int index = 0;
        for (int i = low; i <= high; i++) {
            copiedArray[i] = al.get(index++);
        }
    }
}
