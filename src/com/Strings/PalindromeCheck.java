package com.Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama!"));
        System.out.println(isPalindrome("public"));
        System.out.println(isPalindrome("dad"));
    }

    private static boolean isPalindrome(String s) {
       String input= s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
       int left=0;
       int right=input.length()-1;
       while(left<right){
           if(input.charAt(left)!=input.charAt(right)){
               return false;
           }
           left++;
           right--;
       }
       return true;
    }
}
