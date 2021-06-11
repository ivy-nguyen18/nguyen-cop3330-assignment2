/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex36.base;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Double> numberList = new ArrayList<>();
        while(true){
            System.out.print("Enter a number: ");
            String number = input.nextLine();
            if(number.equalsIgnoreCase("done")){
                break;
            }
            try{
                numberList.add(Double.parseDouble(number));
            }catch (NumberFormatException ne){
                continue;
            }
        }
        Statistics stats = new Statistics(numberList);
        stats.displayList();
        System.out.printf("\nThe average is %.2f", stats.getAverage());
        System.out.printf("\nThe minimum is %.2f", stats.getMin());
        System.out.printf("\nThe maximum is %.2f", stats.getMax());
        System.out.printf("\nThe standard deviation is %.2f", stats.getStdev());
    }
}
