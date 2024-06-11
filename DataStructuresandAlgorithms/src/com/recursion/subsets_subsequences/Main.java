package com.recursion.subsets_subsequences;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4};
        Main obj = new Main();
        System.out.println(obj.subSetSum(arr));

    }

    public List<Integer> subSetSum(int[] n) {
        List<Integer> list = new ArrayList<>();
        backtrack(n, 0, 0, list);
        Collections.sort(list);
        return list;
    }

    private void backtrack(int[] nums, int index, int sum, List<Integer> list) {
        if(index == nums.length){
            list.add(sum);
            return;
        }
        backtrack(nums, index + 1, sum + nums[index], list);
        backtrack(nums, index + 1, sum, list);
    }
}
