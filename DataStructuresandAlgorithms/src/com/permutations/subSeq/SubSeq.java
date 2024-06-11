package com.permutations.subSeq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        String p = "";
        String up = "321";
        subSeq("", up);
//        ArrayList<String> res = subSeqList(p, up);
//
//        Collections.sort(res);
//        for(String str : res){
//            System.out.print(str+", ");
//        }
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+", ");
            return;
        }
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            char ch =  up.charAt(0);
            String s = p.substring(i, p.length());
            subSeq(f + ch + s, up.substring(1));
        }
    }
    static ArrayList<String> subSeqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            char ch =  up.charAt(0);
            String s = p.substring(i, p.length());
            result.addAll(subSeqList(f + ch + s, up.substring(1)));
        }
        return result;
    }

}
