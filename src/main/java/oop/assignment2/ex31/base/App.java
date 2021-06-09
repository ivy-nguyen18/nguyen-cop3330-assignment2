package oop.assignment2.ex31.base;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Resting Pulse: ");
        int restingPulse = input.nextInt();

        System.out.print("Age: ");
        int age = input.nextInt();

        HeartRate heartRate = new HeartRate(restingPulse,age);
        CreateTable table = new CreateTable();

        table.createTable(heartRate);
    }
}
