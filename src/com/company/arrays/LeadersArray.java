package com.company.arrays;

public class LeadersArray {
    public static void leaderElement(int arr[],int n){
        int temp=0;
        int j;
        for (int i=0;i<n;i++){
           for (j=i+1;j<n;j++){
               if(arr[i] <= arr[j]){
                   break;
               }
           }
           if(j==n){
               System.out.println(arr[i]);
           }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,0};
        int n=arr.length;
        leaderElement(arr,n);
    }
}
