/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex32.base;

import java.util.Random;

public class NumberGame {
    private int difficulty;

    public int numberGameSetter(int difficulty) {
        this.difficulty = difficulty;
        return chooseDiffiulty();
    }

    private int chooseDiffiulty(){
        Random rand = new Random();
        int num;
        if(difficulty == 1){
            num = rand.nextInt(10) + 1;
        }else if (difficulty == 2){
            num = rand.nextInt(100) + 1;
        }else{
            num = rand.nextInt(1000) + 1;
        }
        return num;
    }

    public String checkNumber(int n, int guesses, int target){
        if(n < target ){
            return "Too low. Guess Again: ";
        }else if( n > target){
            return  "Too high. Guess Again: ";
        }
        else {
            return String.format("You got it in %d guesses!", guesses);
        }
    }


}
