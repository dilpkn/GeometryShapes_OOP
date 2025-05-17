package org.example;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return (Math.pow(radius,2)*Math.PI);
    }

    @Override
    public double calculatePerimeter() {
        return (2*Math.PI* radius);
    }
}
