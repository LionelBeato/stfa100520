package com.wozu.stfa.day12;

public class TDDExample {

    int count = 4;

    // this method is intended to add to count by 1
    public int addOne(){
        // through TDD we found that preincrements
        // return the expected value
        return ++count;
    }



}
