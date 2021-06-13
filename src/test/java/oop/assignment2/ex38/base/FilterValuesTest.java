/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterValuesTest {

    @Test
    void filterEvenNumbers_collects_even_numbers() {
        FilterValues newValues = new FilterValues("1 2 3 4 5 6 7 8 9 ");

        int[] actual = newValues.filterEvenNumbers();
        int[] expected = {2,4,6,8};

        assertArrayEquals(expected, actual);

    }
}