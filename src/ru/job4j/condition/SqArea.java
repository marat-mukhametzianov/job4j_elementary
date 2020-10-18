package ru.job4j.condition;

public class SqArea
{
    public static double square(int perimeter, int ratio)
    {
        double width = perimeter / (2*(ratio + 1));
        double length = width * ratio;
        double rsl = width * length;;
        return rsl;
    }

    public static void main(String[] args)
    {
        double result1 = SqArea.square(6, 2);
        System.out.println("Perimeter = 6\ncoefficient = 2\narea = " + result1);
    }
}
