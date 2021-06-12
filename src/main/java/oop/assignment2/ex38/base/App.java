package oop.assignment2.ex38.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */

import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = input.nextLine();
        FilterValues newValues = new FilterValues(numbers);
        printArray(newValues);
    }

    private static void printArray(FilterValues newValues) {
        int [] newArray = newValues.filterEvenNumbers();
        StringBuilder output = new StringBuilder();

        for (int i : newArray) {
           output.append(String.format(" %d", i));
        }

        System.out.print("The even numbers are" + output + ".");

    }


}
