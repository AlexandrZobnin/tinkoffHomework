package edu.hw2;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public Rectangle setWidth(int width) {
        return new Rectangle(width, height);
    }

    public Rectangle setHeight(int height) {
        return new Rectangle(width, height);
    }

    double area() {
        return width * height;
    }
}


