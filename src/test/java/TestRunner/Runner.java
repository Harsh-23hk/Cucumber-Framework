package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features/Customer.feature",
        glue = "StepDefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-report/report.html",
                "json:target/cucumber-report/report_json.json",
                "junit:target/cucumber-report/report_xml.xml"
        }

)
public class Runner {

    //this class will be empty
}
