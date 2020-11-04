package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenTreeFourFiveThenExists() {
        boolean result = Triangle.exists(3.0, 4.0, 5.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenTenOneOneThenDoesntExist() {
        boolean result = Triangle.doesNotExist(10.0, 1.0, 1.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenTenFiveFiveThenDoesntExist() {
        boolean result = Triangle.doesNotExist(10.0, 5.0, 5.0);
        assertThat(result, is(true));
    }
}