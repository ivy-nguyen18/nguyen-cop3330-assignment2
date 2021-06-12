package oop.assignment2.ex39.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Map<String, Employee> employeeMap = new HashMap<>();
        EmployeeMap employeeNMap = new EmployeeMap(employeeMap);
        employeeNMap.printSortedMap(employeeMap);
    }
}
