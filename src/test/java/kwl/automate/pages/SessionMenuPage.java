package kwl.automate.pages;

import kwl.automate.pages.data.locators.SessionMenuLocator;
import org.openqa.selenium.WebDriver;

public class SessionMenuPage extends BaseDriver implements SessionMenuLocator {

    public SessionMenuPage(WebDriver driver) {
        super(driver);
    }

    // go to donor info page from Recipient Selection Module page
    public void goToDonorInfoPage() throws InterruptedException {
        setLocatorByXpathAndClick(newSessionPageLocator);
        Thread.sleep(500);
    }

    // select cross match with all recipients are negative checkbox
    public void selectNegativeCrossMatchCheckbox() throws InterruptedException {
        setLocatorByXpathAndClick(negativeCrossMatchLocator);
        Thread.sleep(500);
    }

    // save and go to prioritization page from cross match page
    public void clickSaveButtonOnCrossMatchPage() throws InterruptedException {
        setLocatorByXpathAndClick(saveButtonCrossMatchPageLocator);
        Thread.sleep(500);
    }

}
