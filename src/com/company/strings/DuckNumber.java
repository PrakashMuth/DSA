package com.company.strings;

public class DuckNumber {
    public static void duct_num(int arr[]){
        int temp=arr[0];
        if(temp == 0){
            System.out.println("This not Duct Num");
        }
        else {
            System.out.println("This  Duct num");
        }
    }
    public static void main(String args[]){
        int arr[]={'7','0','7','0','6'};
        duct_num(arr);
    }
}
