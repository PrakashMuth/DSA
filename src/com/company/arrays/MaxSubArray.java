package com.company.arrays;

public class MaxSubArray {
    public static void subArray(int[] arr,int n,int k){
        for (int i=0;i<n-k;i++){
            int max=arr[i];
            for (int j=1;j<k;j++){
                if (arr[i+j] > max){
                    max=arr[i+j];
                }
            }
            System.out.println(max);
        }
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,2,3,6};
        int n=arr.length;
        int k=3;
        subArray(arr,n,k);
    }
}
