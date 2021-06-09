/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex25.base;

import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter password: ");
        String password = input.nextLine();

        Password passStrength = new Password(password);

        System.out.println("The password " + "'" + password +"'" +" is a " + passStrength.passwordValidator() +" password.");

    }
}
