/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex25.base;

public class Password {
    private String password;

    public Password(String password){
        this.password = password;
    }

    private boolean isInt(){
        return password.chars().allMatch(Character::isDigit);
    }

    private boolean isLetters(){
        return password.chars().allMatch(Character::isLetter);
    }

    private boolean isLettersAndInt(){
        return password.chars().allMatch(Character::isLetterOrDigit);
    }

    public String passwordValidator(){
        if(isInt() && password.length() < 8){
            //it is all integers
            return "very weak";
        }else if(isLetters() && password.length() < 8){
            //is all letters
            return "weak";
        }else if(isLettersAndInt() && password.length() >= 8){
            //letters and digits
            return "strong";
        }else{
            //letters numbers and special characters
            return "very strong";
        }
    }
}
