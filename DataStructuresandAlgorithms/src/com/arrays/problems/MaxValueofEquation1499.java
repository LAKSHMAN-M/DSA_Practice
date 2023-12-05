package com.arrays.problems;

public class MaxValueofEquation1499 {
	public static void main(String[] args) {
		MaxValueofEquation1499 obj = new MaxValueofEquation1499();
		int points[][] = { { 1, 3 }, { 2, 0 }, { 5, 10 }, { 6, -10 } };
		int points2[][] = { { 0, 0 }, { 3, 0 }, { 9, 2 } };
		int points3[][] = { { -19, -12 }, { -13, -18 }, 
							{ -12, 18 }, { -11, -8 }, 
							{ -8, 2 }, { -7, 12 }, 
							{ -5, 16 },{ -3, 9 }, 
							{ 1, -7 }, { 5, -4 }, 
							{ 6, -20 }, { 10, 4 }, 
							{ 16, 4 }, { 19, -9 }, { 20, 19 } };
		int k = 1;

		System.out.println(obj.findMaxValueOfEquation(points, k));
	}

	public int findMaxValueOfEquation(int[][] points, int k) {
		int len = points.length;
		int min = Integer.MIN_VALUE;
		int start = 0, end = 1, ans = Integer.MIN_VALUE, i = 0;
		while (i < len / 2) {
			if (end < len && start < len) {
				ans = Math.max(calculateEquation(points, start, end, k), ans);
				start = end + 1;
				end = end + 2;
			} else {
				break;
			}
			i++;
		}
		return ans;
	}

	static int calculateEquation(int[][] points, int start, int end, int k) {
		int x1 = points[start][0], x2 = points[end][0], y1 = points[start][1], y2 = points[end][1];
		if ((x2 - x1) <= k) {
			int sol =y1 - x1;
			return sol;
		}
		return Integer.MIN_VALUE;
	}
}