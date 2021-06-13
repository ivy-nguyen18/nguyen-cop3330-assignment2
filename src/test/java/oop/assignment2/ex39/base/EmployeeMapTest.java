/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex39.base;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMapTest {

    @Test
    void keys_are_sorted_in_alphabetic_order() {
        Map<String, Employee> employeeMap = new HashMap<>();
        EmployeeMap eMap = new EmployeeMap(employeeMap);

        ArrayList<String> actual = eMap.sortByKey();
        ArrayList<String> expected = new ArrayList<>();

        expected.add("Jackson");
        expected.add("Jacobson");
        expected.add("Johnson");
        expected.add("Michaelson");
        expected.add("Webber");
        expected.add("Xiong");

        expected.sort(Comparator.naturalOrder());

        assertEquals(expected, actual);

    }
}