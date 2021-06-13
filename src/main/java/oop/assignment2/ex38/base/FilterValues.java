/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex38.base;

import java.util.ArrayList;

public class FilterValues {
    private String numbers;

    public FilterValues( String numbers){
        this.numbers = numbers;
    }

    private int[] getIntArray(){
        String [] numString = numbers.split(" ");
        int[] numArray = new int[numString.length];
        for(int i = 0; i < numArray.length; i++){
            try{
                numArray[i] = Integer.parseInt(numString[i]);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return numArray;
    }

    public int[] filterEvenNumbers(){
        int[] oldArray = getIntArray();
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i : oldArray) {
            if (i % 2 == 0) {
                newArray.add(i);
            }
        }
        return newArray.stream().mapToInt(i -> i).toArray();
    }
}
