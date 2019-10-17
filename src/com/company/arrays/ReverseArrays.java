package com.company.arrays;

import java.util.Scanner;

public class ReverseArrays {
    public static void reverse(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while (i < j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int[] arr=new int[n];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=scan.nextInt();
//        }
        reverse(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
