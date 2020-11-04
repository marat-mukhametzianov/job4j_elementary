package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int result = value / 70;
        return result;
    }

    public static int rubleToDollar(int value) {
        int result = value / 60; /* формула перевода рублей в доллары. */
        return result;
    }

    public static void main(String[] args) {
        int in = 140;
        int expectedEuro = 2;
        int outEuro = rubleToEuro(in);
        int expectedDollar = 2;
        int outDollar = rubleToDollar(in);
        boolean passed = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result is: " + passed);
        passed = expectedDollar == outDollar;
        System.out.println("140 rubles are 2 dollars. Test result is: " + passed);
    }
}
