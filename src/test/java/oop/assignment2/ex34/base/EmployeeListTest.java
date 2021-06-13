/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    void remove_employee_and_display_new_number_of_employees() {
        List<String> list = new ArrayList<>(List.of(
                "John Smith",
                "Jackie Johnson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"));

        EmployeeList employeeList = new EmployeeList(list);

        employeeList.removeEmployee("John Smith");

        int expected = 4;
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    void remove_employee_and_should_return_true() {
        List<String> list = new ArrayList<>(List.of(
                "John Smith",
                "Jackie Johnson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"));

        EmployeeList employeeList = new EmployeeList(list);

        boolean actual = employeeList.removeEmployee("John Smith");
        boolean expected = true;

        assertEquals(expected, actual);
    }

}