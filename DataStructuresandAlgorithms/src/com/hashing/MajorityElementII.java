package com.hashing;

import java.util.*;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {2};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 1){
            list.add(nums[0]);
            return list;
        }
        //brute force
        int c1 = 0, c2 = 0;
        int e1 = Integer.MIN_VALUE, e2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (c1 == 0 && e2 != num) {
                c1++;
                e1 = num;
            } else if (c2 == 0 && e1 != num) {
                c2++;
                e2 = num;
            } else if (e1 == num) {
                c1++;
            } else if (e2 == num) {
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        int minTimes = (nums.length / 3) + 1;
        c1 = 0;
        c2 = 0;
        for (int num : nums) {
            if (e1 == num) c1++;
            if (e2 == num) c2++;
        }
        if (c1 >= minTimes) list.add(e1);
        if (c2 >= minTimes) list.add(e2);
        Collections.sort(list);
        return list;
    }
}
