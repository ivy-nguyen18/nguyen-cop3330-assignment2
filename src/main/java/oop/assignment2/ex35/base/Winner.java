/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex35.base;

import java.util.ArrayList;
import java.util.Random;

public class Winner {
    private ArrayList<String> nameList;
    private static final Random rand = new Random();

    public String setWinner(ArrayList<String> arrayList){
        this.nameList = arrayList;
        return getWinner();
    }

    private String getWinner() {
        int n = rand.nextInt(nameList.size());
        return nameList.get(n);
    }
}
