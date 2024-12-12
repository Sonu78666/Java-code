package com.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String [] arr=new String[]{"sonu","monu","turn","aroud"};
        reverse(arr);
    }

    private static void reverse(String[] arr) {
        int sp=0;
        int ep=arr.length-1;
        while(sp<ep)
        {
             String temp=arr[sp];
             arr[sp]=arr[ep];
             arr[ep]=temp;
             sp++;
             ep--;

        }
        System.out.println(Arrays.toString(arr));
    }

}
