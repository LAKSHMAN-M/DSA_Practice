package com.recursion.arrays;

import java.util.ArrayList;

public class FindElementUsingRecurrsion {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 5, 6, 6, 7};
        int target = 6;
        System.out.println(findElement(nums, target, 0));
    }
    static ArrayList<Integer> findElement(int nums[], int target, int index){
        ArrayList<Integer> ls = new ArrayList<>();
        if(index == nums.length) return ls;
        if(target == nums[index])
            ls.add(index);
        ArrayList<Integer> belowPasses = findElement(nums, target, index + 1);
        ls.addAll(belowPasses);
        return ls;
    }
}
