/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex34.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> employeeNames = new ArrayList<>(List.of(
                "John Smith",
                "Jackie Johnson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"));

        EmployeeList employeeList = new EmployeeList(employeeNames);

        employeeList.displayEmployees();

        System.out.print("Enter an employee name to remove: ");
        String remove = input.nextLine();
        employeeList.removeEmployee(remove);

        employeeList.displayEmployees();
    }

}
