package com.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[]arr=new int[]{12,27,13,1,3,5,12,34,56,23};
        int k=5;
        rotate(arr,0,arr.length-1);
        rotate(arr,0,k-1);
        int[] result=rotate(arr,k,arr.length-1);
        System.out.println(Arrays.toString(result));
    }

    private static int[] rotate(int[] arr, int sp, int ep) {

        while (sp < ep) {
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }

        return arr;
    }


}
