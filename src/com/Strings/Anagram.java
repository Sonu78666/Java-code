package com.Strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String s1="dd";
        String s2="Silent";
        checkAnagram(s1,s2);

    }

    private static void checkAnagram(String s1, String s2) {

        if(s1.length()!=s2.length())
        {
            System.out.println("not an anagram");
        }
        else
        {
           char ch1[]= s1.toLowerCase().toCharArray();
           char ch2[]= s2.toLowerCase().toCharArray();
           Arrays.sort(ch1);
           Arrays.sort(ch2);
           if(Arrays.equals(ch1, ch2))
           {
               System.out.println("Anagram");
           }
           else
           {
               System.out.println("not an anagram");
           }


        }
    }
}
