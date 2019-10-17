package com.company.arrays;

public class ImmediateSmaller {
    public static void immediateSmaller(int arr[],int n){
        int i;
        for (i=0;i<n;i++){
            int next=-1;
            for (int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    next=arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "------------------>>>" + next);
        }
    }
    public static void main(String args[]){
        int arr[]={4, 2, 1, 5, 3};
        int n=arr.length;
        immediateSmaller(arr,n);
    }
}
