package com.Strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceWithCount {

    public static void main(String[] args) {
        String str="aaaabbbccdddde";
        printOccurenceWithCount(str);
    }

    private static void printOccurenceWithCount(String str) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(char c:str.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char key:map.keySet())
        {
            System.out.print(key+""+map.get(key));
        }
    }
}
