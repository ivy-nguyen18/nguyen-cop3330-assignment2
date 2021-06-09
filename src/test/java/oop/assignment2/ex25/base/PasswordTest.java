/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void password_validator_very_weak1() {
        //given
        Password password = new Password("12345");

        //when
        String expected = "very weak";
        String actual = password.passwordValidator();

        //then
        assertEquals(expected,actual);
    }

    @Test
    void  password_validator_very_weak2() {
        //given
        Password password = new Password("1234567");

        //when
        String expected = "very weak";
        String actual = password.passwordValidator();

        //then
        assertEquals(expected,actual);
    }

    @Test
    void password_validator_weak1() {
        //given
        Password password = new Password("abcdef");

        //when
        String expected = "weak";
        String actual = password.passwordValidator();

        //then
        assertEquals(expected,actual);
    }

    @Test
    void password_validator_weak2() {
        //given
        Password password = new Password("ABC");

        //when
        String expected = "weak";
        String actual = password.passwordValidator();

        //then
        assertEquals(expected,actual);
    }

    @Test
    void password_validator_strong_password1() {
        //given
        Password password = new Password("abc123xyz");

        //when
        String expected = "strong";
        String actual = password.passwordValidator();

        //then
        assertEquals(expected,actual);
    }

    @Test
    void password_validator_strong_password2() {
        //given
        Password password = new Password("123ABCxyz");

        //when
        String expected = "strong";
        String actual = password.passwordValidator();

        //then
        assertEquals(expected,actual);
    }

    @Test
    void password_validator_very_strong_password1() {
        //given
        Password password = new Password("1337h@xor!");

        //when
        String expected = "very strong";
        String actual = password.passwordValidator();

        //then
        assertEquals(expected,actual);
    }

    @Test
    void password_validator_very_strong_password2() {
        //given
        Password password = new Password("ABC123!@#!");

        //when
        String expected = "very strong";
        String actual = password.passwordValidator();

        //then
        assertEquals(expected,actual);
    }
}