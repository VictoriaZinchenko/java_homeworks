package com.groupqa1;

public class Rectangle extends Shape{
    double width;
    double height;


    public Rectangle() {
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString()
    {
        return super.toString() + ". The width = " + width +";" + " the height = " + height;
    }
    @Override
    public double calcArea(){
       double area = width * height;
        return area;
    }
}
