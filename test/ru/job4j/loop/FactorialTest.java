package ru.job4j.loop;

import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int number = 5;
        int expected = 120;
        int out = Factorial.calc(number);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int expected = 1;
        int out = Factorial.calc(number);
    }
}