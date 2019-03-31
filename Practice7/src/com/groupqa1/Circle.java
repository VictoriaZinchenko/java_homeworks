package com.groupqa1;

public class Circle extends Shape{
    double radius;
    final double PI = 3.14;
    String color = "blue";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double square(double a){
        double result = a*a;
        return result;
    }
    @Override
    public String toString()
    {
        return "class = Circle;" + " color = " + color +  "; radius = " + radius;
    }
    @Override
    public double calcArea(){
        area = PI * square(radius);
        return area;
    }

}
