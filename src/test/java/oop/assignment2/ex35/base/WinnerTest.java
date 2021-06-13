/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex35.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WinnerTest {

    @Test
    void winner_is_in_the_list_of_names() {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Homer");
        nameList.add("Bart");
        nameList.add("Maggie");
        nameList.add("Lisa");
        nameList.add("Moe");

        Winner winner = new Winner();

        boolean expected = true;
        boolean actual = false;
        for(int i = 0; i < nameList.size(); i++){
            if(nameList.get(i).equals(winner.setWinner(nameList))){
                actual = true;
            }
        }
        assertEquals(expected,actual);
    }
}