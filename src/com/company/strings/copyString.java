package com.company.strings;

public class copyString {
    static void mycopy(char str1[],char str2[]){
        int i=0;
        for(i=0; i< str1.length; i++){
            str2[i]=str1[i];
        }
    }
    public static void main(String args[]){
        char[] st1="hello" .toCharArray();
        char[] str2= new char[st1.length];

        mycopy(st1,str2);

        for (int j=0;j<str2.length;j++){
            System.out.println(str2[j]);
        }
    }
}
