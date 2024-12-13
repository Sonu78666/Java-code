package com.Strings;

import java.util.ArrayList;
import java.util.List;

public class FirstandLastOccurence {

    public static void main(String[] args) {
        String s="sonuyadav";
        char target='a';
        printFirstandLastOccurence(s,target);
    }

    private static void printFirstandLastOccurence(String s, char target) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==target) {
                list.add(i);
            }
        }
        int first=list.get(0);
        int last=list.get(list.size()-1);
        System.out.println(first+" "+last);
    }
}
