package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class ShapeUtil {
    public Circle createRandomCircle(){
        double radius = ThreadLocalRandom.current().nextDouble(0,10);
        return  new Circle(radius);
    }

    public Square createRandomSquare(){
        double side = ThreadLocalRandom.current().nextDouble(0,10);
        return new Square(side);
    }

    public Rectangle createRandomRectangle(){
        double side1 = ThreadLocalRandom.current().nextDouble(0,10);
        double side2 = ThreadLocalRandom.current().nextDouble(0,10);
        return new Rectangle(side1,side2);
    }

    public Shape createRandomShape(){
        int random = ThreadLocalRandom.current().nextInt(0,3);
        switch(random){
            case 0:
                return createRandomCircle();
            case 1:
                return createRandomSquare();
            case 2:
                return createRandomRectangle();
        }
        return null;
    }

    public double calculateArea(Shape[] shapes){
        double area = 0;
        for(Shape shape : shapes){
            area+=shape.calculateArea();
        }
        return area;
    }

    public double calculatePerimeter(Shape[] shapes){
        double perimeter = 0;
        for(Shape shape : shapes){
            perimeter+=shape.calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
