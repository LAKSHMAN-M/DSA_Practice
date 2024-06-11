package com.recursion.subsets_subsequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequence {
    //getting all the subsequences of given String
    public String[] powerSet(String str) {
        char[] ch = str.toCharArray();
        String[] res = new String[1 << str.length()];
        for (int i = 0; i < (1 << str.length()); i++) {
            String s = "";
            for (int j = 0; j < str.length(); j++) {
                if ((i & (1 << j)) != 0) s = s + ch[j];
            }
            res[i] = s;
        }
        return res;
    }

    public void powerSetOneElement(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j]+" =>"+sum);
                }
            }
        }
    }

    public void printSubSequences(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + ", ");
            return;
        }
        //reject
        printSubSequences(p, up.substring(1));
        //accept
        printSubSequences(p + up.charAt(0), up.substring(1));
    }

    public void printSubSequences2(int[] arr, int index, int size, ArrayList<Integer> list) {
        if (index >= size) {
            System.out.print(list);
            return;
        }
        //accept
        list.add(arr[index]);
        printSubSequences2(arr, index + 1, size, list);
        list.remove(list.size() - 1);
        //reject
        printSubSequences2(arr, index + 1, size, list);
    }

    public List<ArrayList<String>> listSubSequences(String p, String up) {
        List<ArrayList<String>> res = new ArrayList<>();
        ArrayList<String> al = new ArrayList<>();
        if (up.isEmpty()) {
            al.add(p);
            res.add(al);
            return res;
        }
        //reject
        res.addAll(listSubSequences(p, up.substring(1)));
        //accept
        res.addAll(listSubSequences(p + up.charAt(0), up.substring(1)));
        return res;
    }
}
