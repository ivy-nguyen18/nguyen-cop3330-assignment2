package oop.assignment2.ex30.base;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        for(int i = 1; i <= 12; i++){
            for(int j = 1; j <= 12; j++){
                System.out.printf("%5d", i*j);
            }
            System.out.print("\n");
        }
    }
}
