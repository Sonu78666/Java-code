package com.Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedCharacter {
    public static void main(String[] args) {
        String s="thisss iss sooonu yaadav";
        printRemoveRepeatedCharacter(s);
    }

    private static void printRemoveRepeatedCharacter(String s) {

        Set<Character> set=new LinkedHashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char ele:s.toCharArray())
        {
           if(set.add(ele))
           {
               sb.append(ele);
           }
        }
        System.out.println(sb.toString());

    }
}
