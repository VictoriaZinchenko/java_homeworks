package com.groupqa1;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Rectangle(12, 3),
                new Rectangle(8.8, 5),
                new Rectangle(17, 6.5),
                new Rectangle(23.2, 10.5),
                new Circle(7),
                new Circle(12),
                new Circle(4.5),
                new Triangle(3, 4, 5),
                new Triangle(8, 9, 10)
        };

        viewShapes(shapes);
        System.out.println("\n Total area of all shapes = " + getTotalArea(shapes));
        System.out.println(getAreas(shapes));
    }

    static void viewShapes(Shape[] shapes) {
        int number = 0;
        for (Shape shape : shapes) {
            System.out.println("Shape" + ++number +":" + shape + "\n Area = " + shape.calcArea());
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




