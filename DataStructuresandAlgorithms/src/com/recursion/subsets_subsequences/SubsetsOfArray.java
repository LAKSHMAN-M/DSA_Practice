package com.recursion.subsets_subsequences;

import java.util.*;

public class SubsetsOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        List<ArrayList<Integer>> res = subset2(arr);
        for (ArrayList<Integer> list : res){
            System.out.print(list+", ");
        }
    }
    private static List<ArrayList<Integer>> subset(int[] array){
        List<ArrayList<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        for(int i : array){
            int size = outerList.size();
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> innerList = new ArrayList<>(outerList.get(j));
                innerList.add(i);
                outerList.add(innerList);
            }
        }
        return outerList;
    }
    private static List<ArrayList<Integer>> subset2(int[] array){
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(new ArrayList<>());
        return helper(array,0, list);
    }
    private static List<ArrayList<Integer>> helper(int[] arr,int index,  List<ArrayList<Integer>> list){
        if(index == arr.length) return list;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> inner = new ArrayList<>(list.get(i));
            inner.add(arr[index]);
            list.add(inner);
        }
        return helper(arr, index + 1, list);
    }
}
