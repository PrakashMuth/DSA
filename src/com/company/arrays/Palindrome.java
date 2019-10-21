package com.company.arrays;

public class Palindrome {
    public static Boolean palindromeNumber(char[] arr){
        int n=arr.length;
        int i;
        int j;
        for(i=0,j=n-1;i<n && j > 1;i++,j--){
            if(arr[i] != arr[j]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        char[] arr={'g','e','e','g','d'};
        Boolean num=palindromeNumber(arr);
        System.out.println(num);
    }
}
