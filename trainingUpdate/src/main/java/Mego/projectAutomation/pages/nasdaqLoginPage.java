package Mego.projectAutomation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nasdaqLoginPage {
    @FindBy(name = "username")
    WebElement emailInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(className = "button-primary")
    WebElement loginButton;

    private WebDriver driver;

    public nasdaqLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginToNasdaq(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void loginSuccess(String para) {
        String paragraph = String.valueOf(driver.findElement(By.tagName("p")));

        boolean isPass = para.contains(paragraph);

        Assert.assertTrue("The test success.", isPass);
        System.out.println("The test filed.");
    }

}
