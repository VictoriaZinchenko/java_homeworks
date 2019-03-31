package com.groupqa1;

public class Rectangle extends Shape{
    double width;
    double height;
    String color = "red";

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString()
    {
        return "class = Rectangle;"+ " color = " + color
                + "\n The width = " + width +";" + " the height = " + height;
    }
    @Override
    public double calcArea(){
        area = width * height;
        return area;
    }
}
