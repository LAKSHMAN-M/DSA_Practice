package com.recursion.subsets_subsequences;

import java.util.*;

public class PrintSubSeqWithSum {
    public void subSeqSum(int index, int cSum, int sum, int[] arr, Stack<Integer> stack, int n) {
        if (index == n) {
            if (cSum == sum) System.out.print(stack + ", ");
//            else System.out.print("{}, ");
            return;
        }
        //take
        cSum += arr[index];
        stack.push(arr[index]);
        subSeqSum(index + 1, cSum, sum, arr, stack, n);
        //not take
        cSum -= arr[index];
        stack.pop();
        subSeqSum(index + 1, cSum, sum, arr, stack, n);
    }

    public boolean subSeqSumPrintOneElement(int index, int cSum, int sum, int[] arr, Stack<Integer> stack, int n) {
        if(cSum > sum) return false;
        if (index == n) {
            if (cSum == sum) {
                System.out.print(stack + ", ");
                return true;
            }
            return false;
        }
        //take
        cSum += arr[index];
        stack.push(arr[index]);
        if(subSeqSumPrintOneElement(index + 1, cSum, sum, arr, stack, n))return true;
        //not take
        cSum -= arr[index];
        stack.pop();
        if(subSeqSumPrintOneElement(index + 1, cSum, sum, arr, stack, n)) return true;
        return false;
    }
    public int countSubSequencesWithSum(int[] arr, int index, int cSum, int k){
        if(index >= arr.length){
            return cSum == k ? 1 : 0;
        }
        //check that if current is exceeds the given number
        if(cSum > k) return 0;
        //accept
        cSum += arr[index];
        int leftCalls = countSubSequencesWithSum(arr, index+1, cSum, k);
        //reject
        cSum -= arr[index];
        int rightCalls = countSubSequencesWithSum(arr, index+1, cSum, k);
        return leftCalls + rightCalls;
    }
    public int countSubSequencesWithSum2(int[] arr, int index, int cSum, int k){
        if(index >= arr.length){
            return cSum == k ? 1 : 0;
        }
        //check that if current is exceeds the given number
        if(cSum > k) return 0;
        //reject
        int rightCalls = countSubSequencesWithSum2(arr, index+1, cSum, k);
        //accept
        cSum += arr[index];
        int leftCalls = countSubSequencesWithSum2(arr, index+1, cSum, k);
        return leftCalls + rightCalls;
    }
}
