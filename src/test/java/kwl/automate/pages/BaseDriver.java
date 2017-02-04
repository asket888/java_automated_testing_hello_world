package kwl.automate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseDriver {

    protected WebDriver driver;

    protected BaseDriver (WebDriver driver) {this.driver = driver;}

    protected void waitElement(String locator) {(new WebDriverWait(driver, 5))
            .withMessage("Element doesn't appear for 5 seconds. Please check your entities and locators on failed page")
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));}

    protected void setUrl(String url) {driver.get(url);}
    protected void setLocatorByXpathAndClick(String locator) {driver.findElement(By.xpath(locator)).click();}
    protected void setLocatorByXpathAndClear(String locator) {driver.findElement(By.xpath(locator)).clear();}
    protected void setLocatorByXpathAndSendKey(String locator, String value) {driver.findElement(By.xpath(locator)).
            sendKeys(value);}
}
