package com.company.arrays;

public class SecondLargest {
    public static void largestNum(int arr[],int n){
        int first = 0;
        int second = 0;
        for(int i=0;i<n-1;i++) {
            if(arr[i] > first){
                second=first;
                System.out.println(second);
                first=arr[i];
            }
            else if (arr[i] > second && arr[i] != first){
                second=arr[i];
            }
        }
        //System.out.println(second);
    }
    public static void main(String args[]){
        int arr[]={333,66,1,44,100,444,21};
        int n=arr.length;
        largestNum(arr,n);
    }
}
