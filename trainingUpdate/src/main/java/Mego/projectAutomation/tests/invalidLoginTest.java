package Mego.projectAutomation.tests;

import Mego.projectAutomation.pages.nasdaqHomePage;
import Mego.projectAutomation.pages.nasdaqLoginPage;
import org.openqa.selenium.chrome.ChromeDriver;


public class invalidLoginTest {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.nasdaq.com/");

        nasdaqHomePage nasdaqHomePage = new nasdaqHomePage(driver);
        nasdaqHomePage.clickLoginLogo();


        nasdaqLoginPage nasdaqLoginPage = new nasdaqLoginPage(driver);
        nasdaqLoginPage.loginToNasdaq("abc123@gmail.com", "Aa12");


        String para = "Please use a valid user ID and password combination.";
        nasdaqLoginPage.loginSuccess(para);

    }
}