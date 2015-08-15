package com.taran.shapes;

public abstract class Shape {
    private Point center;

    public Shape(Point center) {
        this.center = center;
    }

    public abstract void draw();

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
