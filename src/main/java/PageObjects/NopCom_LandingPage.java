package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
public class NopCom_LandingPage {
    private final WebDriver webDriver;
    public NopCom_LandingPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(id = "small-searchterms")
    private WebElement searchField;

    @FindBy(xpath ="//button[@type='submit']")
    private WebElement searchButton;

    public boolean LandingPageIsDisplayed() {
        searchField.isDisplayed();
        searchButton.isDisplayed();
        return true;
    }

    public void FillSearchField(String SearchFor){
        searchField.sendKeys(SearchFor);
    }

    public void ClickSearch(){
        searchButton.click();
    }
}
