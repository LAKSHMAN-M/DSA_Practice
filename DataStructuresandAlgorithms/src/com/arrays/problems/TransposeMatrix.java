package com.arrays.problems;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3},
				{4, 5, 6}};
		transpose(matrix);
	}
//	transpose mean rows to column wise versa
	static int[][] transpose(int[][] matrix){
		int rowTranspose = matrix[0].length;
		int colTranspose = matrix.length;
		int[][] res = new int[rowTranspose][colTranspose];
		for(int i = 0; i < colTranspose ; i++){
            for(int j = 0; j< rowTranspose ; j++){
                res[j][i] = matrix[i][j];
            }
        }
        return res;
	}	

}
