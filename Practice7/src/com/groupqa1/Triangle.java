package com.groupqa1;

public class Triangle extends Shape{
    double a;
    double b;
    double c;
    final int two = 2;


    public Triangle() {
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString()
    {
        return super.toString() + ". The sides of the triangle: a = " + a + "; b = " + b + "; c = " + c;
    }
    @Override
    public double calcArea(){
        double  p = (a + b + c)/two;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;

    }


}
