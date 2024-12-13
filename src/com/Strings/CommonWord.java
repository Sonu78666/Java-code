package com.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonWord {

    public static void main(String[] args) {
        String s1="Apple orange peach";
        String s2="Apple orange manago";
        String s3="Apple orange manago";

        printCommon(s1,s2,s3);
    }

    private static void printCommon(String s1, String s2, String s3) {

        Set<String> set1=new HashSet<>(Arrays.asList(s1.split(" ")));
        Set<String> set2=new HashSet<>(Arrays.asList(s2.split(" ")));
        Set<String> set3=new HashSet<>(Arrays.asList(s3.split(" ")));
        set1.retainAll(set2);
        set1.retainAll(set3);
        System.out.println(set1);

        //convert set to string

        String result=String.join(",",set1);
        System.out.println(result);


    }

}
