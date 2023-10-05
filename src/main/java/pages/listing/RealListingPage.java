package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;
import pages.realthome.RealtHomePage;

public class RealListingPage extends BasePage {
    public RealListingPage (WebDriver driver) {
        super(driver);
    }
    private final By card = By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/main/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[*]");
//private final By card1 = By.xpath("//div[@class='cursor-pointer w-full h-full']");
    public RealListingPage checkCountCards() {
        waitElementIsVisible(driver.findElement(card));

       int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 30);
        return this;
    }
}
