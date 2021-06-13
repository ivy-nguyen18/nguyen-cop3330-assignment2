/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex28.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> addInt = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            addInt.add(input.nextInt());
        }

        AddNumbers total = new AddNumbers();
        System.out.printf("The total is %d", total.addNumbers(addInt));
    }
}
