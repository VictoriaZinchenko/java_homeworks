package com.groupqa1;

public class Triangle extends Shape{
    double a;
    double b;
    double c;
    final int two = 2;
    String color = "green";

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString()
    {
        return "class = Triangle;" + " color = " + color
                + "\n The sides of the triangle a = " + a + "; b = " + b + "; c = " + c;
    }
    @Override
    public double calcArea(){
        double  p = (a + b + c)/two;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }


}
