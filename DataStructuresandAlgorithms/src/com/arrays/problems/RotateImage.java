package com.arrays.problems;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        int[][] matrix2 = {{1,2 ,3 }, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        for(int[] i : matrix){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void rotate(int[][] matrix) {
        //matrix[i][..] -- row
        //matrix[..][j] -- col
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0 ; i < n; i++){
            for(int j = i ; j < m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = m - 1;
            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
