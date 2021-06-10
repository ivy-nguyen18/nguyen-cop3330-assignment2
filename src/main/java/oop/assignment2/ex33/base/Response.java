/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex33.base;

import java.util.List;
import java.util.Random;

public class Response {

    public String randomResponse(){
        Random rand = new Random();
        int n = rand.nextInt(4);
        List<String> responses = List.of("Yes", "No", "Maybe", "Ask Again Later");
        return responses.get(n);
    }
}
