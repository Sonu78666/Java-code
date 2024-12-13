package com.Strings;

public class ExpandString {

    public static void main(String[] args) {
        String input = "a5b3c1d2f2";
        String result=doExpandString(input);
        System.out.println(result);
    }

    private static String doExpandString(String input) {

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();i++) {
            char ch=input.charAt(i);
            if(Character.isLetter(ch))
            {
                int count=Character.getNumericValue(input.charAt(i+1));
                for(int j=0;j<count;j++)
                {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();

    }


}
