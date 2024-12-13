package com.Strings;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {
        String duplic="srtteet ff";
        char result=printFirstDuplicatechar(duplic);
        System.out.println(result);
        String duplicword="sonu sonu monu so monu so";
        //String wor=printFirstDuplicateWord(duplicword);
        //System.out.println(wor);
        System.out.println(printFirstDuplicateWord2(duplicword));
    }

    private static char printFirstDuplicatechar(String duplic) {

        Set<Character> set=new HashSet<>();
        for(char c:duplic.toCharArray()){
           if(set.contains(c)){
               return c;
           }
           set.add(c);
        }
        return '\0';
    }

    private static String printFirstDuplicateWord(String duplic) {

        Set<String> set=new HashSet<>();
        for(String c:duplic.toLowerCase().split(" "))
        {
            if(set.contains(c)){
                return c;
            }
            set.add(c);
        }
        return null;
    }
    private static String printFirstDuplicateWord2(String duplic) {

        Set<String> set=new HashSet<>();
        for(String c:duplic.toLowerCase().split(" "))
        {
           if(!set.add(c))
           {
               return c;
           }
           set.add(c);
        }
        return null;
    }



}
