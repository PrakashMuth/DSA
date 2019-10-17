package com.company.arrays;

public class MajorityElement {
    public static void majorityElement(int[] arr){
        int max_count=0;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            int m=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    m++;
                }
            }

            if(m > max_count){
                index=i;
                max_count=m;
            }
        }

        if (max_count > (arr.length) /2){
            System.out.println(arr[index]);
        }
        else {
            System.out.println("No Majority Element");
        }
    }
    public static void main(String args[]){
        int[] arr={1,1,3,2};
        majorityElement(arr);
    }
}
