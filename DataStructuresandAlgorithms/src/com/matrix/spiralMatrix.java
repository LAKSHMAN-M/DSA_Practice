package com.matrix;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(spiralOrder(matrix2));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;
        List<Integer> ls = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = top; i <= right; i++) {
                ls.add(matrix[top][i]);
            }
            //right - bottom
            top++;
            for (int j = top; j <= bottom; j++) {
                ls.add(matrix[j][right]);
            }
            //bottom - left
            right--;
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    ls.add(matrix[bottom][k]);
                }
                bottom--;
            }
            //left - top
            for (int l = bottom; l >= top; l--) {
                ls.add(matrix[l][left]);
            }
            left++;
        }
        return ls;
    }
}
