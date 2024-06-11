package com.binarySearch.problems;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 8, 8, 8, 8, 10};
        int target = 10;
        System.out.println(firstAndLastOccurence(arr, target, true));
        System.out.println(firstAndLastOccurence(arr, target, false));
    }

    static int firstAndLastOccurence(int[] arr, int target, boolean isFirst) {
        int st = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                st = mid + 1;
            } else {
                    ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
//                    ans = end - 1;
                    st = mid + 1;
                }
            }
        }
        return ans;
    }
}
