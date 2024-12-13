package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UncommonElement {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,5,9,11};
        Integer[] arr2 = {1,2,3,12,13};
        printUncommonElement(arr1,arr2);
    }

    private static void printUncommonElement(Integer[] arr1, Integer[] arr2) {

        Set<Integer> s1=new HashSet<>(Arrays.asList(arr1));
        Set<Integer> s2=new HashSet<>(Arrays.asList(arr2));

        Set<Integer> uncommonset=new HashSet<>(s1);
        uncommonset.addAll(s2);

        Set<Integer> commonset=s1.stream().filter(s2::contains).collect(Collectors.toSet());
        uncommonset.removeAll(commonset);
        System.out.println(uncommonset);




    }
}
