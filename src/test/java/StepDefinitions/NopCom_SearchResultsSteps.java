package StepDefinitions;

import PageObjects.NopCom_SearchResultsPage;
import Utilities.TestContext;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class NopCom_SearchResultsSteps {
    TestContext testContext;
    NopCom_SearchResultsPage nopComSearchResultsPage;

    public NopCom_SearchResultsSteps(TestContext context) {
        testContext = context;
        nopComSearchResultsPage = testContext.getPageObjectManager().getSearchResultsPage();
    }

    @Then("I should find {string} in the results")
    public void iShouldFindInTheResults(String Expected) {
        Assert.assertEquals(nopComSearchResultsPage.GetSearchResultString(),Expected);

    }
}
