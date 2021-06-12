package oop.assignment2.ex37.base;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What's the minimum length? ");
        int length = input.nextInt();
        System.out.print("How many special characters? ");
        int specChar = input.nextInt();
        System.out.print("How many numbers? ");
        int num = input.nextInt();

        Password requirements = new Password(length, specChar, num);

        requirements.printLists();
    }
}
