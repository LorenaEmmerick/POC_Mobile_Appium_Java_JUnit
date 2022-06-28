package com.CIandT.appium.steps;

import com.CIandT.appium.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;

import static com.CIandT.appium.utils.Utils.getDriver;

public class BaseStep {
    @Before
    public void setup() throws MalformedURLException {Utils.init();}


/*    @After
    public void tearDown(Scenario scenario)throws IllegalMonitorStateException{
        if(scenario.isFailed())
        {
            Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
            Utils.quit();
        }
        Utils.quit();
    }*/

}
