package com.arrays.problems;
//	https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
//Input: n = 5 5/2 == 2
//Output: [-7,-1,1,3,4]
class Solution_1304 {
    public static int[] sumZero(int n) {
        if(n+"".length() == 1){
        	return new int[] {0};
        }else {
        	int mid = n/2;
        	int index = 0;
        	int[] res = new int[n];
        	for(int i = 1 ; i <= mid; i++) {
        		res[index++] = i;
        		res[index++] = -i;
        	}
//        	res[index++] = 0;
        	return res;
        }
    }
}
public class FindNUniqueIntegersSumUpto0{
	public static void main(String[] args) {
		Solution_1304.sumZero(5);
		
	}
}