package Mego.projectAutomation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class nasdaqNavBarPage {

    @FindBy(xpath = ("//span[text()='Market Activity']"))
    WebElement MarketActivity;

    @FindBy(xpath = ("//span[text()='News + Insights']"))
    WebElement NewsInsights;

    @FindBy(xpath = ("//span[text()='Solutions']"))
    WebElement Solutions;

    @FindBy(xpath = ("//span[text()='About']"))
    WebElement About;


    private WebDriver driver;

    public nasdaqNavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void getTextFromNavBar() {
        List<WebElement> listNavbarElements = Arrays.asList(MarketActivity, NewsInsights, Solutions, About);
        List<String> navbarString = new ArrayList<>(Arrays.asList("Market Activity", "News + Insights", "Solutions", "About"));

        String stringElement = null;
        for (WebElement element : listNavbarElements) {
            stringElement = element.getText();
            Boolean isPass = navbarString.contains(stringElement);

            Assert.assertTrue(stringElement + " is not include inside", isPass);
            System.out.println(stringElement + " is include inside navbar");
        }
    }
}
