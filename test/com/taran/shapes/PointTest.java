package com.taran.shapes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

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
}