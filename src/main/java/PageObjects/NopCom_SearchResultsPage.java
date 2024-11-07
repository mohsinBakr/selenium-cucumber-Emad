package PageObjects;

import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import javax.naming.directory.SearchResult;
import java.time.Duration;

public class NopCom_SearchResultsPage {
    private final WebDriver webDriver;

    public NopCom_SearchResultsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }


    @FindBy(xpath = "//h2[@class='product-title']/a")
    private WebElement SearchResults;

    public String GetSearchResultString(){
        Wait.untilElementIsVisible(webDriver, SearchResults, Duration.ofSeconds(10));
        return SearchResults.getText();
    }

    public WebElement SearchResult(){
        return webDriver.findElement(By.xpath("//h2[@class='product-title']/a"));
    }

    public String GetSearchResultString2(){
        Wait.untilElementIsVisible(webDriver, SearchResult(), Duration.ofSeconds(10));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", SearchResult());
        return SearchResult().getText();
    }
}
