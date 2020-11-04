package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double temp = (a + b + c) / 2;
        double result = Math.sqrt(temp * (temp - a) * (temp - b) * (temp - c));
        return result;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(3, 4, 5);
        System.out.println("Area of (3, 4, 5) = " + result);
    }
}
