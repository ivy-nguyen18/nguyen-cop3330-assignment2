/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex31.base;

public class CreateTable {

    private HeartRate heartRate;

    public void createTable(HeartRate heartRate){
        System.out.println("Intensity | Rate");
        System.out.println("----------|-------");
        for(int i = 55; i <= 95; i += 5){
            System.out.printf("%d%%\t\t  | %d bpm\n", i, (int)heartRate.targetHeartRate(i/100.00));
        }
    }
}
