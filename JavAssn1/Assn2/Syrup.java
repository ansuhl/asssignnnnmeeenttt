package com.company;

public class Syrup extends Medecine{
    private String name;
    public Syrup(String name){
        this.name=name;
    }

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("store in a cool dry place");
    }
}
