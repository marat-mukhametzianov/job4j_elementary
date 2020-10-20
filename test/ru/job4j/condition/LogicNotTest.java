package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void when2ThenIsEvenTrue() {
        int in = 2;
        boolean expected = true;
        boolean out = new LogicNot().isEven(in);
        assertThat(out, is(expected));
    }

    @Test
    public void when3ThenIsEvenFalse() {
        int in = 3;
        boolean expected = false;
        boolean out = new LogicNot().isEven(in);
        assertThat(out, is(expected));
    }

    @Test
    public void when3ThenIsPositiveTrue() {
        int in = 3;
        boolean expected = true;
        boolean out = new LogicNot().isPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void whenMinus3ThenIsPositiveFalse() {
        int in = -3;
        boolean expected = false;
        boolean out = new LogicNot().isPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void when3ThenNotEvenTrue() {
        int in = 3;
        boolean expected = true;
        boolean out = new LogicNot().notEven(in);
        assertThat(out, is(expected));
    }

    @Test
    public void when2ThenNotEvenFalse() {
        int in = 2;
        boolean expected = false;
        boolean out = new LogicNot().notEven(in);
        assertThat(out, is(expected));
    }

    @Test
    public void when2ThenNotPositiveFalse() {
        int in = 2;
        boolean expected = false;
        boolean out = new LogicNot().notPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void whenMinus2ThenNotPositiveTrue() {
        int in = -2;
        boolean expected = true;
        boolean out = new LogicNot().notPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void when3ThenNotEvenAndPositiveTrue() {
        int in = 3;
        boolean expected = true;
        boolean out = new LogicNot().notEvenAndPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void when2ThenNotEvenAndPositiveFalse() {
        int in = 2;
        boolean expected = false;
        boolean out = new LogicNot().notEvenAndPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void whenMinus2ThenNotEvenAndPositiveFalse() {
        int in = -2;
        boolean expected = false;
        boolean out = new LogicNot().notEvenAndPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void whenMinus3ThenNotEvenAndPositiveFalse() {
        int in = -3;
        boolean expected = false;
        boolean out = new LogicNot().notEvenAndPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void when2ThenEvenOrNotPositiveTrue() {
        int in = 2;
        boolean expected = true;
        boolean out = new LogicNot().evenOrNotPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void whenMinus2ThenEvenOrNotPositiveTrue() {
        int in = -2;
        boolean expected = true;
        boolean out = new LogicNot().evenOrNotPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void whenMinus3ThenEvenOrNotPositiveTrue() {
        int in = -3;
        boolean expected = true;
        boolean out = new LogicNot().evenOrNotPositive(in);
        assertThat(out, is(expected));
    }

    @Test
    public void when3ThenEvenOrNotPositiveTrue() {
        int in = 3;
        boolean expected = false;
        boolean out = new LogicNot().evenOrNotPositive(in);
        assertThat(out, is(expected));
    }
}