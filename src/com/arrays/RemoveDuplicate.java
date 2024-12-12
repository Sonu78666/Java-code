package com.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,2,2,3,5,5,4};
        withoutDuplicate(arr);
    }

    private static void withoutDuplicate(int[] arr) {

        HashSet<Integer> set=new HashSet<>();
       for(int ele:arr)
       {
           set.add(ele);
       }
       System.out.println(set);
    }
    private static void withoutDuplicateList(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for(int ele:arr)
        {
            if(!list.contains(ele))
            {
                list.add(ele);
            }

        }

    }

}
