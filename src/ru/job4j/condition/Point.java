package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    /**
     * Constructor, receiving two coordinates.
     * @param x - X-axis coordinate.
     * @param y = Y-axis coordinate.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor, receiving three coordinates.
     * @param x - X-axis coordinate.
     * @param y = Y-axis coordinate.
     * @param z = Z-axis coordinate.
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance3d(Point another) {
        return sqrt(pow(this.x - another.x, 2) + pow(this.y - another.y, 2) + pow(this.z - another.z, 2));
    }

    public double distance(Point another) {
        return sqrt(pow(this.x - another.x, 2) + pow(this.y - another.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%d, %d]", this.x, this.y));
    }

    /**
     * This method is no longer used due to OOP
     * @deprecated
     */
    public static double distanceOld(int x1, int y1, int x2, int y2) {
        int step1 = x2 - x1;
        int step2 = y2 - y1;
        double step3 = Math.pow(step1, 2);
        double step4 = Math.pow(step2, 2);
        double step5 = step3 + step4;
        double result = Math.sqrt(step5);
        return result;
    }

    /**
     * This method is no longer used due to OOP
     * @deprecated
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        System.out.println(a.distance(b));
        a.info();
    }
}
