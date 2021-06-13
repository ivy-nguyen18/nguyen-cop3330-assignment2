/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex26.base;

import java.util.Scanner;

public class App {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("What is your balance? ");
        double balance = input.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = input.nextDouble() / 100.00;

        System.out.print("What is the monthly payment you can make? ");
        double monthlyPayment = input.nextDouble();

        CreditCard creditCard = new CreditCard(balance, apr, monthlyPayment);

        System.out.printf("It will take you %d months to pay off this card.", creditCard.monthsUntilPaidOff());

    }
}
