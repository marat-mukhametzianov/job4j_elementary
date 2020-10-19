package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeft1Right3Then3() {
        int left = 1;
        int right = 3;
        int expected = 3;

        int out = Max.max(left, right);
        assertThat(out, is(expected));
    }

    @Test
    public void whenLeft3Right1Then3() {
        int left = 3;
        int right = 1;
        int expected = 3;

        int out = Max.max(left, right);
        assertThat(out, is(expected));
    }

    @Test
    public void whenLeft2Right2Then2() {
        int left = 2;
        int right = 2;
        int expected = 2;

        int out = Max.max(left, right);
        assertThat(out, is(expected));
    }
}