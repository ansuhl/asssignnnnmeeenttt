package com.company;
//Develop the program, which accepts the gross pay and produces the amount of tax
//        owed. For a gross pay of $240 or less, the tax is 0%; for over $240 and less than
//        $480, the tax rate is 15%; and for any pay over $480, the tax rate is 28%.
//static double calTax(int gp)


import java.util.Scanner;

public class _4_q {
    public static double calTax(int gp){
         double ans=0.0d;
         if(gp<=240){
             return 0.0d;
         }else if(gp>240 && gp<=480){
             return (15.0d/100)*gp;
         }else {
             return (28.0d / 100) * gp;
         }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(calTax(n));
    }
}
