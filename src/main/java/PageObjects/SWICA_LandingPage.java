package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
public class SWICA_LandingPage {
    private final WebDriver webDriver;

    public SWICA_LandingPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(id = "onetrust-policy-title")
    private WebElement CookiesWelcomeMessage;

    @FindBy(id ="onetrust-accept-btn-handler1")
    private WebElement AcceptCookies;

    public boolean LandingPageIsDisplayed() {
        CookiesWelcomeMessage.isDisplayed();
        AcceptCookies.isDisplayed();
        return true;
    }

    public void UserAcceptCookies(){
        AcceptCookies.click();
    }

}
