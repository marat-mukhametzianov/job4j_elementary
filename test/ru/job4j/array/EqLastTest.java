package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEqAndDifferentLengths() {
        int[] left = {1, 2, 3, 7, 3};
        int[] right = {5, 4, 3};
        assertThat(EqLast.check(left, right), is(true));
    }

    @Test
    public void whenNotEqAndDifferentLengths() {
        int[] left = {1, 2, 3, 7, 3};
        int[] right = {5, 0};
        assertThat(EqLast.check(left, right), is(false));
    }

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertThat(EqLast.check(left, right), is(true));
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        assertThat(EqLast.check(left, right), is(false));
    }
}