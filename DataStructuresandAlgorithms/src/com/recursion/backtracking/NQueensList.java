package com.recursion.backtracking;

import java.util.*;

public class NQueensList {
    public List<List<String>> queens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < n; j++)
                temp.add(".");

            list.add(temp);
        }
        nQueens(0, n, list, res);
        return res;
    }


    //chess board main
    private void nQueens(int col, int n, List<List<String>> list, List<List<String>> res) {
        if (col == n) {
            List<String> al = new ArrayList<>();
            for (int i = n - 1; i >= 0; i--) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(list.get(i).get(j));
                }
                al.add(sb.toString());
            }
            res.add(al);
            return;
        }
        //check for safe or not
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, n, list)) {
                //set the row and col value to 'Q'
                list.get(row).set(col, "Q");
                nQueens(col + 1, n, list, res);
                //call the function again
                list.get(row).set(col, ".");
            }
        }
    }

    private boolean isSafe(int row, int col, int n, List<List<String>> list) {

        //check for row left
        List<String> rowlist = new ArrayList<>(list.get(row));
        for (int c = col; c >= 0; c--)
            if (rowlist.get(c).equals("Q")) return false;

        //check for upper diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--)
            if (list.get(r).get(c).equals("Q")) return false;

        //check for lower diagonal
        for (int r = row, c = col; r < n && c >= 0; r++, c--)
            if (list.get(r).get(c).equals("Q")) return false;

        return true;
    }
}
