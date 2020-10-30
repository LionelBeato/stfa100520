package com.wozu.stfa.day20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Hello {
    public static String SayHello(String hello) {
        return hello;

    }
}

class FunctionalTest {

    Functional addFunctional;
    Functional multFunctional;


    void funcAndPrint(Functional functional){
        System.out.println(functional);
    }

    @BeforeEach
    void setUp(){
        addFunctional = (a,b) -> a+b;
        multFunctional = (a,b) -> (a*2)+(b*2);
        System.out.println();
    }

    @Test
    void  testFunc(){
        int x =addFunctional.function(3, 6);
        System.out.println(x);
    }

}