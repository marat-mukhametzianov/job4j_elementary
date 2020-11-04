package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TreeMaxTest {

    @Test
    public void firstMax() {
        int result = TreeMax.max(10, 5, 1);
        assertThat(result, is(10));
    }

    @Test
    public void secondMax() {
        int result = TreeMax.max(10, 50, 1);
        assertThat(result, is(50));
    }

    @Test
    public void thirdMax() {
        int result = TreeMax.max(1, 5, 100);
        assertThat(result, is(100));
    }

    @Test
    public void allEq() {
        int result = TreeMax.max(1, 1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void firstEqSecond() {
        int result = TreeMax.max(10, 10, 1);
        assertThat(result, is(10));
    }

    @Test
    public void firstEqThird() {
        int result = TreeMax.max(100, 1, 100);
        assertThat(result, is(100));
    }

    @Test
    public void secondEqThird() {
        int result = TreeMax.max(1, 100, 100);
        assertThat(result, is(100));
    }
}