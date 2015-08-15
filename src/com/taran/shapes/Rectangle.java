package com.taran.shapes;

public class Rectangle extends Shape {
    private int height;
    private int width;

    private Point p = new Point(10, 20);

    public Rectangle(Point center, int height, int width) {
        super(center);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle with center: " + p + " height: " + height + " and width: " + width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
