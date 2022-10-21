package com.crm.step_definitions;

import com.crm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("before scenario is running");
    }

    @After
    public void tearDownScenario(Scenario scenario)  {

        if (scenario.isFailed()){
            byte [] screenshot = ( (TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Driver.closeDriver();
    }

}
