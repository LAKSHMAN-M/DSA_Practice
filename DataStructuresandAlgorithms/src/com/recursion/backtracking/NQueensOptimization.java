package com.recursion.backtracking;

import java.util.*;

public class NQueensOptimization {

    public List<List<String>> queens(int n) {
        List<List<String>> res = new ArrayList<>(); //store the result

        Set<Integer> leftRow = new HashSet<>(); //create a hashset to check for attacks
        Set<Integer> lowerDiagonal = new HashSet<>();
        Set<Integer> upperDiagonal = new HashSet<>();

        List<List<String>> board = new ArrayList<>(); //create empty board
        for (int i = 0; i < n; i++) {
            List<String> eachBoardRow = new ArrayList<>();
            for (int j = 0; j < n; j++)
                eachBoardRow.add(".");

            board.add(eachBoardRow); //add each row to board
        }
        //call the method
        nQueens(0, n, board, leftRow, lowerDiagonal, upperDiagonal, res);
        return res;
    }


    //chess board main
    private void nQueens(int col, int n, List<List<String>> board, Set<Integer> leftRow, Set<Integer> lowerDiagonal, Set<Integer> upperDiagonal, List<List<String>> res) {
        if (col == n) {
            //add the chessboard result to resultant list
            addBoardToList(n, board, res);
            return;
        }
        //check for safe or not
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, n, leftRow, lowerDiagonal, upperDiagonal)) {

                board.get(row).set(col, "Q"); //set the row and col value to 'Q'

                //add values to the hashset
                leftRow.add(row);
                lowerDiagonal.add(row + col);
                upperDiagonal.add((n - 1) - (col - row));

                //call the function again
                nQueens(col + 1, n, board, leftRow, lowerDiagonal, upperDiagonal, res);


                board.get(row).set(col, "."); //reset the row and col value to '.'

                //remove values from hashsets
                leftRow.remove(row);
                lowerDiagonal.remove(row + col);
                upperDiagonal.remove((n - 1) - (col - row));
            }
        }
    }

    private static void addBoardToList(int n, List<List<String>> board, List<List<String>> res) {
        List<String> al = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {//store the result in reverse order
            StringBuilder sb = new StringBuilder(); // create a string builder this will store each row
            for (int j = 0; j < n; j++) {
                sb.append(board.get(i).get(j));
            }
            al.add(sb.toString());  // add each row to the resultant list
        }
        res.add(al);
    }

    private boolean isSafe(int row, int col, int n, Set<Integer> leftRow, Set<Integer> lowerDiagonal, Set<Integer> upperDiagonal) {
                    //check each row and  left and right diagonals
                //leftRow
        return !leftRow.contains(row) &&
                //lowerDiagonal
                !lowerDiagonal.contains(row + col) &&
                // upper diagonal
                !upperDiagonal.contains((n - 1) - (col - row));
    }
}

