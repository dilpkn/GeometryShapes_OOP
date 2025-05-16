package org.example;

public abstract class Shape {

    private String title;

    Shape() {}
    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}