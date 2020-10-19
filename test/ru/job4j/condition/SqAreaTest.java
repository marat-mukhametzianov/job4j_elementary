package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6R2Then2() {
        int perimeter = 6;
        int ratio = 2;
        double expected = 2;

        double out = SqArea.square(perimeter, ratio);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1R2Then0() {
        int perimeter = 1;
        int ratio = 2;
        double expected = 0;

        double out = SqArea.square(perimeter, ratio);
        Assert.assertEquals(expected, out, 0.01);
    }
}