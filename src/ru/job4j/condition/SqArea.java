package ru.job4j.condition;

public class SqArea {
    public static double square(int perimeter, int ratio) {
        double width = perimeter / (2 * (ratio + 1));
        double length = width * ratio;
        double rsl = width * length;
        return rsl;
    }

    public static void main(String[] args) {
        int p = 1;
        int r = 2;
        double result1 = SqArea.square(p, r);
        System.out.println("Perimeter = " + p + "\ncoefficient = " + r + "\narea = " + result1);
    }
}
