package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double leftover = amount;

        while (leftover > 0) {
            leftover = leftover + leftover * percent / 100 - salary;
            year++;
        }
        return year;
    }
}
