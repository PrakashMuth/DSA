package com.company.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicate(int[] arr){
        int n=arr.length;
        int[] temp = new int[n];
        int k = 0;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i] != arr[i+1]){
                temp[k]=arr[i];
                k++;
            }
        }
        temp[k++]=arr[n-1];
        for (int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        return k;
    }
    public static void main(String args[]){
        int[] arr={2,1,2,5,4,3,1,1,1,4,4,4};
        int n=removeDuplicate(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
