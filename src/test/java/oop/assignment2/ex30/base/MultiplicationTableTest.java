/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex30.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {

    @Test
    void multiply_returns_appropriate_product_list1() {
        MultiplicationTable mList = new MultiplicationTable();

        List<Integer> expected = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer> actual = mList.multiply(1,12);

        assertEquals(expected, actual);
    }

    @Test
    void multiply_returns_appropriate_product_list2() {
        MultiplicationTable mList = new MultiplicationTable();

        List<Integer> expected = List.of(2,4,6,8,10,12,14,16,18,20,22,24);
        List<Integer> actual = mList.multiply(2,12);

        assertEquals(expected, actual);
    }
}