package com.taran.shapes;

import org.junit.Test;

public class LineTest {
    Point start = new Point(10, 15);
    Point end = new Point(20, 25);

    Line rectangle = new Line(start, end);

    @Test
    public void testDraw() throws Exception {
        rectangle.draw();
    }

    @Test
    public void testGetEnd() throws Exception {

    }

    @Test
    public void testSetEnd() throws Exception {

    }

    @Test
    public void testGetStart() throws Exception {

    }

    @Test
    public void testSetStart() throws Exception {

    }
}