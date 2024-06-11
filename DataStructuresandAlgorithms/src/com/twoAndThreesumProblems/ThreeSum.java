package com.twoAndThreesumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, -1, -1, -4, 1, 0, 2};
        for (List<Integer> list : threeSum(nums)) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int s = i + 1;
            int e = len - 1;
            while (s < e) {
                int cSum = nums[s] + nums[e];
                if (cSum == target) {
                    lists.add(Arrays.asList(nums[i], nums[s], nums[e]));
                    s++;
                    while (s < e && nums[s] == nums[s - 1]) {
                        s++;
                    }
                    while(e > s && nums[e] == nums[e - 1]){
                        e--;
                    }
                } else if (cSum > target) {
                    e--;
                } else {
                    s++;
                }
            }
        }
        return lists;
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        if (nums.length < 3) {
            return answer;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum > 0) {
                    high--;
                } else if (sum < 0) {
                    low++;
                } else {
                    answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    int lastLowOccurrence = nums[low];
                    int lastHighOccurrence = nums[high];

                    while (low < high && nums[low] == lastLowOccurrence) {
                        low++;
                    }

                    while (low < high && nums[high] == lastHighOccurrence) {
                        high--;
                    }
                }
            }
        }
        return answer;
    }
}

