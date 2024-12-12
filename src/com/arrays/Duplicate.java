package com.arrays;

import javax.xml.transform.stream.StreamSource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {


    // way1
    private static void duplicateUsingLoops(int[] arr) {

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    //way 2 using set
    private static void duplicateUsingSet(int[] arr)
    {
      HashSet<Integer> unique = new HashSet<Integer>();
      HashSet<Integer> duplicate = new HashSet<Integer>();
      for(int ele:arr)
      {
          if(!unique.add(ele))
          {
              duplicate.add(ele);
          }
      }
      System.out.println(duplicate);
    }

    // way 3 using stream

    private static void duplicateUsingStreams(int[] arr)
    {
        Set<Integer> unique = new HashSet<Integer>();
        Set<Integer> duplicate = Arrays.stream(arr).filter(n->!unique.add(n)).boxed().collect(Collectors.toSet());
    }

    public static void main(String[] args) {

        int[] arr=new int[]{2,4,2,3,5,6,7,8,3};
       // duplicateUsingLoops(arr);
      //  duplicateUsingSet(arr);
        duplicateUsingStreams(arr);
    }
}
