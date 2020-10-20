package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void when321ThenMaxShortIs3() {
        int result = MultiMax.maxShort(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void when562ThenMaxShortIs6() {
        int result = MultiMax.maxShort(5, 6, 2);
        assertThat(result, is(6));
    }

    @Test
    public void when789ThenMaxShortIs9() {
        int result = MultiMax.maxShort(7, 8, 9);
        assertThat(result, is(9));
    }

    @Test
    public void when777ThenMaxShortIs7() {
        int result = MultiMax.maxShort(7, 7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void when321ThenMaxLongIs3() {
        int result = MultiMax.maxLong(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void when562ThenMaxLongIs6() {
        int result = MultiMax.maxLong(5, 6, 2);
        assertThat(result, is(6));
    }

    @Test
    public void when789ThenMaxLongIs9() {
        int result = MultiMax.maxLong(7, 8, 9);
        assertThat(result, is(9));
    }

    @Test
    public void when777ThenMaxLongIs7() {
        int result = MultiMax.maxLong(7, 7, 7);
        assertThat(result, is(7));
    }
}