 /*
  * UCF COP 3330 Summer 2021 Assignment 2 Solution
  * Copyright 2021 Ivy Nguyen
  */

package oop.assignment2.ex24.base;

import java.util.Arrays;

public class AnagramDetector {

    private String word1;
    private String word2;

    public AnagramDetector(String word1, String word2){
        this.word1 = word1;
        this.word2 = word2;
    }

    private String sortString(String word){
        char[] tempArray = word.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }

    public boolean isAnagram(){
        if(word1.length() == word2.length()){
            return sortString(word1).equalsIgnoreCase(sortString(word2));
        }
        return false;
    }
}
