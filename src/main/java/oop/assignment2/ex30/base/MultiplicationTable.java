/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex30.base;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {
    public void createTable(){
        List<Integer> mList;
        for(int i = 1; i <= 12; i++){
            mList = multiply(i,12);
            mList.forEach(x -> System.out.printf("%5d",x));
            System.out.print("\n");
        }
    }
    public List<Integer> multiply(int factor, int end){
        ArrayList <Integer> mList = new ArrayList<>();
        for(int i = 1; i <= end; i++){
            mList.add(i * factor);
        }
        return mList;
    }
}
