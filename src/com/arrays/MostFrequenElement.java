package com.arrays;

import java.util.HashMap;
import java.util.Map;
public class MostFrequenElement {

    private static void printMostFrequenElement(int[] array)
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:array)
        {
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int maxcount=0;
        int mostFrequentElement=array[0];
        int mostFrequentElementCount=0;
        for(Map.Entry<Integer,Integer> entrymap:map.entrySet())
        {
            int count=entrymap.getValue();
            if(count>maxcount)
            {
                maxcount=count;
                mostFrequentElement=entrymap.getKey();
                mostFrequentElementCount=entrymap.getValue();
            }

        }
        System.out.println(mostFrequentElement+":"+mostFrequentElementCount);
    }
    public static void main(String[] args) {
        int[] arr=new int[]{12,15,16,12,12,1,21,2,22,2};
        printMostFrequenElement(arr);
    }
}
