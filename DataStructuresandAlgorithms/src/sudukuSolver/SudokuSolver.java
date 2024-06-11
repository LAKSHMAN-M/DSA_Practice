package sudukuSolver;

import java.util.Scanner;

public class SudokuSolver {
    final int SIZE = 9;
    public void solveSuduku(char chessBoard[][]) {
        dfs(chessBoard);
    }

    //board logic
    private boolean dfs(char[][] chessBoard) {
        for (int r = 0; r < SIZE; r++) { //each and evey row
            for (int c = 0; c < SIZE; c++) { //each and evey column
                if (chessBoard[r][c] == 'X') {
                    for (char ch = '1'; ch <= '9'; ch++) { // try to place numbers from 1-9
                        if (isValid(r, c, ch, chessBoard)) { // if number is valid then place it on chessboard
                            chessBoard[r][c] = ch;
                            if (dfs(chessBoard)) {
                                return true;
                            } else {
                                chessBoard[r][c] = 'X';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    //checking for validation
    private boolean isValid(int r, int c, char ch, char[][] chessBoard) {
        for (int i = 0; i < SIZE; i++) {
            //row
            if (chessBoard[r][i] == ch) return false;
            //column
            if (chessBoard[i][c] == ch) return false;
            //subgrid
            int col = 3 * (c / 3) + i % 3;
            int row = 3 * (r / 3) + i / 3;
            if (chessBoard[row][col] == ch) return false;
        }
        return true;
    }

    //board printing
    public void printBoard(char chessBoard[][]) {
        System.out.println(" +-------+-------+-------+");
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (c % 3 == 0) {
                    System.out.print(" | ");
                }
                if ((c + 1) % 3 == 0) {
                    System.out.print(chessBoard[r][c]);
                } else {
                    System.out.print(chessBoard[r][c] + " ");
                }
                if (c == 8) System.out.print(" |");
            }
            System.out.println();
            if ((r + 1) % 3 == 0) {
                System.out.print(" +-------+-------+-------+ ");
                System.out.println();
            }
        }
    }

    //user input
    public void userInput() {
        Scanner scan = new Scanner(System.in);
        char chessBoard[][] = new char[SIZE][SIZE];
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                chessBoard[r][c] = scan.next().charAt(0);
            }
        }
        solveSuduku(chessBoard);
        printBoard(chessBoard);
    }

    public void sudokuGame() {
        System.out.println("Welcome to Suduku Solve Game...");
        Scanner scan = new Scanner(System.in);
        System.out.println("Select 1 or 2");
        System.out.println("1.Demo");
        System.out.println("2.Input");
        char choice = scan.next().charAt(0);
        switch (choice) {
            case '1': {
                char chessBoard[][] = {{'5', '3', 'X', 'X', '7', 'X', 'X', 'X', 'X'}, {'6', 'X', 'X', '1', '9', '5', 'X', 'X', 'X'}, {'X', '9', '8', 'X', 'X', 'X', 'X', '6', 'X'}, {'8', 'X', 'X', 'X', '6', 'X', 'X', 'X', '3'}, {'4', 'X', 'X', '8', 'X', '3', 'X', 'X', '1'}, {'7', 'X', 'X', 'X', '2', 'X', 'X', 'X', '6'}, {'X', '6', 'X', 'X', 'X', 'X', '2', '8', 'X'}, {'X', 'X', 'X', '4', '1', '9', 'X', 'X', '5'}, {'X', 'X', 'X', 'X', '8', 'X', 'X', '7', '9'}};
                System.out.println("Before : ");
                printBoard(chessBoard);
                solveSuduku(chessBoard);
                System.out.println("After :");
                printBoard(chessBoard);
                break;
            }
            case '2': {
                System.out.println("Enter the Sudoku puzzle (use 'X' for empty cells):");
                userInput();
                break;
            }
            default: {
                System.out.println("Enter a valid number");
            }
        }

    }
}
