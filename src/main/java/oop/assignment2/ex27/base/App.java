/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex27.base;

import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();


        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();


        System.out.print("Enter the ZIP code: ");
        String zipCode = input.nextLine();

        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();

        Inputs input = new Inputs(firstName, lastName, zipCode, employeeID);

        System.out.println(input.validateInput());

    }
}
