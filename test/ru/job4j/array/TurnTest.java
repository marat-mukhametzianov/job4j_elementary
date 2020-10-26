package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void when1234567Then7654321() {
        int[] in = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {7, 6, 5, 4, 3, 2, 1};
        int[] result = Turn.back(in);
        assertThat(result, is(expected));
    }

    @Test
    public void when123456Then654321() {
        int[] in = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};
        int[] result = Turn.back(in);
        assertThat(result, is(expected));
    }

    @Test
    public void when1Then1() {
        int[] in = {1};
        int[] expected = {1};
        int[] result = Turn.back(in);
        assertThat(result, is(expected));
    }
}