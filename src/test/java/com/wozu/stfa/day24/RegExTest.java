package com.wozu.stfa.day24;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.assertTrue;

public class RegExTest {

    @Test
    void test(){

        // Object that describes a regex pattern
        Pattern p = Pattern.compile("a\\wimal");
        // Object that allows us to match against a given string
        Matcher matcher = p.matcher("animal");
        // since "a" and "a" are exactly the same, this should print out true!
        System.out.println(matcher.matches());

        Pattern dogPattern = Pattern.compile("(q[a]k) ()");

        Matcher dogMatcher = dogPattern.matcher("The quick brown fox jumps over the lazy dog.");

//        System.out.println(dogMatcher.find());
        int matches = 0;
        while (dogMatcher.find()){
//            System.out.println(dogMatcher.);
            matches++;
        }

        System.out.println(matches);
    }

    public static int runTest(String regex, String text){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int matches = 0;

        while (matcher.find()){
            matches++;
        }
        return matches;
    }


    @Test
    void simpleRegEx(){
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foo");
        assertTrue(matcher.find());
    }

    @Test
    void testRunTest(){
        int matches = runTest("foo", "foofoo");
        System.out.println(matches);
        assertTrue(matches > 0);
    }

    // simple

    // abstraction

    // or

    // nor

    // range

    // union

    // intersection

    // subtraction

    // predefined character classes

    // boundaries

    // study

    // replacement




}
