package oop.assignment2.ex40.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Employee> employeeMap = new HashMap<>();
        EmployeeMap employeeNMap = new EmployeeMap(employeeMap);
        System.out.print("Enter a search string: ");
        String search = input.nextLine();
        employeeNMap.printSearchMap(employeeMap, search);
    }
}