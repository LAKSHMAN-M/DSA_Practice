package com.binarySearch.problems;

public class RoseGarden {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 2, 1 };
        int m = 89945;
        int k = 89945;
        System.out.println((long)m * k);
        System.out.println(minDays(arr, m, k));
    }
    public static int minDays(int[] arr, int m, int k) {

        if(arr.length < ((long)k * (long)m)){
            return -1;
        }

        int st = Integer.MAX_VALUE, end = Integer.MIN_VALUE;
        for(int i : arr){
            st = Math.min(st, i);
            end = Math.max(end, i);
        }
//        int ans = -1;
        while(st <= end){
            int mid = st + ( end - st ) / 2;
            if(bouquetCount(arr, mid, k, m) >= m){
                end = mid - 1;
            }else{
                st = mid + 1;
//                ans = st;
            }
        }

        return st;
    }

    static int bouquetCount(int[] arr, int day, int k, int m){
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(maxCount >= m){
                return maxCount;
            }
            if(arr[i] <= day){
                count++;
            }else{
                maxCount += (count / k);
                count = 0;
            }
        }
        maxCount += (count / k);
        return maxCount;
    }
}