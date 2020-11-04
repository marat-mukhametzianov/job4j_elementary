package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenRuMondayThen1() {
        String day = "Понедельник";
        int expected = 1;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenRuTuesdayThen2() {
        String day = "Вторник";
        int expected = 2;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenRuWednesdayThen3() {
        String day = "Среда";
        int expected = 3;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenRuThursdayThen4() {
        String day = "Четверг";
        int expected = 4;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenRuFridayThen5() {
        String day = "Пятница";
        int expected = 5;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenRuSaturdayThen6() {
        String day = "Суббота";
        int expected = 6;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenRuSundayThen7() {
        String day = "Воскресенье";
        int expected = 7;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenRuAnymoreThenMinus1() {
        String day = "Слово";
        int expected = -1;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMondayThen1() {
        String day = "Monday";
        int expected = 1;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenTuesdayThen2() {
        String day = "Tuesday";
        int expected = 2;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenWednesdayThen3() {
        String day = "Wednesday";
        int expected = 3;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenThursdayThen4() {
        String day = "Thursday";
        int expected = 4;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFridayThen5() {
        String day = "Friday";
        int expected = 5;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSaturdayThen6() {
        String day = "Saturday";
        int expected = 6;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSundayThen7() {
        String day = "Sunday";
        int expected = 7;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenAnymoreThenMinus1() {
        String day = "Word";
        int expected = -1;
        int out = new MultipleSwitchWeek().numberOfDay(day);
        Assert.assertEquals(expected, out);
    }
}