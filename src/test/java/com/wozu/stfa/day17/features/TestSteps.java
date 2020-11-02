package com.wozu.stfa.day17.features;

import io.cucumber.java.en.Given;

public class TestSteps {

    @Given("that I like pies")
    public void thatILikePies(){
        System.out.println("Guys, I love me some pie!");
    }

}
