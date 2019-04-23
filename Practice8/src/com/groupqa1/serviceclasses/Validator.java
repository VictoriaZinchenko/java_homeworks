package com.groupqa1.serviceclasses;

public class Validator extends Exception{
    private double number;
    public double getNumber(){return number;}

    public Validator() {
    }

    public Validator(String message, double num){

        super(message);
        number = num;
    }

}
