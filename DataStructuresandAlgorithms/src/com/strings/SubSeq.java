package com.strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String processed = "";
        String unProcessed = "abc";
//        System.out.println(subSeqUsingList2(processed, unProcessed));

    }
    static void subSeq(String processed, String unProcessed){
        if(unProcessed.isEmpty()) {
            System.out.print(processed+", ");
            return;
        }
        subSeq(processed + unProcessed.charAt(0), unProcessed.substring(1));
        subSeq(processed, unProcessed.substring(1));
    }
    static ArrayList<String> subSeq1(String processed, String unProcessed, ArrayList<String> list){
        if(unProcessed.isEmpty()) {
            list.add(processed);
            return list;
        }
        subSeq1(processed + unProcessed.charAt(0), unProcessed.substring(1), list);
        return subSeq1(processed, unProcessed.substring(1), list);
    }

    static ArrayList<String> subSeqUsingList(String processed, String unProcessed){
        if(unProcessed.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(processed);
            return res;
        }
        ArrayList<String> left = subSeqUsingList(processed + unProcessed.charAt(0), unProcessed.substring(1));
        ArrayList<String> right = subSeqUsingList(processed, unProcessed.substring(1));
        ArrayList<String> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(right);
        return result;
    }
    static ArrayList<String> subSeqUsingList2(String processed, String unProcessed){
        if(unProcessed.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(processed);
            return res;
        }
        ArrayList<String> left = subSeqUsingList2(processed + unProcessed.charAt(0), unProcessed.substring(1));
        ArrayList<String> right = subSeqUsingList2(processed, unProcessed.substring(1));
        left.addAll(right);
        return left;
    }

}
