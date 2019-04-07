package com.groupqa1;

public abstract class Shape implements Drawable{
   private String color;


    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public  String toString()
    {
        return this.getClass().getSimpleName() +  " color = " + color;
    }
    @Override
    public void draw() {
        System.out.println(this + " -> area = " + this.calcArea());

    }
    public abstract double calcArea();

}
