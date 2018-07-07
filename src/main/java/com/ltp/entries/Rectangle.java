package com.ltp.entries;

import com.ltp.springcore.Shape;

public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(final double width, final double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea() {
        return width * height;
    }

    public double computeSide() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area = " + computeArea() +
                ", side = " + computeSide() +
                '}';
    }
}
