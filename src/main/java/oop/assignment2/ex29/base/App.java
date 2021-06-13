/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex29.base;

import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Input in = new Input();
        while(true){
            System.out.print("What is the rate of return? ");
            if(!in.inputSetter(input.nextLine())){
                System.out.println("Sorry, that is not a valid input.");
                continue;
            }
            break;
        }

        System.out.printf("It will take %d years to double your initial investment.", in.yearsRateOfReturn());

    }

}
