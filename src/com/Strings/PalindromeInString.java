package com.Strings;

public class PalindromeInString {

    public static void main(String[] args) {
        String s ="Sonu gfg is my dad rare some san share";
        printPalindromeInString(s);
    }

    private static void printPalindromeInString(String s) {
        for(String word:s.split(" ")) {
            if(isPalindrome(word)) {
                System.out.println(word);
            }
        }
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
