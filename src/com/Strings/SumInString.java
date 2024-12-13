package com.Strings;

public class SumInString {

    public static void main(String[] args) {
        String s = "iam soso,,,.2@478&89&77";
        printSum(s);
    }

    private static void printSum(String s) {
        int sum=0;
        for(int  i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                sum=sum+Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}
