package com.binarySearch.problems;
//https://leetcode.com/problems/search-a-2d-matrix/
public class Solution {
    public static void main(String[] args) {
        for(int i = 0 ; i < 62; i++){
            if(i < 10){
                System.out.println((char)(i + 48) +" : "+(i + 48)+" i : "+ i );
            }else if( i >= 10 && i <= 35){
                System.out.println((char)(i + 65 - 10) +" : "+(i + 65 - 10)+" i : "+ i );
            }else{
                System.out.println((char)(i + 97 - 36) +" : "+(i + 97 - 36)+" i : "+ i );
            }
        }
    }


}

