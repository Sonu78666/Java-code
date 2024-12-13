package com.Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeated {

    public static void main(String[] args) {
        String actualWord = "aakklmrraddvveennff st";
        char result=printFirstNonRepeatedChar(actualWord);
        System.out.println(result);
        String word="Sonu SE Yadav Sonu Yadav ME";
        String r=printFirstNonRepeatedWord(word);
        System.out.println(r);

    }

    private static char printFirstNonRepeatedChar(String actualWord) {
        Map<Character,Integer> map=new HashMap<>();
        char [] ch=actualWord.toCharArray();
        for(char ele:ch){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(char ele:ch){
            if(map.get(ele)==1){
                return ele;
            }
        }

        return '\0';
    }
    private static String printFirstNonRepeatedWord(String actualWord)
    {
        String[] words=actualWord.toUpperCase().split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String ele:words)
        {
           if(map.get(ele)==1)
           {
               return ele;
           }
        }
        return null;
    }

}
