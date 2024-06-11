package com.sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
//		Note : this will only for Positive numbers only 1 - N and it should contain only distinct elements
        int[] array = {8 ,4 ,1 ,6 ,7 ,2 ,5 ,8 };
		System.out.println(cyclic(array));
		System.out.println(Arrays.toString(array));
    }

    //	Cyclic Sort : This is a simple sorting algorithm that build a
//	sorted numbers by taking the first element from unsorted array 
//	and place at correct index based on the value of respective index this will done till length(n) - 1 times 
//	Time Complexity : WorstCase : O(n) and swaps = N - 1 + N, Best Case : O(n) and swaps = N - 1
    static void cyclicSort(int[] arr) {
        int i = 0;
//		we use while loop because when the element is at correct position then only we increment to next element
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (i != correctIndex) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    //	swapping
    static void swap(int arr[], int i, int correctIndex) {
        int temp = arr[correctIndex];
        arr[correctIndex] = arr[i];
        arr[i] = temp;
    }

    //	https://leetcode.com/problems/missing-number/solutions/
    static int cyclic(int[] arr) {
        int i = 0;
//		we use while loop because when the element is at correct position then only we increment to next element
        while (i < arr.length) {
//			int correctIndex = arr[i];
//			if(correctIndex == arr.length) {
//				i++;
//			}
//			else if (i != correctIndex) {
//				int temp = arr[correctIndex];
//				arr[correctIndex] = arr[i];
//				arr[i] = temp;
//			} else {
//				i++;
//			}
            if (arr[i] != arr.length && i != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            } else {
                i++;
            }
        }
        for (int res = 0; res < arr.length; res++) {
            if (arr[res] != res) {
                return res;
            }
        }
        return arr.length;
    }

}
