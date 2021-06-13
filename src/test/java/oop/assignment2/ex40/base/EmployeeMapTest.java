/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex40.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMapTest {

    @Test
    void searchInMap_returns_keys_of_names_that_contain_the_search_substring() {
        Map<String, Employee> employeeMap = new HashMap<>();
        EmployeeMap eMap = new EmployeeMap(employeeMap);

        List <String> actual = eMap.searchInMap("Jac");
        List <String> expected = List.of("Jackson", "Jacobson");

        assertEquals(expected, actual);

    }

    @Test
    void searchInMap_returns_keys_of_names_that_contain_the_search_substring2() {
        Map<String, Employee> employeeMap = new HashMap<>();
        EmployeeMap eMap = new EmployeeMap(employeeMap);

        List <String> actual = eMap.searchInMap("son");
        List <String> expected = List.of("Jackson", "Jacobson", "Johnson", "Michaelson");

        assertEquals(expected, actual);

    }
}