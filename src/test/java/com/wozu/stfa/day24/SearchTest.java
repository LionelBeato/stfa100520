package com.wozu.stfa.day24;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchTest {


    WebDriver driver;



    @Given("{string} is in the searchbox")
    public void searchingFor(String string) {

        System.setProperty("webdriver.chrome.driver", "/opt/WebDriver/bin/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.name("q"))
                .sendKeys("Paul Hollywood");
    }
    @When("I press the search button")
    public void i_press_the_search_button() {

        driver.findElement(By.name("btnK"))
                .click();

    }

    @Then("send me to the the search results page")
    public void send_me_to_the_the_search_results_page() {


        assertThat("Paul Hollywood - Google Search", equalTo(driver.getTitle()));


    }



}
