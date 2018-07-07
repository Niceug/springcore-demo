package com.ltp.springcore;

public class Circle implements Shape {
    private final double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(final double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeSide() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " area = " + computeArea() +
                " side = " + computeSide() +
                '}';
    }
}
