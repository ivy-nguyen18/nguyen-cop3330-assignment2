/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex36.base;

import java.util.ArrayList;
import java.util.Collections;

public class Statistics {
    private ArrayList<Double> numberList;

    public Statistics(ArrayList<Double> numberList){
        this.numberList = numberList;
    }

    public void displayList(){
        numberList.forEach(numberList -> System.out.print(numberList + ", "));
    }

    public double getAverage(){
        double total = 0;
        for (Double aDouble : numberList) {
            total += aDouble;
        }
        return total/numberList.size();
    }

    public double getMin(){
        return Collections.min(numberList);
    }

    public double getMax(){
        return Collections.max(numberList);
    }

    public double getStdev(){
        double mean = getAverage();
        double sum = 0;
        for (Double aDouble : numberList) {
            sum += Math.pow((aDouble - mean), 2);
        }

        return Math.sqrt( sum / numberList.size() );
    }
}
