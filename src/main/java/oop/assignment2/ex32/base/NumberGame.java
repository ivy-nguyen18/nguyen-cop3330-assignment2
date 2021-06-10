package oop.assignment2.ex32.base;

import java.util.Random;

public class NumberGame {
    private int difficulty;
    private int target;

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
        this.target = num;
        return num;
    }

    public String checkNumber(int n, int guesses){
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
