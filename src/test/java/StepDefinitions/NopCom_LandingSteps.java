package StepDefinitions;

import PageObjects.NopCom_LandingPage;
import Utilities.TestContext;
import Utilities.Wait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
public class NopCom_LandingSteps {
    NopCom_LandingPage nopComLandingPage;
    TestContext testContext;

    Wait wait;


    public NopCom_LandingSteps(TestContext context) {
        testContext = context;
        nopComLandingPage = testContext.getPageObjectManager().getLandingPage();
    }

    @Given("Verify that home page is displayed")
    public void HomePageIsDisplayed() {
        Assert.assertTrue(nopComLandingPage.LandingPageIsDisplayed());
    }

    @When("search for {string} in the search field")
    public void SearchInTheStore(String SearchValue){
        nopComLandingPage.FillSearchField(SearchValue);
    }

    @And("Click Search Button")
    public void ClickSearchButton(){
        nopComLandingPage.ClickSearch();
    }


}
