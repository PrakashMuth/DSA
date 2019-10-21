package com.company.strings;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void removeDuplicates(char[] str1){
        int n=str1.length;
        Arrays.sort(str1);
        for(int i=0;i<n;i++){
            if (str1[i] == str1[i+1]){

            }
        }
    }
    public static void main(String args[]){
        char[] str1={'g','e','e','k','s'};
        removeDuplicates(str1);
    }
}
