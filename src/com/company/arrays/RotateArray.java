package com.company.arrays;

public class RotateArray {
    public static void rotateArray(int arr[],int n,int d){
        for(int i=0;i<d;i++){
            leftRotateArray(arr,n);
        }
    }
    public static void leftRotateArray(int[] arr,int n){
        int temp=arr[0];
        for (int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int d=2;
        rotateArray(arr,n,d);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
