package com.wozu.stfa.day24;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/day24",
        plugin = {"pretty",
                "html:target/reports/htmlReports.html",
                "json:target/reports/jsonReports.json"})
public class CucumberRunner {
}
