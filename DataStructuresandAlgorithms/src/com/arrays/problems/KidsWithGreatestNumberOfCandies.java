package com.arrays.problems;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class KidsWithGreatestNumberOfCandies {

	public static void main(String[] args) {
		int[] candies = {4,2,1,1,2};
		System.out.println(kidsWithCandies(candies, 1));
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> res = new ArrayList<>();
		int highestCandies = 0;
		for (int maxe : candies) {
			highestCandies = Math.max(highestCandies, maxe);
		}
		for (int maxCandie : candies) {
			if (maxCandie + extraCandies >= highestCandies)
				res.add(true);
			else
				res.add(false);
		}
		return res;
	}

}
