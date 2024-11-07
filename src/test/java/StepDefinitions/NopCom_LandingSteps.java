package StepDefinitions;

import PageObjects.SWICA_LandingPage;
import Utilities.TestContext;
import Utilities.Wait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class NopCom_LandingSteps {
    public static WebDriver webDriver;
    SWICA_LandingPage SWICALandingPage;
    TestContext testContext;

    Wait wait;


    public NopCom_LandingSteps(TestContext context) {
        testContext = context;
        SWICALandingPage = testContext.getPageObjectManager().getLandingPage();
    }

    @Given("Verify that home page is displayed")
    public void HomePageIsDisplayed() {
        Assert.assertTrue(SWICALandingPage.LandingPageIsDisplayed());
    }

    @When("Click Accept Cookies")
    public void clickAcceptCookies() {
        SWICALandingPage.UserAcceptCookies();
    }
}
