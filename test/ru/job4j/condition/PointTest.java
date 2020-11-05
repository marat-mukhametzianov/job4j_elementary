package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX10Y20X20Y10() {
        int x1 = 10;
        int y1 = 20;
        int x2 = 20;
        int y2 = 10;
        double expected = 14.14;
        double out = Point.distanceOld(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinusX10Y20X20Y10() {
        int x1 = -10;
        int y1 = -20;
        int x2 = -20;
        int y2 = -10;
        double expected = 14.14;
        double out = Point.distanceOld(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX0Y0X0Y0Then0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double expected = 0;
        double out = Point.distanceOld(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenAx10y20Bx20y10() {
        Point a = new Point(10, 20);
        Point b = new Point(20, 10);
        double expected = 14.14;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenNegativeAx10y20Bx20y10() {
        Point a = new Point(-10, -20);
        Point b = new Point(-20, -10);
        double expected = 14.14;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenAx0y0Bx0y0Then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}