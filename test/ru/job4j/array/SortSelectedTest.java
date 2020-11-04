package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void when34125Sorted12345() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expected));
    }

    @Test
    public void when312Sort123() {
        int[] input = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[] {1, 2, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void when3121Sort1123() {
        int[] input = new int[] {3, 1, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[] {1, 1, 2, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void when310Sort013() {
        int[] input = new int[] {3, 1, 0};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[] {0, 1, 3};
        assertThat(result, is(expected));
    }
}