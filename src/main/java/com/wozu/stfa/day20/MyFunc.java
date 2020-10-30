package com.wozu.stfa.day20;

// this interface follows the pattern
// of having a single abstract method (SAM)
@FunctionalInterface
public interface MyFunc {
    int sum(int a, int b);

    default int returnFive(){
        return 5;
    }

    static void printHello(){
        System.out.println("Hello!");
    }

}
