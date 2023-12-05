package com.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFormOfInteger {

	public static void main(String[] args) {
		int[] num = {9,9,9,9,9,9,9,9,9,9};
		System.out.println(addUp(num, 1));
	}

	static List<Integer> addUp(int[] num, int k) {
			String str = "";
			for (int i : num) {
				str += i;
			}
			String[] strArr = (Long.valueOf(str) + k +"").split("");
			List<Integer> result = new ArrayList<>();
			for(String i : strArr) {
				result.add(Integer.valueOf(i));
			}
			return result;
	}

}
