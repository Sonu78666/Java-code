package com.Strings;

public class CountVoewl {

    public static void main(String[] args) {
        String str="IDFC-my name is sonu";
        countVowel(str);
        
    }

    private static void countVowel(String str) {

        int vcount=0;
        int ccount=0;
        String mod=str.toLowerCase().replaceAll("[A-Za-z0-9]","");
        for(int i=0;i<mod.length();i++)
        {
            if(mod.charAt(i)=='a'||mod.charAt(i)=='e'||mod.charAt(i)=='i'||mod.charAt(i)=='o'||mod.charAt(i)=='u')
            {
                vcount++;
            }
            else {
                ccount++;
            }
        }

        System.out.println(vcount);
        System.out.println(ccount);
    }
}
