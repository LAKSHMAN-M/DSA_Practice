package com.permutations;

import java.util.*;

public class PermutationGenerate {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        PermutationGenerate obj = new PermutationGenerate();
        List<List<Integer>> al = obj.permute(arr);
        for(List list : al){
            System.out.print(al+" , ");
        }

    }
    public List<List<Integer>> getPermutations(int[] arr) {
        List<List<Integer>> resList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Set<Integer> indices = new HashSet<>();
        helper(arr, indices, stack, resList);
        return resList;
    }

    private void helper(int[] arr, Set<Integer> indices, Stack<Integer> stack, List<List<Integer>> resList) {
        if (stack.size() == arr.length) {
            resList.add(new ArrayList<>(stack));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!indices.contains(i)) {
                stack.push(arr[i]);
                indices.add(i);
                helper(arr, indices, stack, resList);
                stack.pop();
                indices.remove(i);
            }
        }
    }
    //Approach II
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> resList = new ArrayList<>();
        helper2(arr, 0, resList);
        return resList;
    }
    private void helper2(int[] arr, int index, List<List<Integer>> list){
        if(index == arr.length){//copy the result to list
            List<Integer> al = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                al.add(arr[i]);
            }
            list.add(al);
            return;
        }
        for(int i = index; i < arr.length; i++){
            //swap itself
            swap(arr, index, i);
            helper2(arr, index + 1, list);
            swap(arr, index, i);
        }
    }

    private static void swap(int[] arr, int index, int i) {
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }
}

