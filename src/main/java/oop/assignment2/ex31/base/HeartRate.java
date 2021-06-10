/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex31.base;

public class HeartRate {
    private int restingPulse;
    private int age;

    public HeartRate(int restingPulse, int age) {
        this.age = age;
        this.restingPulse = restingPulse;
    }

    public double targetHeartRate(double intensity){
        return Math.round((((220 - age) - restingPulse) * intensity) + restingPulse);
    }
}
