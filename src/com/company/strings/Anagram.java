package com.company.strings;

import java.util.Arrays;

public class Anagram {
    public static boolean anagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2) {
            System.out.println("hi");
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i=0;i<n1;i++){
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        char[] str1={'g','e','e','k','s'};
        char[] str2={'s','g','e','k','e'};
        boolean out=anagram(str1,str2);
        if(out == false){
            System.out.println("This is not anagram");
        }
        else {
            System.out.println("THis is anagram");
        }
    }
}
