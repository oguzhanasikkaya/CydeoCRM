package com.crm.runner;


import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html" ,
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/crm/step_definitions",
        dryRun = false,

        tags = "@AZLC-1421"
)

public class CukesRunner {


}

