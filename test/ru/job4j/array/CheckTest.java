package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void when4TrueThenTrue() {
        boolean[] in = {true, true, true, true};
        boolean expected = true;
        boolean out = Check.mono(in);
        assertThat(out, is(expected));
    }

    @Test
    public void whenTrueFalseTrueTrueThenFalse() {
        boolean[] in = {true, false, true, true};
        boolean expected = false;
        boolean out = Check.mono(in);
        assertThat(out, is(expected));
    }

    @Test
    public void when4FalseThenTrue() {
        boolean[] in = {false, false, false, false};
        boolean expected = true;
        boolean out = Check.mono(in);
        assertThat(out, is(expected));
    }
}