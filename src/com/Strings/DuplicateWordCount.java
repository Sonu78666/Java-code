package com.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateWordCount {

    public static void main(String[] args) {
        String s="Java,-Program-Java.Program,.Selenium-Java hava hava sava";
        printDuplicateWord(s);
        printDuplicateWordUsingSet(s);
    }

    private static void printDuplicateWord(String s) {

        Map<String,Integer> map=new HashMap<>();
        String []arr=s.split("\\W+");
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);

        for(Map.Entry<String,Integer> entry:map.entrySet()){
         if(entry.getValue()>1)
         {
             System.out.println(entry.getKey()+" "+entry.getValue());
         }
        }
    }
    private static void printDuplicateWordUsingSet(String s)
    {
        Set<String> set=new HashSet<>();
        Set<String> duplicate=new HashSet<>();
        String []arr=s.split("\\W+");
        for(String ele: arr)
        {
            if(!set.add(ele))
            {
                duplicate.add(ele);
            }
        }
        System.out.println(duplicate);
    }
}
