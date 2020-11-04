package ru.job4j.condition;

public class SqArea {
    public static double square(int perimeter, int ratio) {
        double width = perimeter / (2 * (ratio + 1));
        double length = width * ratio;
        double result = width * length;
        return result;
    }

    public static void main(String[] args) {
        int petimeter = 1;
        int ration = 2;
        double result1 = SqArea.square(petimeter, ration);
        System.out.println("Perimeter = " + petimeter + "\ncoefficient = " + ration + "\narea = " + result1);
    }
}
