package com.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public List<List<String>> nQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] chars = new char[n][n];
        printBoard(n, chars, true);
        nqueen(0, chars, n, list);
        return list;
    }

    //n queen method
    public void nqueen(int col, char[][] chars, int n, List<List<String>> res) {
        if (col == chars.length) {
            printBoard(n, chars, false);
            addToResult(res, chars, n);
            return;
        }
        //check for queens
        for (int row = 0; row < chars.length; row++) {
            if (isSafe(row, col, chars)) {
                //set the row and col th value to 'Q'
                chars[row][col] = 'Q';
                nqueen(col + 1, chars, n, res);
                //reset the row and col th value to 'Q'
                //this will help for above calls
                chars[row][col] = '.';
            }
        }
    }

    //printing and adding to board
    private static void printBoard(int n, char[][] chars, boolean doPrint) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (doPrint) chars[i][j] = '.';
                else {
//                    System.out.print(chars[i][j] + "  ");
                }
            }
//            System.out.println();
        }
    }


    //adding the chess board to resultant list
    private void addToResult(List<List<String>> res, char[][] chars, int n) {
        for (int i = 0; i < n; i++) {
            List<String> strList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                strList.add("" + chars[i][j]);
            }
            res.add(strList);
        }
    }

    //checking for safe or not
    private boolean isSafe(int row, int col, char[][] chars) {

        //check for left row
        for (int i = col; i >= 0; i--) {
            if (chars[row][i] == 'Q') return false;
        }

        //check for upper left diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (chars[r][c] == 'Q') return false;
        }

        //check for lower right diagonal
        for (int r = row, c = col; r < chars.length && c >= 0; r++, c--) {
            if (chars[r][c] == 'Q') return false;
        }

        return true;
    }
}
