package com.company.arrays;

public class SearchElement {
    public  static int searchArray(int[] arr, int n, int s){
        int i;
        for (i=0;i<n;i++) {
            if (arr[i] == s) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,7,8};
        int n=arr.length;
        int s=3;
        int out=searchArray(arr,n,s);
        System.out.println(out);
    }
}
