package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BubbleSort {

    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
   public static void sortSet(int[] arr)
   {
       Set<Integer> set=new TreeSet<>();
       for(int ele:arr)
       {
           set.add(ele);
       }
       System.out.println(set);

   }
    public static void main(String[] args) {

        int[] arr=new int[]{5,2,6,7,4,1,3};
        sort(arr);
        sortSet(arr);

    }
}
