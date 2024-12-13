package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortZeroOneTwo {

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0};
        printSortZeroOneTwo(arr);
        List<Integer> number=new ArrayList<>(Arrays.asList(2, 0, 1, 2, 1, 0));

    }

    private static void printSortZeroOneTwo(int[] arr) {

        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high) {
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else
            {
                swap(arr,mid,high);
                high--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
