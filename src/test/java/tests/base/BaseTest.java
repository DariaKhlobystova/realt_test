package tests.base;

import common.CommonAction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.listing.RealListingPage;
import pages.realthome.RealtHomePage;

import java.util.Set;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealListingPage realListingPage = new RealListingPage(driver);


    @AfterSuite(alwaysRun = true)
    public void quite() {
        driver.quit();
    }

//        WebDriverWait wait = new WebDriverWait(driver, 10);

//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert();
//        alert.acceptAll();

//    protected void switchWindow() {
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        String window1 = driver.getWindowHandle();
//        js.executeScript("window.open()");
//        Set<String> currentWindows = driver.getWindowHandles();
//        String window2 = null;
//        for(String window : currentWindows) {
//            if(!window.equals(window1)) {
//                window2 = window;
//                break;
//            }
//        }
//        driver.switchTo().window(window2);
//    }
}

