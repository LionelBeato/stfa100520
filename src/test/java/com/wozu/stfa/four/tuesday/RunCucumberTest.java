package com.wozu.stfa.four.tuesday;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})
//features points to the file path for our test scenario
//plugin makes the output pretty ✨
@CucumberOptions(features = "src/test/resources/Feature", plugin = {"pretty"})
public class RunCucumberTest {
}
