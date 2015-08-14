package com.taran.shapes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PointTest {

    Point point = new Point(10, 15);

    @Test
    public void testRelativePoint() throws Exception {
        Point actualRelaitivepoint =  point.relativePoint(10, 15);
        assertNotNull(actualRelaitivepoint);
    }

    @Test
    public void testToString() throws Exception {
        String actual = point.toString();
        String expected = "(10,15)";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToStringNotNull() throws Exception {
        String actual = point.toString();
        assertNotNull(actual, point);
    }

    @Test
    public void testGetX() throws Exception {
        int actual = point.getX();
        int expected = 10;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetX() throws Exception {
        point.setX(10);
    }

    @Test
    public void testGetY() throws Exception {
        int actual = point.getY();
        assertTrue(actual == 15);

    }

    @Test
    public void testSetY() throws Exception {
        point.setY(10);
    }
}