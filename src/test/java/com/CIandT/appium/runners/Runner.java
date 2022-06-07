package com.CIandT.appium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = "src/test/java/com/CIandT/appium/features",
        glue = "com/CIandT/appium/steps",
        tags = "@CadastroSuite",
        monochrome = true,
        publish = false,
        plugin = {
                "pretty",
                "summary",
                "json:target/cumcumber/cucumber-report.json",
                "html:target/cumcumber/cucumber-html-report.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)
public class Runner {
}
