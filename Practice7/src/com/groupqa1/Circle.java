package com.groupqa1;

public class Circle extends Shape{
    private double radius;
    final double PI = 3.14;


    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", radius = " + radius;
    }

    @Override
    public double calcArea() {
        double area = PI * radius * radius;
        return area;
    }
}
