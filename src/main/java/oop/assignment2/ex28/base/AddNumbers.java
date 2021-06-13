package oop.assignment2.ex28.base;

import java.util.List;

public class AddNumbers {
    public int addNumbers(List<Integer> addInt){
        int n = 0;
        for (Integer integer : addInt) {
            n += integer;
        }
        return n;
    }
}
