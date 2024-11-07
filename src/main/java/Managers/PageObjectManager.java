package Managers;

import PageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private final WebDriver webDriver;

    private SWICA_LandingPage nopComLandingPage;

    private NopCom_SearchResultsPage nopComSearchResultsPage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Short Hand If...Else

    public SWICA_LandingPage getLandingPage() {
        return (nopComLandingPage == null) ? nopComLandingPage = new SWICA_LandingPage(webDriver) : nopComLandingPage;
    }
    public NopCom_SearchResultsPage getSearchResultsPage() {
        return (nopComSearchResultsPage == null) ? nopComSearchResultsPage = new NopCom_SearchResultsPage(webDriver) : nopComSearchResultsPage;
    }

}
