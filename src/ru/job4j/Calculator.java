package ru.job4j;

public class Calculator
{
    public static void main(String[] args)
    {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        //Additional variables
        int four = 4;
        int five = 5;
        int six = 6;

        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimesTwo = four * two;

        System.out.println("sixDivTwo = "+ sixDivTwo + "\n" + "fiveMinusTwo = " + fiveMinusTwo + "\n" + "fourTimesTwo = " + fourTimesTwo);
    }
}
