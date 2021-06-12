/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex39.base;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<String, Employee> employeeMap = new HashMap<>();
        EmployeeMap employeeNMap = new EmployeeMap(employeeMap);
        employeeNMap.printSortedMap(employeeMap);
    }
}
