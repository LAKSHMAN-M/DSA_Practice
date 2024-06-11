package com.permutations;

import com.recursion.backtracking.*;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        NQueensOptimization obj = new NQueensOptimization();
//        List<List<String>> res = obj.queens(5);
//        for (List<String> str : res) {
//            System.out.println(str);
//        }
        int [] num = {7,8,9,11,12};
        Main obj = new Main();
        System.out.println(obj.firstMissingPositive(num));
    }

    public int firstMissingPositive(int[] nums) {
        //brute force
        Set<Integer> hs = new TreeSet<>();
        for (int i : nums) {
            if(i >0)
            hs.add(i);
        }
        int i = 1;
        for (Integer num : hs) {
            if (i != num) {
                return i;
            }
            i++;
        }
        return i;
    }

}
