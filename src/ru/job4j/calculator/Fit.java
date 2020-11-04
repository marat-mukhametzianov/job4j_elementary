package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short manHeight = 175;
        short womanHeight = 170;
        double man = manWeight(manHeight);
        double woman = womanWeight(womanHeight);
        System.out.println("Woman " + womanHeight + " is " + woman);
        System.out.println("Man " + manHeight + " is " + man);
    }
}
