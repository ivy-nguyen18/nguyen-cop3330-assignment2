/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex34.base;

import java.util.List;

public class EmployeeList {
    private List<String> employees;

    public EmployeeList(List<String> employees){
        this.employees = employees;
    }

    public boolean removeEmployee(String remove){
        return employees.remove(remove);
    }

    public void displayEmployees(){
        System.out.printf("There are %d employees:\n", employees.size());
        employees.forEach(System.out::println);
    }
}
