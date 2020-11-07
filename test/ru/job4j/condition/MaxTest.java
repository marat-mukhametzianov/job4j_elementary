package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenFirst1Second3Then3() {
        int first = 1;
        int second = 3;
        int expected = 3;
        int out = Max.max(first, second);
        assertThat(out, is(expected));
    }

    @Test
    public void whenFirst3Secondt1Then3() {
        int first = 3;
        int second = 1;
        int expected = 3;
        int out = Max.max(first, second);
        assertThat(out, is(expected));
    }

    @Test
    public void whenFirst2Second2Then2() {
        int first = 2;
        int second = 2;
        int expected = 2;
        int out = Max.max(first, second);
        assertThat(out, is(expected));
    }

    @Test
    public void whenFirst5Second3Third7Then7() {
        int first = 5;
        int second = 3;
        int third = 7;
        int expected = 7;
        int out = Max.max(first, second, third);
        assertThat(out, is(expected));
    }

    @Test
    public void whenFirst5Second3Third7Fourth11Then11() {
        int first = 5;
        int second = 3;
        int third = 7;
        int fourth = 11;
        int expected = 11;
        int out = Max.max(first, second, third, fourth);
        assertThat(out, is(expected));
    }
}