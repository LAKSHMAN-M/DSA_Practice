package com.arrays.problems;

//	https://leetcode.com/problems/maximum-population-year/description/
 class  Solution {
    public int earliestMaxPopulation(int[][] logs) {
        int[] years = new int[102];  // 102 because the range is [1950, 2051]

        for (int[] log : logs) {
            years[log[0] - 1950]++;   // Increment birth year
            years[log[1] - 1950]--;   // Decrement death year
        }

        int maxPopulation = 0;
        int maxPopulationYear = 0;
        int currentPopulation = 0;

        for (int i = 0; i < years.length; i++) {
            currentPopulation += years[i];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxPopulationYear = i + 1950;  // Adjust to actual year
            }
        }

        return maxPopulationYear;
    }
}

public class MaxPopulationYear {
    public static void main(String[] args) {
////        Solution10 solution = new Solution10();
//
//        int[][] logs1 = {{1993, 1999}, {2000, 2010}};
//        System.out.println("Example 1: " + solution.earliestMaxPopulation(logs1));  // Output: 1993
//
//        int[][] logs2 = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
//        System.out.println("Example 2: " + solution.earliestMaxPopulation(logs2));  // Output: 1960
    }
}
