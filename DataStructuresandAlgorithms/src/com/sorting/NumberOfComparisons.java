package com.sorting;

public class NumberOfComparisons {
    public static void main(String[] args) {
        int [] arr = {5, 3, 2, 1, 4};
        System.out.println(numberOfInversions(arr, arr.length));
    }
    public static int numberOfInversions(int[] a, int n) {
        return mergeSort(a, 0, n - 1);
    }

    static int mergeSort(int[] a, int start, int end) {
        int count = 0;
        if (start == end) {
            return count;
        }

        int mid = (start + end) / 2;
        count += mergeSort(a, start, mid); // left array*
        count += mergeSort(a, mid + 1, end); // right array*
        count += merge(a, start, end, mid);
        return count;
    }


    /**
     * left part of array (0...m)
     * <p>
     * right part of array (m+1 ...n)
     * <p>
     * if left element is smaller just increment left pointer
     * <p>
     * else shift elements between left and right by one to the right
     * <p>
     * while shifting count the shifts
     */

    static int merge(int[] a, int start, int end, int mid) {

        int i = start; //first pointer of 'left' part of array
        int j = mid + 1; //second pointer of 'right' part of array
        int count = 0;

        while (i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                i++;
            } else {
                int temp = a[j];
                int index = j;
//start shifting
                while (index > i) {
                    a[index] = a[index - 1];
                    index--;
                    count++;
                }
                a[i] = temp;
                i++;
                mid++;
                j++;
            }
        }
        return count;
    }
}
