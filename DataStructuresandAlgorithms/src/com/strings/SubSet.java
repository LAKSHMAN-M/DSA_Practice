package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> list = subSetDuplicates(nums);
        for (List<Integer> ls : list) {
            System.out.print(ls + ", ");
        }
    }

    static List<List<Integer>> subSet(int[] nums) {
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int outerListLen = outerList.size();
            for (int j = 0; j < outerListLen; j++) {
                List<Integer> internalList = new ArrayList<>(outerList.get(j));
                internalList.add(nums[i]);
                outerList.add(internalList);
            }
        }
        return outerList;
    }

    static List<List<Integer>> subSet2(int[] nums) {
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        for (int i : nums) {
            int n = outerList.size();
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> intenalList = new ArrayList<>(outerList.get(j));
                intenalList.add(i);
                outerList.add(intenalList);
            }
        }
        return outerList;
    }

    //    if array contains duplicates means
    static List<List<Integer>> subSetDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        for (int i = 0 ;i < nums.length ; i++) {
            int start = 0;
            int end = outerList.size();
            if( i > 0 && nums[i] == nums[i - 1]){
                start = start + (end - start ) / 2;
            }
            for (int j = start; j < end; j++) {
                ArrayList<Integer> intenalList = new ArrayList<>(outerList.get(j));
                intenalList.add(nums[i]);
                outerList.add(intenalList);
            }
        }
        return outerList;
    }

}
