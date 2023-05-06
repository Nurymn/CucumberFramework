package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {
//                "pretty",//raporlarin daha okunakli olmasi icin
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//        },
        //    monochrome=true,
        features = "./src/test/resources/features",
        glue = {"stepdefinitions"},
        tags = "@US01TC02",
        dryRun = false
)
public class RunnerClass {

}
