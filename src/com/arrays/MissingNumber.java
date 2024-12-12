package com.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr=new int[]{5,7,8,9};
        int result=missingAnyNumber(arr);
        System.out.println(result);

    }

    // this will work if array start from 1
    private static int missingNumber(int[] array) {

        int n=array.length+1;
        int expected_sum=n*(n+1)/2;
        int actual_sum=0;
        for(int ele:array)
        {
            actual_sum+=ele;
        }
        return expected_sum-actual_sum;
    }
    // this will work for any value
    private static int missingAnyNumber(int[] array)
    {
      int end=array[array.length-1];
      int start=array[0];
      int expected_sum=(end*(end+1))/2-((start-1)*start)/2;
      int actual_sum=0;
      for(int ele:array)
      {
          actual_sum+=ele;
      }

      return expected_sum-actual_sum;
    }
}
