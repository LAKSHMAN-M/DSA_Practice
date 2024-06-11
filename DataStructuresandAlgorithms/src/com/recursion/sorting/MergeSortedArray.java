package com.recursion.sorting;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 19, 0, 0};
        int[] nums2 = {12, 20};
        int m = 4;
        int n = 2;
        merge(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // two pointers
        m = m - 1;
        n = n - 1;
        int k = nums1.length - 1;// which is equals to nums1.length
        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[k] = nums1[m];
                k--;
                m--;
            } else {
                nums1[k] = nums2[n];
                k--;
                n--;
            }
        }
    }
}
