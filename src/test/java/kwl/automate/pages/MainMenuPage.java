package kwl.automate.pages;

import kwl.automate.pages.data.locators.MainMenuLocator;
import org.openqa.selenium.WebDriver;

public class MainMenuPage extends BaseDriver implements MainMenuLocator {

    public MainMenuPage(WebDriver driver) {
        super(driver);
    }

    // Go to Main Menu page
    public void goToMainMenuPage() throws InterruptedException {
        setLocatorByXpathAndClick(catalogPageLocator);
    }

    // Go to Calculator page
    public void goToCalculatorPage() throws InterruptedException {
        setLocatorByXpathAndClick(calculatorPageLocator);
    }

    // Go to New Patient Creation page
    public void goToNewPatientCreationPage() throws InterruptedException {
        setLocatorByXpathAndClick(newPatientPageLocator);
    }

    // Go to Recipient Selection Module page
    public void goToRecipientSelectionPage() throws InterruptedException {
        setLocatorByXpathAndClick(recipientSelectionLocator);
    }

    // Go to Administration Module page
    public void goToAdministrationPage() throws InterruptedException {
        setLocatorByXpathAndClick(administrationPageLocator);
    }
}
