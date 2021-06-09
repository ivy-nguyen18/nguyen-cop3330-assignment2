/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex26.base;

import oop.assignment2.ex26.base.CreditCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void calculate_months_until_paid_off_returns_correct_number1() {
        CreditCard creditCard = new CreditCard(5000, .12, 100);

        int expected = 70;
        int actual = creditCard.calculateMonthsUntilPaidOff();

        assertEquals(expected, actual);
    }

    @Test
    void calculate_months_until_paid_off_returns_correct_number2() {
        CreditCard creditCard = new CreditCard(10000, .15, 500.756);

        int expected = 24;
        int actual = creditCard.calculateMonthsUntilPaidOff();

        assertEquals(expected, actual);
    }


}