package Mego.projectAutomation.tests;

import Mego.projectAutomation.pages.nasdaqHomePage;
import Mego.projectAutomation.pages.resultSearchNasdaqPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchWebsiteNasdaqTest {
    public static void main(String[] args) {

        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.nasdaq.com/");

        // קריאה לדף חיפוש ב-Nasdaq
        nasdaqHomePage nasdaqHomePage = new nasdaqHomePage(driver);
        nasdaqHomePage.searchForStock("GOOG");

        // קריאה לדף תוצאות חיפוש ב-Nasdaq
        resultSearchNasdaqPage resultSearchNasdaqPage = new resultSearchNasdaqPage(driver);
        resultSearchNasdaqPage.checkNameStock("GOOG");

        seleniumBase.seleniumClose(driver);

    }
}
