package org.example;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil util = new ShapeUtil();

        Shape rectangle = util.createRandomRectangle();
        System.out.println("Area rectangle = " + util.calculateArea(rectangle));
        System.out.println("Perimeter circle = " + util.calculatePerimeter(rectangle));

        Shape circle = util.createRandomCircle();
        System.out.println("Area circle = " + util.calculateArea(circle));
        System.out.println("Perimeter circle = " + util.calculatePerimeter(circle));

        Shape square = util.createRandomSquare();
        System.out.println("Area square = " + util.calculateArea(square));
        System.out.println("Perimeter square = " + util.calculatePerimeter(square));
    }
}
