package com.arrays.problems;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int num : nums1){
            hs.add(num);
        }

        for(int intersectElement : nums2){
            if(hs.contains(intersectElement)){
                intersection.add(intersectElement);
            }
        }

        int arrLen = intersection.size();
        int[] result = new int[arrLen];
        int index = 0;

        for(Integer i : intersection){
            result[index++] = i;
        }
        return result;
    }
}
