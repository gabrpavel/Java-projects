package com.gabr.corejava;

public class Circle extends Shape{

    private final double radius;
    static double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI*Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
}
