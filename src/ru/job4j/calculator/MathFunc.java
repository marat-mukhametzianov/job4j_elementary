package ru.job4j.calculator;

public class MathFunc {
    public static int multiplication(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int division(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int resultOne = MathFunc.multiplication(3);
        int resultTwo = MathFunc.multiplication(5);
        int total = resultOne + resultTwo;
        System.out.println(total);
    }
}
