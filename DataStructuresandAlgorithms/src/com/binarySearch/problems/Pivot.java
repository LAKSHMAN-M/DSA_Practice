package com.binarySearch.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Pivot {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(0, Arrays.asList(3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,12 ,2 ));

        System.out.println(pivot(arr));
        System.out.println(search(arr, arr.size(), 12));

    }
    public static int search(ArrayList<Integer> arr, int n, int k) {
        if(arr.size() == 0){
            return -1;
        }
        int pivot = pivot(arr);
        if(pivot == -1){
            return binarySearch(arr, k, 0, arr.size() - 1);
        }
        int leftPart = binarySearch(arr, k, 0, pivot );
        int rightPart = binarySearch(arr, k, pivot + 1, arr.size() - 1);
        return leftPart >= rightPart ? leftPart : rightPart;
    }
    static int pivot(ArrayList<Integer> arr) {
        int st = 0;
        int end = arr.size() - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid < end && arr.get(mid) > arr.get(mid + 1) ) {
                return mid;
            } else if (mid > st && arr.get(mid - 1)  > arr.get(mid) ) {
                return mid - 1;
            } else if (arr.get(st)  > arr.get(mid) ) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(ArrayList<Integer> arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if(start <= end) {
            if( arr.get(mid)  == target) return mid;
            else if(target < arr.get(mid)) return binarySearch(arr, target, start, mid - 1);
            else if(target> arr.get(mid) )	return binarySearch(arr, target, mid + 1, end);
        }
        return -1;
    }
}
