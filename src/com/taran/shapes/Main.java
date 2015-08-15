package com.taran.shapes;

/**
 * Created by qa-mach3 on 14.08.15.
 */
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(10, 15);
        Point point2 = new Point(20, 30);
        Point point3 = new Point(40, 50);

        Line line1 = new Line(point3, point2);

        Rectangle r = new Rectangle(point1, 10, 20);

        line1.draw();

    }
}
