/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex33.base;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResponseTest {

    @Test
    void random_response_generates_one_of_four_outputs() {
        Response response = new Response();

        boolean expected =  true;
        boolean actual = response.randomResponse().equals("Yes") ||
                response.randomResponse().equals("No") ||
                response.randomResponse().equals("Maybe") ||
                response.randomResponse().equals("Ask Again Later") ;

        assertEquals(expected,actual);
    }
}