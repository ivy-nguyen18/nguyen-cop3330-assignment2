/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package oop.assignment2.ex32.base;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);
    private static int guess;

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        int difficulty;

        do{
            try{
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                String in = input.nextLine();
                difficulty = Integer.parseInt(in);
            }catch(NumberFormatException ne){
                continue;
            }
            NumberGame numberGame = new NumberGame();
            int target = numberGame.numberGameSetter(difficulty);
            guessInput(numberGame, target);
            System.out.println("Do you with to play again (Y/N)? ");
            String in = input.nextLine();
            if(in.equalsIgnoreCase("n")){
                break;
            }
            guess = 0;
        }while(true);
    }

    public static void guessInput(NumberGame numberGame, int target){
        int number = 0;
        System.out.print("I have my number. What's your guess? ");
        do {
            try{
                String in = input.nextLine();
                number = Integer.parseInt(in);
            }catch(NumberFormatException ne){
                ++guess;
                System.out.print("Guess again: ");
            }
            ++guess;
            System.out.print(numberGame.checkNumber(number, guess, target));
        }while(number != target);
    }
}
