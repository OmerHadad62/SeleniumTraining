package Mego.projectAutomation.tests;

import Mego.projectAutomation.pages.nasdaqHomePage;
import Mego.projectAutomation.pages.resultSearchNasdaqPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchWebsiteNasdaqTest {
    public static void main(String[] args) {

        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.nasdaq.com/");

//      Call to Nasdaq search page.
        nasdaqHomePage nasdaqHomePage = new nasdaqHomePage(driver);
        nasdaqHomePage.searchForStock("GOOG");

//      Call to Nasdaq result page.
        resultSearchNasdaqPage resultSearchNasdaqPage = new resultSearchNasdaqPage(driver);
        resultSearchNasdaqPage.checkNameStock("GOOG");

        seleniumBase.seleniumClose(driver);

    }
}
