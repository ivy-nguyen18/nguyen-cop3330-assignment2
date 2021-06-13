package oop.assignment2.ex37.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {
    private final List <Character> specCharList = List.of('!','@','#','$','%','&','`','*','(', ')','\'','+','-','.','/',':',';','<','=','>','?','[',']','^','_','\"','{','|','}',',', '~', '\\');
    private final List <Character> letterList = List.of('q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m');
    private final List <Character> numberList = List.of('0','1','2','3','4','5','6','7','8','9');

    @Test
    void generatePasswords_fits_the_given_length() {
        Password password = new Password(8, 2 ,2);

        List <Character> list = password.generatePasswords();

        boolean expected = true;
        boolean actual = list.size() >= 8;

        assertEquals(expected,actual);
    }

    @Test
    void generatePasswords_fits_the_given_nSpecChar() {
        Password password = new Password(8, 2 ,2);

        List <Character> list = password.generatePasswords();

        list.retainAll(specCharList);

        boolean expected = true;
        boolean actual = list.size() == 2;

        assertEquals(expected,actual);
    }

    @Test
    void generatePasswords_fits_the_given_num() {
        Password password = new Password(8, 2 ,2);

        List <Character> list = password.generatePasswords();

        list.retainAll(numberList);

        boolean expected = true;
        boolean actual = list.size() == 2;

        assertEquals(expected,actual);
    }

    @Test
    void generatePasswords_letters_should_be_more_than_nSpecChar_and_num_sum() {
        Password password = new Password(8, 2 ,2);

        List <Character> list = password.generatePasswords();

        list.retainAll(letterList);

        boolean expected = true;
        boolean actual = list.size() >= 4;

        assertEquals(expected,actual);
    }
}