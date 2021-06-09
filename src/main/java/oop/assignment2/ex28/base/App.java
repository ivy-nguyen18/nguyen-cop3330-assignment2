/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex28.base;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        for(int i = 1; i <= 5; i++){
            System.out.print("Enter a number: ");
            n += input.nextInt();
        }
        System.out.printf("The total is %d", n);
    }
}
