package com.permutations;
import java.util.*;

public class CombinationSumIII {
    public static void main(String[] args) {
        CombinationSumIII obj = new CombinationSumIII();
        List<List<Integer>> res = obj.combinationSum3(3, 9);
        for(List<Integer> list : res){
            System.out.println(list);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(1, n, k, list, result);
        return result;
    }

    private void backtrack(int start, int sum, int size, List<Integer> list, List<List<Integer>> result) {
        if (sum < 0 || list.size() > size) return;

        // Base case
        if (sum == 0 && list.size() == size) {
            result.add(new ArrayList<>(list));
            return;
        }

        // Pick element
        for (int i = start; i <= 9; i++) {
            list.add(i);
            backtrack(i + 1, sum - i, size, list, result);
            list.remove(list.size() - 1);
        }
    }
}
