/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex37.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Password {
    private final int nLetters;
    private final int nSpecChar;
    private final int num;
    private int length;
    private static final int MAX_LENGTH = 14; //14 being max length for a strong password recommended by Microsoft
    private static final Random rand = new Random();
    private final List <Character> letterList = new ArrayList<>();
    private final List<Character> specCharList = new ArrayList<>();
    private final List<Character> numberList = new ArrayList<>();
    private final List <Character> password = new ArrayList<>();

    public Password(int length, int nSpecChar, int num) {

        while(true){
            int i = rand.nextInt(MAX_LENGTH) + nSpecChar + num;
            if(i + nSpecChar + num >= length){
                this.nLetters = i;
                break;
            }
        }
        this.nSpecChar = nSpecChar;
        this.num = num;
    }

    private void initializeLetters(){
        for(char i = 'a'; i <= 'z'; ++i){
           this.letterList.add(i);
        }
    }

    private void initializeSpecCharList(){
        for(char i = '!'; i <= '/'; ++i){
            this.specCharList.add(i);
        }
        for(char i = ':'; i <= '@'; ++i){
            this.specCharList.add(i);
        }
        for(char i = '['; i <= '`'; ++i){
            this.specCharList.add(i);
        }
        for(char i = '{'; i <= '~'; ++i){
            this.specCharList.add(i);
        }
    }

    private void initializeNumList(){
        for(char i = '0'; i <= '9'; ++i){
            this.numberList.add(i);
        }
    }

    private void initializeAllLists(){
        initializeLetters();
        initializeNumList();
        initializeSpecCharList();
    }

    private void shuffleAllLists(){
        Collections.shuffle(letterList);
        Collections.shuffle(specCharList);
        Collections.shuffle(numberList);
    }

    public List <Character> generatePasswords(){
        initializeAllLists();
        shuffleAllLists();

        this.password.addAll(numberList.subList(0, num));
        this.password.addAll(specCharList.subList(0, nSpecChar));
        this.password.addAll(letterList.subList(0, nLetters));

        Collections.shuffle(password);

        return password;
    }

}
