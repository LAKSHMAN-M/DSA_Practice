package com.soting;

import java.util.ArrayList;
import java.util.List;

public class FindDissapperNums {
	public static void main(String[] args) {
		int[] array = {1, 1};
		findDisappearedNumbers(array);
	}
    public static  List<Integer> findDisappearedNumbers(int[] arr) {
//    	int i = 0;
////		we use while loop because when the element is at correct position then only we increment to next element
//		while (i < arr.length) {
//			int correctIndex = arr[i] - 1;
//			if (arr[correctIndex] != arr[i] && i != correctIndex) {
//				swap(arr, i, correctIndex);
//			} else {
//				i++;
//			}
//		}
//		List<Integer> res = new ArrayList<>();
//		for (int j = 0; j < arr.length; j++) {
//			if(arr[j] - 1 != j) {
//				res.add(j+1);
//			}
//		}
//		System.out.println(res);
//		return res;
        int i = 0;
        while(i < arr.length){
            int ci = arr[i] - 1;
            if(ci != i && arr[ci] != arr[i]){
                int temp = arr[ci];
                arr[ci] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int j = 0; j < arr.length; j++){
            if(arr[j] - 1 != j){
                res.add(j+ 1);
            }
        }
        System.out.println(res);
        return res;
    }
    static void swap(int arr[], int i, int correctIndex) {
		int temp = arr[correctIndex];
		arr[correctIndex] = arr[i];
		arr[i] = temp;
	}
}