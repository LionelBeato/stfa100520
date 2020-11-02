package com.wozu.stfa.day17.features;

import com.wozu.stfa.day17.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoveMeSteps {

    Integer petal;
    String actual;

    @Given("petal is odd")
    public void petalIsOdd(){
       petal = 1;
    }

    @Given("petal is even")
    public void petalIsEven() {
        petal = 2;
    }

    @When("I pluck the petal")
    public void iPluckThePetal(){
        actual = Utility.pluckPetal(petal);
    }

    @Then("I should say {string}")
    public void iShouldSay(String expected){
        assertEquals(expected, actual);
    }

}
