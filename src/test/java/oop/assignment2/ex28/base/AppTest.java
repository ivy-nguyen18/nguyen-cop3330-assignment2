package oop.assignment2.ex28.base;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void add_numbers_return_total1() {
        List<Integer> list = List.of(1,2,3,4,5);
        AddNumbers total = new AddNumbers();

        int expected = 15;
        int actual  = total.addNumbers(list);

        assertEquals(expected,actual);
    }

    @Test
    void add_numbers_return_total2() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        AddNumbers total = new AddNumbers();

        int expected = 55;
        int actual  = total.addNumbers(list);

        assertEquals(expected,actual);
    }
}