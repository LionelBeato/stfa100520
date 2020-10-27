package com.wozu.stfa.day12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TDDExampleTest {

    // this is part of our setup for tdd
    TDDExample tddExample;

    // setup method that instatiates TDDExample
    @BeforeEach
    public void setUp(){
        tddExample = new TDDExample();
    }

    // testing the return value of addOne()
    // method name could be more explicit
    @Test
    public void testCount(){
        int expected = 5;
        int actual = tddExample.addOne();
        assertEquals(expected, actual);
    }

}