package com.company.arrays;

import java.io.IOException;
import java.util.Scanner;

public class LeftRotateArray {
    public static void rotateArray(int arr[],int d){
        int n=arr.length;
        int mod=d % n;
        for (int i=0;i<n;i++){
            System.out.print(arr[(i+mod) % n] + " ");
        }
    }
    public static void main(String args[]) throws IOException {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int d=scan.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        rotateArray(arr,d);
    }
}