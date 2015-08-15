package com.taran.shapes;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        x = point.getX();
        y = point.getY();
    }

    public Point relativePoint(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }

    public String toString() {
        //can create String with StringBuilder
        return "(" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
