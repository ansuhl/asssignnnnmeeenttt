package com.company;
//Write a program that -:
//        i. Create a class Medicine to represent a drug manufactured by a pharmaceutical
//        company. Provide a function displayLabel() in this class to print Name and
//        address of the company.
//        ii. Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the
//        displayLabel() function in each of these classes to print additional information
//        suitable to the type of medicine. For example, in case of tablets, it could be
//        “store in a cool dry place”, in case of ointments it could be “for external use
//        only” etc.
//        iii. Create a class TestMedicine. Write main function to do the following:
//        a. Declare an array of Medicine references of size 10
//        b. Create a medicine object of the type as decided by a randomly generated integer
//        in the range 1 to 3.
//        c. Refer Java API Documentation to find out random generation feature.
//        d. Check the polymorphic behavior of the displayLabel() method
public class Medecine {
    private String name;
    private String adress;
    private int type;
    public Medecine(){

    }
    public Medecine(int type){
        this.type=type;
    }
    public void displayLabel(){
        System.out.println("Adress is "+this.adress+" Name is "+this.name);
    }


}
