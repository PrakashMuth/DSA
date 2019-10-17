package com.company.arrays;

public class NumberOccurance {
    public static void countOccurance(int arr[],int n,int k){
        int count=0;
        for (int i=0;i<n;i++){
            if(arr[i] == k){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        int arr[]={1,1,2,2,2,2,3};
        int n=arr.length;
        int k=3;
        countOccurance(arr,n,k);
    }
}
