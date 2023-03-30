package Managers;

import PageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private final WebDriver webDriver;

    private NopCom_LandingPage nopComLandingPage;

    private NopCom_SearchResultsPage nopComSearchResultsPage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Short Hand If...Else

    public NopCom_LandingPage getLandingPage() {
        return (nopComLandingPage == null) ? nopComLandingPage = new NopCom_LandingPage(webDriver) : nopComLandingPage;
    }
    public NopCom_SearchResultsPage getSearchResultsPage() {
        return (nopComSearchResultsPage == null) ? nopComSearchResultsPage = new NopCom_SearchResultsPage(webDriver) : nopComSearchResultsPage;
    }

}
