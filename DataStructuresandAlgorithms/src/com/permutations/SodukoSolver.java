package com.permutations;

import java.util.Arrays;

public class SodukoSolver {
    public static void main(String[] args) {
        char[][] sudokuBoard = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] sudokuBoard2 = {
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };
        SodukoSolver obj = new SodukoSolver();
        obj.solveSudoku(sudokuBoard2);
        for (char[] ch : sudokuBoard2){
            System.out.println(Arrays.toString(ch));
        }
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][] board) {
        for (int r = 0; r < board.length; r++) { //every row
            for (int c = 0; c < board.length; c++) {//every column
                if (board[r][c] == '.') {
                    //numbers 1 - 9
                    for (char i = '1'; i <= '9'; i++) {
                        if (isValid(r, c, i, board)) {
                            board[r][c] = i;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[r][c] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    //check for validation
    private boolean isValid(int r, int c, char ch, char[][] board) {
        //check each row and column
//        for(int i = 0; i < board.length; i++){
//            //for row
//            if(board[r][i] == ch) return false;
//            //for column
//            if(board[i][c] == ch) return false;
//        }
//
//        //check each subgrid
//        int rowStart = r - (r % 3); //this will give starting point of row of subgrid
//        int colStart = c - (c % 3); //this will give starting point of col of subgrid
//        for (int rSt = rowStart; rSt <= rowStart + 2; rSt++) {
//            for (int cSt = colStart; cSt < colStart + 2; cSt++) {
//                if(board[rSt][cSt] == ch) return false;
//            }
//        }

        //check each row and column
        for(int i = 0; i < board.length; i++){
            //for row
            if(board[r][i] == ch) return false;
            //for column
            if(board[i][c] == ch) return false;
            //each subgrid
            int row = 3 * (r / 3) + i / 3;//it will increment every 3 numbers by 1
            int col = 3 * (c / 3) + i % 3;//it will increment by 1 for each time until it reaches end and again it will start from beginning
            if(board[row][col] == ch) return false;
        }
        return true;
    }
}