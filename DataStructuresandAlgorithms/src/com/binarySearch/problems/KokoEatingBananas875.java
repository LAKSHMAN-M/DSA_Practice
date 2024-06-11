package com.binarySearch.problems;

public class KokoEatingBananas875 {
    public static void main(String[] args) {
        int[] piles = {1000000000};
        int h = 2;
        System.out.println(minEatingSpeed(piles, h));
    }

//    static int minEatingSpeed(int[] piles, int h) {
//        int maxK = Integer.MIN_VALUE;
//        for (int i = 0; i < piles.length; i++) {
//            if (maxK < piles[i])
//                maxK = piles[i];
//        }
//
//        for (int i = 1; i <= maxK; i++) {
////            this will gives the max hours for koko to eat
//            int totalHours = totalHoursToFinish(piles, i);
//            if (totalHours == h) {
//                return i;
//            }
//        }
//
//        return maxK;
//    }
//
    private static int totalHoursToFinish(int[] piles, int k) {
        int totalHours = 0;
        for (int i : piles) {
            int temp = i / k;
            totalHours += temp;
            if(i % k != 0) totalHours++;
        }
        return totalHours;
    }

    static int minEatingSpeed(int[] piles, int h) {
        int st = 1;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (end < piles[i])
                end = piles[i];
        }

//        int minK = Integer.MAX_VALUE;
        while(st < end){
            int mid = st + (end - st ) / 2;
            int totalHours = totalHoursToFinish(piles, mid);
            if(totalHours <= h){
                end = mid;
            }else{
                st = mid + 1;
            }
        }
        return st;
    }

}
