package com.twoAndThreesumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
        int[] nums2 = {-4, -1, -1, 0, 0, 1, 1, 2, 2};
        for (List<Integer> list : fourSum(nums, -294967296)) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < len - 1; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int st = j + 1;
                int end = len - 1;
                while (st < end) {
                    long sum = nums[i] + nums[j];
                    sum += nums[st];
                    sum += nums[end];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[st], nums[end]));
                        st++;
                        end--;
                        while (st < end && nums[st] == nums[st - 1]) st++;
                        while (st < end && nums[end] == nums[end + 1]) end--;
                    } else if (sum > target) {
                        end--;
                    } else {
                        st++;
                    }
                }
            }
        }
        return res;
    }
//    public static List<List<Integer>> fourSum2(int[] nums, int target) {
//        List<List<Integer>> res = new ArrayList<>();
//        int len = nums.length;
//        Arrays.sort(nums);
//
//        for (int i = 0; i < len - 3; i++) {
//            if (i > 0 && nums[i] == nums[i - 1]) {
//                continue;
//            }
//            for (int j = i + 1; j < len - 2; j++) {
//                if (j > i + 1 && nums[j] == nums[j - 1]) {
//                    continue;
//                }
//                int sum = target - (nums[i] + nums[j]);
//
//                int s = j + 1, e = len - 1;
//                while (s > j + 1 && s < len && e > s) {
//                    int cSum = nums[s] + nums[e];
//                    if (cSum == sum) {
//                        List<Integer> quad = new ArrayList<>();
//                        quad.add(nums[i]);
//                        quad.add(nums[j]);
//                        quad.add(nums[s]);
//                        quad.add(nums[e]);
//                        res.add(quad);
//
//                        s++;
//                        while (s > j + 1 && s < len && nums[s] == nums[s - 1]) {
//                            s++;
//                        }
//                        while (e > s && nums[e] == nums[e - 1]) { // Skip duplicates of nums[e]
//                            e--;
//                        }
//                    } else if (cSum < sum) {
//                        s++;
//                    } else {
//                        e--;
//                    }
//                }
//            }
//        }
//        return res;
//    }

}
