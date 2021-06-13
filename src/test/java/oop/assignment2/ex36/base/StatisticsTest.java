/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    @Test
    void getAverage_returns_correct_Average() {
        ArrayList<Double> numberList = new ArrayList<>();
        numberList.add(100.0);
        numberList.add(200.0);
        numberList.add(1000.0);
        numberList.add(300.0);

        Statistics stats = new Statistics(numberList);

        double expected = 400.0;
        double actual = stats.getAverage();

        assertEquals(expected, actual);
    }

    @Test
    void getMin_returns_correct_Min() {
        ArrayList<Double> numberList = new ArrayList<>();
        numberList.add(100.0);
        numberList.add(200.0);
        numberList.add(1000.0);
        numberList.add(300.0);

        Statistics stats = new Statistics(numberList);

        double expected = 100.0;
        double actual = stats.getMin();

        assertEquals(expected, actual);
    }

    @Test
    void getMax_returns_correct_Max() {
        ArrayList<Double> numberList = new ArrayList<>();
        numberList.add(100.0);
        numberList.add(200.0);
        numberList.add(1000.0);
        numberList.add(300.0);

        Statistics stats = new Statistics(numberList);

        double expected = 1000.0;
        double actual = stats.getMax();

        assertEquals(expected, actual);
    }

    @Test
    void getStdev_returns_correct_stdev() {
        ArrayList<Double> numberList = new ArrayList<>();
        numberList.add(100.0);
        numberList.add(200.0);
        numberList.add(1000.0);
        numberList.add(300.0);

        Statistics stats = new Statistics(numberList);

        double expected = 353.55;
        double actual = stats.getStdev();
        double epsilon =.01;

        assertEquals(expected,actual,epsilon);
    }
}