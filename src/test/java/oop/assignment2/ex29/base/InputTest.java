package oop.assignment2.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void inputSetter_returns_false_for_0() {
        Input input = new Input();

        boolean expected = false;
        boolean actual = input.inputSetter("0");

        assertEquals(expected,actual);
    }

    @Test
    void inputSetter_returns_false_for_nonInt1() {
        Input input = new Input();

        boolean expected = false;
        boolean actual = input.inputSetter("ABC");

        assertEquals(expected,actual);
    }

    @Test
    void inputSetter_returns_false_for_nonInt2() {
        Input input = new Input();

        boolean expected = false;
        boolean actual = input.inputSetter(" ");

        assertEquals(expected,actual);
    }

    @Test
    void inputSetter_returns_true_for_Int1() {
        Input input = new Input();

        boolean expected = true;
        boolean actual = input.inputSetter("1");

        assertEquals(expected,actual);
    }

    @Test
    void inputSetter_returns_true_for_Int2() {
        Input input = new Input();

        boolean expected = true;
        boolean actual = input.inputSetter("4");

        assertEquals(expected,actual);
    }

    @Test
    void yearsRateOfReturn_returns_correct_year() {
        Input input = new Input();
        input.inputSetter("4");

        int expected = 18;
        int actual = input.yearsRateOfReturn();

        assertEquals(expected,actual);
    }
}