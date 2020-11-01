package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenOnceEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.changeOnce(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenOnce50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.changeOnce(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenOnce100buy23() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10, 10, 10, 5, 2};
        int[] rsl = machine.changeOnce(100, 23);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when100buy23() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10, 10, 10, 5, 2};
        int[] rsl = machine.change(100, 23);
        assertThat(rsl, is(expected));
    }
}