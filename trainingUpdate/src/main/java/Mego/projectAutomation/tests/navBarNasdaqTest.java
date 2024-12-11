package Mego.projectAutomation.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import Mego.projectAutomation.pages.nasdaqNavBarPage;

public class navBarNasdaqTest {
    public static void main(String[] args) {

        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.nasdaq.com");

// Checking element Navbar.
        nasdaqNavBarPage nasdaqNavBarPage = new nasdaqNavBarPage(driver);
        nasdaqNavBarPage.getTextFromNavBar();

        seleniumBase.seleniumClose(driver);

    }
}
