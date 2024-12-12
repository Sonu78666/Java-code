package com.arrays;

import java.util.*;

public class MergeSortedArrays {

    //WAY1 using hashset
    public static void mergeArraysusingSet(int[] arr1, int[] arr2) {

        Set<Integer> set=new TreeSet<Integer>();
        for(int elem:arr1)
        {
            set.add(elem);
        }
        for(int elem:arr2)
        {
            set.add(elem);
        }
       System.out.println(set);
        //convert set to arr
        int []new_arr=new int[set.size()];
        int i=0;
        for(int ele:set)
        {
            new_arr[i++]=ele;
        }
        System.out.println(Arrays.toString(new_arr));
    }
    //Way 2 using Map
    public static void mergeArraysusingMap(int[] arr1, int[] arr2)
    {
        Map<Integer,Boolean > map=new TreeMap<Integer, Boolean>();
        for(int elem:arr1)
        {
            map.put(elem,true);
        }
        for(int elem:arr2)
        {
            map.put(elem,true);
        }
       map.keySet().stream().forEach(System.out::println);
      //convert key to array
       Integer [] newarr=map.keySet().toArray(new Integer[0]);
       System.out.println(Arrays.toString(newarr));

    }

    public static void main(String[] args) {
        int[] arr1=new int[]{12,15,16,12,12};
        int[] arr2=new int[]{5,6,7,8};
        mergeArraysusingSet(arr1,arr2);
        mergeArraysusingMap(arr1,arr2);


    }
}
