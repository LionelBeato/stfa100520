package com.wozu.stfa.day21;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelTest {

    WebDriver driver;
    String expected;
    String actual;

    @BeforeEach
    void setUp(){
        // this is needed if the PATH isn't explicitly defined
        // my environment has the driver installed as a native package
        System.setProperty("webdriver.chrome.driver", "/opt/WebDriver/bin/chromedriver");
//        driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
        driver = new ChromeDriver();


//        expected = "https://www.google.com/";
        driver.get("https://www.google.com/");

    }

    @Test
    void test(){
        assertThat(driver.getCurrentUrl(), equalTo(expected));
    }

    @Test
    void testElement(){
        WebElement aboutAnchorTag = driver.findElement( By.tagName("a"));
        expected = "About";
        actual = aboutAnchorTag.getText();
        assertThat(actual, equalTo(expected));
    }

    @Test
    void testForward(){
        driver.get("https://nba.com/");
        driver.navigate().back();
        driver.navigate().forward();
        assertThat("The official " +
                "site of the NBA for the latest " +
                "NBA Scores, Stats & News. " +
                "| NBA.com", equalTo(driver.getTitle()));
    }

    @Test
    void testAllAnchors(){
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        assertThat(anchors.size(), equalTo(22));
    }

    @Test
    void testPrintAllAnchors(){
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        anchors.forEach(anchor -> System.out.println(anchor.getText()));
    }

    @Test
    void testHasItemsAnchors(){
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        List<String> anchorContents = new ArrayList<>();
        anchors.forEach(anchor -> anchorContents.add(anchor.getText()));
        assertThat(anchorContents, hasItems("About", "Privacy", "Terms"));
    }

    @Test
    void testAboutUrl(){
        WebElement anchor = driver.findElement(By.tagName("a"));
        anchor.click();
        assertThat(driver.getCurrentUrl(), equalTo("https://about.google/" +
                "?fg=1&utm_source=google-US&" +
                "utm_medium=referral&utm_campaign=hp-header"));

    }

    @Test
    void testSearchBar(){
        driver.findElement(By.name("q")).sendKeys("Power Rangers", Keys.ENTER);
//        driver.findElement(By.name("btnK")).click();
        assertThat(driver.getTitle(), equalTo("Power Rangers - Google Search"));

    }



    @AfterEach
    void tearDown(){
        driver.close();
    }





}
