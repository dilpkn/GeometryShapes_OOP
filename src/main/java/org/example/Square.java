package org.example;

public class Square extends Shape{

    double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
