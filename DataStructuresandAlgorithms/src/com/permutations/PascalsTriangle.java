package com.permutations;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    static List<List<Integer>> generate(int numRows){
        numRows -= 1;
        List<List<Integer>> listOfList = new ArrayList<>();
        for(int i = 0 ; i <= numRows; i++){
            listOfList.add(generateRows(i));
        }
    return listOfList;
    }
    static List<Integer> generateRows(int row){
        List<Integer> ls = new ArrayList<>();
        int ans = 1;
        ls.add(ans);
        for(int i = 0; i < row; i++){
            ans = ans * (row - i);
            ans = ans / (i + 1);
            ls.add(ans);
        }
        return ls;
    }
}
