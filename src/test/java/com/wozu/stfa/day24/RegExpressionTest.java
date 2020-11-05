package com.wozu.stfa.day24;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegExpressionTest {

    // simple

    @Test
    void simpleTest() {
        Pattern pattern = Pattern.compile("hello");
        Matcher matcher = pattern.matcher("hello");
        assertTrue(matcher.find());
    }

    // abstraction

    public static int runTest(String regex, String text){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int matches = 0;

        while(matcher.find()){
            matches++;
        }
        return matches;
    }

    @Test
    void testRunTest(){
        int matches = runTest("hello","hellohellohello");
        System.out.println(matches);
        assertTrue(matches > 0);
    }

    @Test
    void metaTest(){
        int matches = runTest(".", "hello");
        System.out.println(matches);
        assertTrue(matches > 0);
    }

    @Test
    void secondMetaTest(){
        int matches = runTest("hello.", "hellohellohellohello");
        System.out.println(matches);
        assertTrue(matches > 0);
    }

    // or class

    @Test
    void setTest(){
        int matches = runTest("[abc]", "b");
        assertEquals(matches, 1);
    }

    @Test
    void setNoOrderTest(){
        // the order of the set doesnt matter
        int matches = runTest("[cab]", "abc");
        assertEquals(3, matches);
    }

    // nor

    @Test
    void norTest(){
        int matches = runTest("g[^abc]ad","glad");
        System.out.println(matches);
        assertTrue(matches > 0);
    }

    // range

    // union

    // intersection

    // subtraction

    // predefined character classes

    // boundaries

    // study

    // replacement

}
