package com.company;

//Write a program to check whether the input alphabet is a vowel or not.
//static boolean checkAlpha(char alph)

import java.util.Scanner;

public class _2_q {
    public static boolean checkAlpha(char alph){
        boolean ans=false;
        if(alph=='a' ||alph=='e' ||alph=='i' ||alph=='o' ||alph=='u' ){
            ans=true;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char ch=scn.next().charAt(0);
        System.out.println(checkAlpha(ch));
    }
}
