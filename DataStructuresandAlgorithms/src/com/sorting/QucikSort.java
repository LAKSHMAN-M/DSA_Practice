package com.sorting;

import java.util.Arrays;

public class QucikSort {
    public static void main(String[] args) {
        int[] array = {13, 12, 8, 1, 2};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    //    static void quickSort(int[] array, int start, int end) {
//        if (end <= start) {
//            return;
//        }
//        int pivot = partition(array, start, end);
//        quickSort(array, start, pivot - 1);
//        quickSort(array, pivot + 1, end);
//    }
//
//    static int partition(int[] array, int start, int end) {
//        int pivot = array[end];
//        int i = start - 1;
//        for (int j = start; j < end; j++) {
//            if (array[j] < pivot) {
//                i++;
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//        i++;
//        int temp = array[i];
//        array[i] = array[end];
//        array[end] = temp;
//        return i;
//    }
    public static void quickSort(int[] arr, int startIndex, int endIndex) {

        if (endIndex <= startIndex) return;


        int pivot = partition(arr, startIndex, endIndex);

        quickSort(arr, startIndex, pivot - 1);
        quickSort(arr, pivot + 1, endIndex);

    }

    private static int partition(int[] arr, int st, int end) {
        int i = st - 1;
        int pivotEle = arr[end];
        for (int j = st; j <= end; j++) {
            if (arr[j] < pivotEle) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
