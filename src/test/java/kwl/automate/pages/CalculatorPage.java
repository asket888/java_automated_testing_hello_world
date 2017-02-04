package kwl.automate.pages;

import kwl.automate.pages.data.entity.CalculatorEntity;
import kwl.automate.pages.data.locators.CalculatorLocator;
import org.openqa.selenium.WebDriver;

public class CalculatorPage extends BaseDriver implements CalculatorLocator {

    public CalculatorPage(WebDriver driver) {super(driver);}

    CalculatorEntity entity = new CalculatorEntity();

    public void calculate() throws InterruptedException {

        // Donor information filling
        setLocatorByXpathAndSendKey(donorAgeLocator, entity.getDonorAge());
        setLocatorByXpathAndClick(entity.getDonorDeath());
        setLocatorByXpathAndSendKey(donorWeigthLocator, entity.getDonorWeigth());
        setLocatorByXpathAndSendKey(donorSodiumLevelLocator, entity.getDonorSodiumLevel());
        setLocatorByXpathAndSendKey(donorAnapnotherapyDurationLocator, entity.getDonorAnapnotherapyDuration());
        setLocatorByXpathAndSendKey(donorUreaLevelLocator, entity.getDonorUreaLevel());
        setLocatorByXpathAndSendKey(donorSystolicPressureLocator, entity.getDonorSystolicPressure());
        setLocatorByXpathAndSendKey(donorDiastolicPressureLocator, entity.getDonorDiastolicPressure());

        // Recipient information filling
        setLocatorByXpathAndClick(entity.getRecipientGender());
        setLocatorByXpathAndClick(entity.getRecipientHasDiabetes());
        setLocatorByXpathAndClick(entity.getRecipientDialysis());

        // Click calculate button
        setLocatorByXpathAndClick(calculateButtonLocator);
        Thread.sleep(3000);
    }
}
