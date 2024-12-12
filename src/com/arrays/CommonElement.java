package com.arrays;

import java.util.*;

public class CommonElement {


    private static void findCommon(Integer[] arr1, Integer[] arr2, Integer[] arr3) {

        Set<Integer> set1=new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2=new HashSet<>(Arrays.asList(arr2));
        Set<Integer> set3=new HashSet<>(Arrays.asList(arr3));

        set1.retainAll(set2);
        //System.out.println(set1);

        set1.retainAll(set3);
        System.out.println(set1);



    }
    private static<T> void findCommonGeneric(T[] arr1,T[] arr2,T[] arr3) {
        Set<T> set1=new HashSet<>(Arrays.asList(arr1));
        Set<T> set2=new HashSet<>(Arrays.asList(arr2));
        Set<T> set3=new HashSet<>(Arrays.asList(arr3));
        set1.retainAll(set2);
        //System.out.println(set1);

        set1.retainAll(set3);
        System.out.println(set1);

    }
    private static void commonEasy(Integer[] arr1,Integer[] arr2,Integer[] arr3) {

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();

        Collections.addAll(set1, arr1);
        for(Integer s:arr2)
        {
            if(set1.contains(s))
            {
                set2.add(s);
            }
        }
        for(Integer s:arr3)
        {
            if(set2.contains(s))
            {
                set3.add(s);
            }
        }
        System.out.println(set3);


    }

    private static void unionOfAll(String[] s1,String[] s2,String[] s3)
    {
        HashSet<String> set = new HashSet<>();
        for(String s:s1)
        {
            set.add(s);
        }
        for(String s:s2)
        {
            set.add(s);
        }


        for(String s:s3)
        {
            set.add(s);
        }
        System.out.println(set);

        String[] newarr=new String[set.size()];
        int i=0;
        for(String temp:set)
        {
            newarr[i++]=temp;
        }
        System.out.println(Arrays.toString(newarr));



    }


    public static void main(String[] args) {
        Integer[] arr1=new Integer[]{5,6,7,8,1,2,3};
        Integer[] arr2=new Integer[]{1,2,3};
        Integer[] arr3=new Integer[]{1,2};
        String[] st1=new String[]{"Sonu","Monu","ronu","ponu"};
        String[] st2=new String[]{"Sonu","Monu","gonu"};
        String[] st3=new String[]{"Sonu","lonu"};

       /* findCommon(arr1,arr2,arr3);
        findCommonGeneric(arr1,arr2,arr3);
        findCommonGeneric(st1,st2,st3);
        commonEasy(arr1,arr2,arr3);

        */
        unionOfAll(st1,st2,st3);
    }


}
