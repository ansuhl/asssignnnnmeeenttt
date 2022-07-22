package com.company;

public class Tablet extends Medecine{

    private String name;
    public Tablet(String name){
        this.name=name;
    }

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Store in Dry Place");
    }
}
