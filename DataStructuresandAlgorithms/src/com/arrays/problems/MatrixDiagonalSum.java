package com.arrays.problems;

public class MatrixDiagonalSum {
	public static void main(String[] args) {
		int[][] mat1 = {{ 1, 1, 1, 1}, 
					   { 1, 1, 1, 1}, 
					   { 1, 1, 1, 1},
					   { 1, 1, 1, 1}};
		int [][] mat2 = {{5}};
		int[][] mat = {{1,2,3},
		               {4,5,6},
		               {7,8,9}};
		int [][]mat3 = {{7,9,8,6,3},
						{3,9,4,5,2},
						{8,1,10,4,10},
						{9,5,10,9,6},
						{7,2,4,10,8}};
		System.out.println(diagonalSum(mat3));
	}
    public static int diagonalSum(int[][] mat) {
    	int len = mat.length;
    	if(len == 1) {
    		return mat[0][0];
    	}
        int sumOfPnSDiagonals = 0;
        int row = 0;
        int col = 0;
        //primary diagonal sum
        while(row < len){
            sumOfPnSDiagonals += mat[row][col];
            row++;
            col++;
        }
        //secondary diagonal sum
        row = 0;
        col = len - 1;
        while(col >= 0){
            sumOfPnSDiagonals += mat[row][col];
            row++;
            col--;
        }
        System.out.println(sumOfPnSDiagonals);
        //removing middle element for both P.D and S.D
        if(len / 2 == 1){
            sumOfPnSDiagonals -= mat[len / 2][ len / 2];
        }
        return sumOfPnSDiagonals;
    }
}
