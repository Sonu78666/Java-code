package com.Strings;

public class RemoveDigitAndSpecialChar {

   public static void main(String[] args) {
       String input="son123@u@&";
       printString(input);
   }

    private static void printString(String input) {

       StringBuilder sb=new StringBuilder();
       for(int i=0;i<input.length();i++){
           char ch=input.charAt(i);
           if(!(Character.isDigit(ch) ||isSpecialCharacter(ch))){
                sb.append(ch);
           }
       }
       System.out.println(sb.toString());
    }

    private static boolean isSpecialCharacter(char ch) {
       String special="!@#$%^&*()";
       return special.indexOf(ch)!=-1;
    }
}
