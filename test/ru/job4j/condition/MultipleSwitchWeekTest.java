package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenRuMondayThen1() {
        String day = "Понедельник";
        int expected = 1;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }
}