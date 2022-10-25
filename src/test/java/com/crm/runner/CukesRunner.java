package com.crm.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/crm/step_definitions",
        dryRun = false,
        plugin = {
                "html:target/cucumber-reports.html" ,
                "json:target/cucumber.json"
        },
        tags = "@hr or @marketing"
)

public class CukesRunner {
}

