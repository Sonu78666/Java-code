package com.arrays;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void zeroToEnd(int[] arr) {

        int nonzeroindex=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                arr[nonzeroindex++]=arr[i];
            }
        }
        while(nonzeroindex<arr.length) {
            arr[nonzeroindex++]=0;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void moveZeroToStart(int[] arr) {
        int zeroindex=arr.length-1;
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]!=0) {
                arr[zeroindex--]=arr[i];
            }
        }
        while(zeroindex>=0) {
            arr[zeroindex--]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,0,0,2,0,1};
        zeroToEnd(arr);
        moveZeroToStart(arr);
    }
}
