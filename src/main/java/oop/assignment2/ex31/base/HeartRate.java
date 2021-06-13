/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex31.base;

public class HeartRate {
    private int restingPulse;
    private int age;

    public boolean setAge(String age) {
        try{
            this.age = Integer.parseInt(age);
            return true;
        }catch(NumberFormatException ne){
            return false;
        }
    }

    public boolean setRestingPulse(String restingPulse){
        try{
            this.restingPulse = Integer.parseInt(restingPulse);
            return true;
        }catch(NumberFormatException ne){
            return false;
        }
    }

    public double targetHeartRate(double intensity){
        return Math.round((((220 - age) - restingPulse) * intensity) + restingPulse);
    }
}
