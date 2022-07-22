package com.company;

import java.util.Scanner;

public class _8_q {
    public static double calculateBill(String connectionType,int consumedUnits){
        if(connectionType.contains("domestic")){
            if(consumedUnits<=100){
                return Math.max(250,consumedUnits*4);
            }else if(consumedUnits>100 && consumedUnits<=300){
                return consumedUnits*4.50;
            }else if(consumedUnits>300 && consumedUnits<=500){
                return consumedUnits*4.75;
            }else{
                return consumedUnits*5;
            }
        }else{
            if(consumedUnits<=100){
                return Math.max(350,consumedUnits*4.25);
            }else if(consumedUnits>100 && consumedUnits<=300){
                return consumedUnits*4.75;
            }else if(consumedUnits>300 && consumedUnits<500){
                return consumedUnits*5;
            }else{
                return consumedUnits*5.25;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String m=scn.nextLine();
        int n=scn.nextInt();
        System.out.println(calculateBill(m,n));;
    }
}
