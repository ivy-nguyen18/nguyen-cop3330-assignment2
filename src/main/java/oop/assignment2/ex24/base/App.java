 /*
  * UCF COP 3330 Summer 2021 Assignment 2 Solution
  * Copyright 2021 Ivy Nguyen
  */

package oop.assignment2.ex24.base;

import java.util.Scanner;

public class App {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first string: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String word2 = input.nextLine();

        AnagramDetector anagramDetector = new AnagramDetector(word1, word2);

        if(anagramDetector.isAnagram()){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", word1, word2);
        }else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", word1, word2);
        }



    }
}
