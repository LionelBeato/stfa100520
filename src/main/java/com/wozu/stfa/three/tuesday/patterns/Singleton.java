package com.wozu.stfa.three.tuesday.patterns;

public class Singleton {

    private Singleton(){

    }

    public static Singleton getInstance() {
        return new Singleton();
    }


}
