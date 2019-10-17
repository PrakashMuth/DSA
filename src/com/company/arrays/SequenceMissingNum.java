package com.company.arrays;

public class SequenceMissingNum {
    public static void sequenceNum(int[] arr){
        int n=arr.length + 1;
        int tot=(n * (n+1) /2);
        int sub_tot=0;
        for (int i=0;i<arr.length;i++){
            sub_tot=sub_tot + arr[i];
        }
        int missNum=tot-sub_tot;
        System.out.println("missNum" + missNum);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,10};
        sequenceNum(arr);
    }
}
