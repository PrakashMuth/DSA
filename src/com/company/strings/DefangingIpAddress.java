package com.company.strings;

public class DefangingIpAddress {
    public static String IpAddress(String address){
        String str1="";
        for (int i=0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                str1=str1 + "[.]";
            }
            else {
                str1=str1 + address.charAt(i);
            }
        }
        return str1;
    }
    public static void main(String args[]){
        String address="1.1.1.1";
        String temp=IpAddress(address);
        for(int i=0;i<temp.length();i++){
            System.out.print(temp.charAt(i) + " ");
        }
    }
}
