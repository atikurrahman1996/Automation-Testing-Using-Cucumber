package Cucumber;


import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Training\\PeopleNTech\\BITM Online 6\\AutomationProject\\TestAutomationBITM06\\src\\main\\java\\com\\Cucumber",
                 glue = {"com.Cucumber.LoginStep"},
                 plugin = {
                       "pretty","html:target/CucumberReport.html"
}
)


public class TestRunner {

}
