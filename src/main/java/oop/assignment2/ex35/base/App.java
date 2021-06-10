/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package oop.assignment2.ex35.base;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        while(true){
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            if(name.length() != 0){
                nameList.add(name);
            }
            if(name.length() == 0){
                Winner winner = new Winner();
                System.out.printf("The winner is...%s.", winner.setWinner(nameList));
                break;
            }
        }
    }

}
