package com.wozu.stfa.four.tuesday.features;

import io.cucumber.java8.En;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdSteps implements En{

    Boolean isMorning;
    String expected;

    // this method doesn't work because lambdas in java are stupid lol
//    public BirdSteps() {
//
//
//        Given("^that it is morning$", () -> {
//            isMorning = true;
//        });
//
//        When("I listen for a bird", () -> {
//           expected = "a beautiful song";
//        });
//
//        Then("I should hear {string}", (string) -> {
//            assertEquals(expected, string);
//        });
//
//
//    }




}
