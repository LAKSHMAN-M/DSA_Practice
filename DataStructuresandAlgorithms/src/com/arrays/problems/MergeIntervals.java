package com.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] arr2 = {{2, 2}, {2, 3}, {2, 5}, {3, 6}, {4, 4}, {4, 5}, {6, 6}, {8, 9}, {40, 100}};
        mergeOverlappingIntervals(arr);
//        for (List<Integer> list : mergeOverlappingIntervals(arr)) {
//            System.out.println(list);
//        }
    }

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        // Write your code here.
        List<List<Integer>> res = new ArrayList<>();
        int l1 = arr[0][0], r1 = arr[0][1];
//        int l0 = -1, r0 = -1;
        for (int i = 1; i < arr.length; i++) {
            int l2 = arr[i][0], r2 = arr[i][1];
            if (l1 <= l2 && l2 <= r1) {
//                r1 = Math.max(r1, r2);
                if (r1 > r2) {
                    r1 = r1;
                } else {
                    r1 = r2;
                }
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(l1);
                list.add(r1);
                res.add(list);
                l1 = l2;
                r1 = r2;
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(l1);
        list.add(r1);
        res.add(list);
        int[][] r = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            List<Integer> l =new ArrayList<>(res.get(i));
            r[i][0] = l.get(0);
            r[i][1] = l.get(1);
        }
        for(int[] i : r){
            System.out.println(Arrays.toString(i));
        }
        return res;
    }
}

