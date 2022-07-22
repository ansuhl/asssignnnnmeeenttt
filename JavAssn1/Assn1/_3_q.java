package com.company;

import java.util.Scanner;

//Develop a program, that accepts a deposit amount and calculates amount of interest
//        the deposit amount earns in a year. The bank pays a flat 4% interest for deposits of up
//        to Rs.1000, a flat 4.5% per year for deposits of up to Rs.5000, and a flat 5% for deposits
//        of more than Rs.5000.
//static double calInterest(int amt
public class _3_q {
    public static double calIntrest(int amt){
        double a=0;
        if(amt<=1000){
            double x=4.0d/100;
            x=x*amt;
            a=amt+x;
        }else if(amt<=5000 && amt >1000){
            double x=4.50d/100;
            x=x*amt;
            a=amt+x;
        }else{
            double x=5.0d/100;
            x=x*amt;
            a=amt+x;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(calIntrest(n));
    }
}
