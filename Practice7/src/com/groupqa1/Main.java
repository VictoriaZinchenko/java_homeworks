package com.groupqa1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Rectangle("green", 12, 3),
                new Rectangle("red", 8.8, 5),
                new Rectangle("black", 17, 6.5),
                new Rectangle("blue", 23.2, 10.5),
                new Circle("white", 7),
                new Circle("pink", 12),
                new Circle("orange", 4.5),
                new Triangle("purple", 3, 4, 5),
                new Triangle("yellow", 8, 9, 10)
        };


        System.out.println("\n Total area of all shapes = " + getTotalArea(shapes));
        System.out.println(getAreas(shapes));

        System.out.println("-----Comparing Shapes By Area-----");
        Arrays.sort(shapes, new CompareShapeByArea());
        viewShapes(shapes);
        System.out.println("-----Comparing Shapes By Color-----");
        Arrays.sort(shapes, new CompareShapeByColor());
        viewShapes(shapes);

    }
    static void viewShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    static double getTotalArea(Shape[] shapes) {
        double result = 0;
        for (Shape el : shapes) {
            result += el.calcArea();
        }
        return result;
    }

    static String getAreas(Shape[] shapes) {
        String result = " ";
        double areaRectangles = 0;
        double areaCircles = 0;
        double areaTriangles = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                areaRectangles += shape.calcArea();
            } else if (shape instanceof Circle) {
                areaCircles += shape.calcArea();
            } else if (shape instanceof Triangle) {
                areaTriangles += shape.calcArea();

            }
        }
        result = "\n The total area of rectangles = " + areaRectangles
                + "\n The total area of circles = " + areaCircles
                + "\n The total area of triangles = " + areaTriangles ;
         return result;
    }

}




