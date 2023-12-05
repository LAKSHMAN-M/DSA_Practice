package com.arrays.problems;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		int[][]	accounts = {{7, 3}, {3, 5},{1,5}};
		System.out.println(maximumWealth(accounts));
	}

	// will return the highest sum of an array for a specified row
	public static int maximumWealth(int[][] accounts) {
		if(accounts.length == 0) {
			return -1;
		}
		int wealth = 0;
		for (int[] customer : accounts) {
			int bankSum = 0;// each bank sum of a customer
			for (int temp : customer) {
				bankSum += temp;
			}
			wealth = Math.max(wealth, bankSum);
		}
		return wealth;
	}
}
