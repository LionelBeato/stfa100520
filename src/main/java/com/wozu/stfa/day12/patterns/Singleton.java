package com.wozu.stfa.day12.patterns;

public class Singleton {

    private Singleton(){

    }

    public static Singleton getInstance() {
        return new Singleton();
    }


}
