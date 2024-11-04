package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features", // default path
        glue = "StepDefinitions",
        plugin = {
                "pretty",
                "html:src/test/resources/Reports/Report.html",
                "json:src/test/resources/Reports/CucumberTestReport.json",
                "timeline:src/test/resources/Reports/test-output-thread/"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // Add the setup for a dynamic feature path
    @BeforeClass
    public void setUp() {
        // Set the feature file dynamically, if specified
        String featurePath = System.getProperty("cucumber.feature", "src/test/resources/features");
        System.setProperty("cucumber.options", featurePath);

        String tags = System.getProperty("cucumber.tags", "@smoke"); // default to @smoke if not set
        System.setProperty("cucumber.filter.tags", tags);
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("================ BEFORE SUITE ================");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("================ AFTER SUITE ================");
    }
}