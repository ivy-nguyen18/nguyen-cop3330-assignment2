package oop.assignment2.ex37.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Password {
    private int length;
    private int nSpecChar;
    private int num;
    private static Random rand = new Random();
    private List <Character> letterList = new ArrayList<>();
    private List<Character> specCharList = new ArrayList<>();
    private List<Character> numberList = new ArrayList<>();
    //private List <Character> letterList = List.of('q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m');
    //private List <Character> specCharList = List.of('!','@','#','$','%','^','&','*','(', ',', ')','_','-','+','/',':','.','{','}','[',']','~','\\');
    //private List <Character> numberList = List.of('0','1','2','3','4','5','6','7','8','9');
    private char [] password;

    public Password(int length, int nSpecChar, int num) {
        this.length = length;
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

    public void printLists(){
        initializeAllLists();
        numberList.forEach(System.out::print);
        System.out.print("\n");
        specCharList.forEach(System.out::print);
        System.out.print("\n");
        letterList.forEach(System.out::print);
    }


}
