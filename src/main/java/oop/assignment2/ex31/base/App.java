/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex31.base;

import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String restingPulse;
        String age;
        HeartRate heartRate = new HeartRate();

        while(true){
            System.out.print("Resting Pulse: ");
            restingPulse = input.nextLine();
            if(!heartRate.setRestingPulse(restingPulse)){
                continue;
            }
            break;
        }

        while(true){
            System.out.print("Age: ");
            age = input.nextLine();
            if(!heartRate.setAge(age)){
                continue;
            }
            break;
        }
        CreateTable table = new CreateTable();

        table.createTable(heartRate);
    }
}
