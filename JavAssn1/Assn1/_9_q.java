package com.company;

//9. Some credit card companies pay back a small portion of the charges a customer makes
//        over a year. A particular credit card company's pay back policy is as follows:
//        1.0.25% for charges up to Rs. 500.
//        2.0.50% for the next Rs.1000 (that is, the portion between Rs. 500 and Rs. 1500),
//        3.0.75% for the next Rs.1000 (that is, the portion between Rs. 1500 and Rs. 2500),
//        4.1.0% for charges above Rs2500.
//        Thus, a customer who charges Rs. 400 a year receives Rs.1.00,
//        which is 0.25 x 1/100 x 400, and one who charges Rs1, 400 a year receives Rs. 5.75,
//        which is 1.25 = 0.25 x 1/100 x 500 for the first Rs. 500 and 0.50 x 1/100 x 900 = 4.50 for
//        the next Rs. 900. Determine by hand the pay backs amount for a customer who charged
//        Rs. 2000 and one who charged Rs. 2600.
//        Define the program, which accepts a charge amount and computes the corresponding
//        pay back amount.
//static float chargeAmount(int Charges)
//        10.Write a program to create a rectangular array containing a multiplication table from 1*1
//        up to 12*12. Output the table as 13 columns with the numeric values right-aligned in
//        columns. (The first line of output will be the column headings, the first column with no
//        heading, then the numbers 1 to 12 for the remaining columns. The first item in each of the
//        succeeding lines is the row heading, which ranges from 1 to 12.)
//static void displayMultiplicationMatrix()
//        Note : make use of System.format() method for printing numbers in output(right aligned)

import java.util.Scanner;

public class _9_q {
    public static void main(){
        int []arr=new int [13];

    }
    public static float chargeAmount(int Charges){
        if(Charges <= 500){
            return 0.25f*Charges;
        }else if(Charges>500 && Charges<=1500){
            return 0.50f*Charges;
        }else if(Charges>1500 && Charges<=2500){
            return 0.75f*Charges;
        }else{
            return 1.0f*Charges;
        }
    }
    public static void displayMultiplicationMatrix() {
        int [][]arr=new int[12][12];
        System.out.format("%5s","");
        for(int i=1;i<13;i++){
            System.out.format("%5d",i);
        }
        System.out.println();
        for(int i=1;i<13;i++){
            System.out.format("%5d",i);
            for(int j=1;j<13;j++){
                arr[i-1][j-1]=i*j;
                System.out.format("%5d",i*j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

    }
}
