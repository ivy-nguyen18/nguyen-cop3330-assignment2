/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex29.base;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("What is the rate of return? ");
        while(!input.hasNextInt() || input.hasNext("0")){
            System.out.println("Sorry, that is not a valid input.");
            input.next();
            System.out.print("What is the rate of return? ");
        }

        int rateReturn = input.nextInt();

        System.out.printf("It will take %d years to double your initial investment.", yearsRateOfReturn(rateReturn));


    }

    public static int yearsRateOfReturn(int rate){
        return 72 / rate;
    }
}
