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
    void validate_input_returns_false_if_there_is_space_as_name() {
        Inputs input = new Inputs("J", "", "ABCDE", "A12-1234");

        boolean expected = false;
        boolean actual = input.validateName(" ");

        assertEquals(expected,actual);
    }

    @Test
    void validate_input_returns_false_if_name_is_less_than_two_characters_long() {
        Inputs input = new Inputs("J", "", "ABCDE", "A12-1234");

        boolean expected = false;
        boolean actual = input.validateNameLength("J");

        assertEquals(expected,actual);
    }

    @Test
    void validate_input_returns_true_if_name_is_more_than_two_characters_long() {
        Inputs input = new Inputs("Jackson", "", "ABCDE", "A12-1234");

        boolean expected = true;
        boolean actual = input.validateNameLength("Ja");

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
    void validate_input_returns_true_if_the_ZipCode_is_numbers() {
        Inputs input = new Inputs("J", "", "12345", "A12-1234");

        boolean expected = true;
        boolean actual = input.validateZipCode();

        assertEquals(expected,actual);

    }

    @Test
    void validate_input_returns_false_if_employeeID_is_wrong_format1() {
        Inputs input = new Inputs("J", "", "ABCDE", "A12-1234");

        boolean expected = false;
        boolean actual = input.validateEmployeeID();

        assertEquals(expected,actual);
    }

    @Test
    void validate_input_returns_true_if_employeeID_is_right_format() {
        Inputs input = new Inputs("J", "", "ABCDE", "TK-1234");

        boolean expected = true;
        boolean actual = input.validateEmployeeID();

        assertEquals(expected,actual);
    }

    @Test
    void validate_input_returns_false_if_employeeID_is_wrong_format2() {
        Inputs input = new Inputs("J", "", "ABCDE", "12-1234");

        boolean expected = false;
        boolean actual = input.validateEmployeeID();

        assertEquals(expected,actual);
    }

}