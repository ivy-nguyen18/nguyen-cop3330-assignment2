package oop.assignment2.ex37.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Password {
    private int nLetters;
    private int nSpecChar;
    private int num;
    private int length;
    private static final int MAX_LENGTH = 14; //14 being max length for a strong password recommended by Microsoft
    private static Random rand = new Random();
    private List <Character> letterList = new ArrayList<>();
    private List<Character> specCharList = new ArrayList<>();
    private List<Character> numberList = new ArrayList<>();
    private List <Character> password = new ArrayList<>();

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
        List <Character> letterList = new ArrayList<>();
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

    public List <Character> generatePasswords(){
        initializeAllLists();

        Collections.shuffle(letterList);
        Collections.shuffle(specCharList);
        Collections.shuffle(numberList);

        this.password.addAll(numberList.subList(0, num));
        this.password.addAll(specCharList.subList(0, nSpecChar));
        this.password.addAll(letterList.subList(0, nLetters));

        Collections.shuffle(password);

        return password;
    }

}
