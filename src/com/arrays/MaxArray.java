package com.arrays;

import java.util.Arrays;

public class MaxArray {

    public static void findMax(int[] array)
    {

        int max=Integer.MIN_VALUE;
        for(int i:array)
        {
            if(i>max)
            {
                max=i;
            }
        }
        System.out.println(max);
    }

    public static int findNmax(int[] array, int n)
    {
        Arrays.sort(array);
        return array[n-1];
    }
    public static void main(String[] args) {
        int []arr=new int[]{15,20,17,19,90};
        findMax(arr);
        int result=findNmax(arr,2);
        System.out.println(result);
    }
}
