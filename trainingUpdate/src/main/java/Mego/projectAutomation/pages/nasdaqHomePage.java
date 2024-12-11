package Mego.projectAutomation.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nasdaqHomePage {


    @FindBy(name = "q")
    WebElement textSearch;

    @FindBy(className = "primary-nav__account")
    WebElement loginLogo;

    private WebDriver driver;

    public nasdaqHomePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchForStock(String stockToSearch) {
        textSearch.click();
        textSearch.sendKeys(stockToSearch);
        textSearch.sendKeys(Keys.ENTER);
    }

    public void clickLoginLogo() {
        loginLogo.click();
    }

}

