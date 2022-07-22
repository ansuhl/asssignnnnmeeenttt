package com.company;

public class ointments extends Medecine{
    private String name;
    public ointments(String name){
        this.name=name;
    }

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("for external use only");
    }
}
