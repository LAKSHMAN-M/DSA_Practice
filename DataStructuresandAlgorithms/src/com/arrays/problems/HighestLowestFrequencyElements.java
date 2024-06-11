package com.arrays.problems;

import com.hashing.HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HighestLowestFrequencyElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 4};
        solution(nums);
    }

    static void solution(int[] nums) {
        if (nums.length == 0) {
            return;
        }

        TreeMap<Integer, Integer> hm = new TreeMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        int hFreq = 1, hFreqElem = 0;
        int lFreq = nums.length, lFreqElem = 0;
        int firstElements = 1;

        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            if(firstElements == 1){
                hFreqElem = map.getKey();
                lFreqElem = map.getKey();
                firstElements++;
            }
            if (map.getValue() > hFreq) {
                hFreq = map.getValue();
                hFreqElem = map.getKey();
            }
            if (map.getValue() < lFreq) {
                lFreq = map.getValue();
                lFreqElem = map.getKey();
            }
        }
        System.out.println("Highest Frequency Element " + hFreqElem);
        System.out.println("Lowest Frequency Element " + lFreqElem);
    }
}
