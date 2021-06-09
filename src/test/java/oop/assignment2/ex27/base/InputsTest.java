/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputsTest {

    @Test
    void validate_input_returns_false_if_there_is_no_input() {
        Inputs input = new Inputs("J", "", "ABCDE", "A12-1234");

        boolean expected = false;
        boolean actual = input.validateName("");

        assertEquals(expected,actual);
    }

    @Test
    void validate_input_returns_false_if_there_are_less_than_two_characters_long() {
        Inputs input = new Inputs("J", "", "ABCDE", "A12-1234");

        boolean expected = false;
        boolean actual = input.validateNameLength("J");

        assertEquals(expected,actual);
    }

    @Test
    void validate_input_returns_false_if_the_ZipCode_is_not_numbers() {
        Inputs input = new Inputs("J", "", "ABCDE", "A12-1234");

        boolean expected = false;
        boolean actual = input.validateZipCode();

        assertEquals(expected,actual);

    }

    @Test
    void validate_input_returns_false_if_employeeID_is_wrong_format() {
        Inputs input = new Inputs("J", "", "ABCDE", "A12-1234");

        boolean expected = false;
        boolean actual = input.validateEmployeeID();

        assertEquals(expected,actual);
    }
}