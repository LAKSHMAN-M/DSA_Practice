package com.arrays.problems;

public class FindHighestAltitude {

	public static void main(String[] args) {
		int[] gain = {-4,-3,-2,-1,4,3,2};
		System.out.println(largestAltitude(gain));
	}
	static int largestAltitude(int[] gain) {
		int max = 0;
        int current = 0;
        for (int i : gain) {
            current += i;
            max = Math.max(max, current);
        }
        return max;
    }
}
