package kwl.automate.pages;

import kwl.automate.pages.data.locators.RemoveLocator;
import org.openqa.selenium.WebDriver;

public class RemovePage extends BaseDriver implements RemoveLocator{

    public RemovePage(WebDriver driver) {super(driver);}

    public void removeCard() throws InterruptedException {

        // remove card steps
        setLocatorByXpathAndClick(firstPatientLocator);
        Thread.sleep(1000);
        setLocatorByXpathAndClick(consiliumPageButtonLocator);
        Thread.sleep(1000);
        setLocatorByXpathAndClick(deleteConsiliumButtonLocator);
        Thread.sleep(1000);
        setLocatorByXpathAndClick(deleteConsiliumConfirmButtonLocator);
        Thread.sleep(1000);
        setLocatorByXpathAndClick(actionButtonLocator);
        Thread.sleep(1000);
        setLocatorByXpathAndClick(deleteCardButtonLocator);
        Thread.sleep(1000);
        setLocatorByXpathAndClick(deleteConfirmButtonLocator);
        Thread.sleep(1000);
    }

    public void removeSession() throws InterruptedException {

        // remove session steps
        setLocatorByXpathAndClick(firstSessionLocator);
        Thread.sleep(1000);
        setLocatorByXpathAndClick(actionButtonLocator);
        Thread.sleep(500);
        setLocatorByXpathAndClick(deleteSessionButtonLocator);
        Thread.sleep(500);
        setLocatorByXpathAndClick(deleteConfirmButtonLocator);
        Thread.sleep(1000);
    }
}
