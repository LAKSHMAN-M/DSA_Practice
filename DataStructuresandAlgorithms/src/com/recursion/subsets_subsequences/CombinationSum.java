package com.recursion.subsets_subsequences;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return getCombinationSum(candidates, 0, target, new ArrayList<>());
    }

    public List<List<Integer>> getCombinationSum(int[] candidates, int index, int target, List<Integer> list) {
        List<List<Integer>> res = new ArrayList<>();
        if (index == candidates.length) {
            if (target == 0) {
                res.add(new ArrayList<>(list));
                return res;
            }
            return res;
        }
        if (candidates[index] <= target) {
            //pick
            list.add(candidates[index]);
            res.addAll(getCombinationSum(candidates, index, target - (candidates[index]), list));
            list.remove(list.size() - 1);
        }
        //not pick
        res.addAll(getCombinationSum(candidates, index + 1, target, list));
        return res;
    }
}
