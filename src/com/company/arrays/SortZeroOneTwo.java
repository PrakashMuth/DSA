package com.company.arrays;

public class SortZeroOneTwo {
    public static void sortArray(int arr[]){
        int i;
        int count0=0;
        int count1=0;
        int count2=0;

        for (i=0;i<arr.length;i++){
            switch (arr[i]){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        i=0;
        while (count0 > 0){
            arr[i++]=0;
            count0--;
        }

        while (count1 > 0){
            arr[i++]=1;
            count1--;
        }

        while (count2 > 0){
            arr[i++]=2;
            count2--;
        }
    }
    public static void main(String args[]){
        int arr[]= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sortArray(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
