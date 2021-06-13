/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGameTest {

    @Test
    void checkNumber_is_lower_than_target_displays_loweroutput() {
        NumberGame nGame = new NumberGame();

        String expected = "Too low. Guess Again: ";
        String actual = nGame.checkNumber(1,3,5);

        assertEquals(expected,actual);
    }

    @Test
    void checkNumber_is_higher_than_target_displays_higheroutput() {
        NumberGame nGame = new NumberGame();

        String expected = "Too high. Guess Again: ";
        String actual = nGame.checkNumber(6,3,5);

        assertEquals(expected,actual);
    }

    @Test
    void checkNumber_is_same_as_target_displays_sameoutput() {
        NumberGame nGame = new NumberGame();

        String expected = String.format("You got it in %d guesses!", 3);
        String actual = nGame.checkNumber(5,3,5);

        assertEquals(expected,actual);
    }

    @Test
    void numberGameSetter_returns_level1_difficultyRange(){
        NumberGame nGame = new NumberGame();
        boolean expected = true;
        boolean actual = nGame.numberGameSetter(1) <= 10;
        assertEquals(expected,actual);
    }

    @Test
    void numberGameSetter_returns_level2_difficultyRange(){
        NumberGame nGame = new NumberGame();
        boolean expected = true;
        boolean actual = nGame.numberGameSetter(2) <= 100;
        assertEquals(expected,actual);
    }

    @Test
    void numberGameSetter_returns_level3_difficultyRange(){
        NumberGame nGame = new NumberGame();
        boolean expected = true;
        boolean actual = nGame.numberGameSetter(3) <= 1000;
        assertEquals(expected,actual);
    }
}