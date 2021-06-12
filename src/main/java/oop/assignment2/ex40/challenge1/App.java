/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex40.challenge1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Employee> employeeMap = new HashMap<>();
        EmployeeMap employeeNMap = new EmployeeMap(employeeMap);
        System.out.print("Enter a search string: ");
        String search = input.nextLine().toLowerCase();
        employeeNMap.printSearchMap(employeeMap, search);
    }
}