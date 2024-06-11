package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3 };
        int[] nums2 = {2, 2, 4};
        System.out.println(sortedArray(nums, nums2));
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        int l = 0, sl = 0;
        int lLen = a.length, sllen = b.length;
        while(l < lLen && sl < sllen){
            if(a[l] == b[sl]){
                l++;
            }else if(a[l] < b[sl]){
                res.add(a[l]);
                l++;
                while(l != 0 && l < lLen && a[l] == a[l - 1]){
                    l++;
                }
            }else{
                res.add(b[sl]);
                sl++;
                while (sl != 0 && sl < sllen && b[sl] == b[sl - 1]){
                    sl++;
                }
            }
        }

        while(l < lLen){
            res.add(a[l]);
            l++;
            while(l < lLen && a[l] == a[l - 1]){
                l++;
            }
        }
        while(sl < sllen){
            res.add(b[sl]);
            sl++;
            while(sl < sllen && sl != 0 && b[sl] == b[sl- 1]){
                sl++;
            }
        }
        return res;
    }
}
