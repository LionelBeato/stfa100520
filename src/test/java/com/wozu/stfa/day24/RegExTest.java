package com.wozu.stfa.day24;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

    @Test
    void test(){

        // Object that describes a regex pattern
        Pattern p = Pattern.compile("a\\wimal");
        // Object that allows us to match against a given string
        Matcher matcher = p.matcher("animal");
        // since "a" and "a" are exactly the same, this should print out true!
        System.out.println(matcher.matches());

        Pattern dogPattern = Pattern.compile("dog");

        Matcher dogMatcher = dogPattern.matcher("The quick brown fox jumps over the lazy dog.");

//        System.out.println(dogMatcher.find());
        int matches = 0;
        while (dogMatcher.find()){
            matches++;
        }

        System.out.println(matches);
    }

}
