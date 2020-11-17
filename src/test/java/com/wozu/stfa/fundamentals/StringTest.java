package com.wozu.stfa.fundamentals;

import org.junit.jupiter.api.Test;

public class StringTest {


    @Test
    void testString(){
        // below is how you would declare your string
        // strings are also immutable
        String myString = "this is a string";
        // below is legal but not best practice
        String constructString = new String("hello");
        System.out.println(myString);
        System.out.println("hello there, this is a literal string");
    }

}
