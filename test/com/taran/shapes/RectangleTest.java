package com.taran.shapes;

import org.junit.Test;

public class RectangleTest {
    private Rectangle r = new Rectangle(new Point(10, 15), 10, 20);

    @Test
    public void testDraw() throws Exception {
        r.draw();
    }
}