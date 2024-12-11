package Mego.projectAutomation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class resultSearchNasdaqPage {

    @FindBy(className = "jupiter22-c-nav__title-row")
    WebElement stockName;

    private WebDriver driver;

    public resultSearchNasdaqPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void checkNameStock(String patternToFind) {
        String requireStock = "GOOG";
        String nameOfStock = stockName.getText(); // ניקוי רווחים מיותרים
        boolean isPass = requireStock.contains(nameOfStock);

        Assert.assertTrue(requireStock + " isn't matching to " + nameOfStock, isPass);
        System.out.println(requireStock + " is the actual stock i searched");
    }
}
