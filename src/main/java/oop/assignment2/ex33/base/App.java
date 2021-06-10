/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex33.base;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What's your question?");
        String question = input.nextLine();

        Response response = new Response();
        System.out.println(response.randomResponse());
    }
}
