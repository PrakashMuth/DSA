package com.company.arrays;

public class BinarySearch {
    public static int binarysearch(int arr[],int s){
        int start=0;
        int end=arr.length-1;
        int mid= start + (end-1) / 2;
        while (start <= end){
            if(arr[mid] == s){
                return mid;
            }

            if(arr[mid] < s){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int s=2;
        int out=binarysearch(arr,s);
        if (out == -1){
            System.out.println("No elemnt");
        }
        else {
            System.out.println("Element" + out);
        }
    }
}
