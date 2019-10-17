package com.company.arrays;

import java.util.Scanner;

public class SparseArray {
    public static void sparseArr(String arr[],String arr1[]){
        int count;
        for(int i=0;i<arr1.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr1[i].equals(arr[j])){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String args[]){
        Scanner s1=new Scanner(System.in);
        int n1=s1.nextInt();
        String arr[]=new String[n1];
        for (int i=0;i<arr.length;i++){
            arr[i]=s1.next();
        }

        int n2=s1.nextInt();
        String arr1[]=new String[n2];
        for (int i=0;i<arr1.length;i++){
            arr1[i]=s1.next();
        }
        sparseArr(arr,arr1);
    }
}
