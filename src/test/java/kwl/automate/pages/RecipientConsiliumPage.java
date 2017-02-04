package kwl.automate.pages;

import kwl.automate.pages.data.entity.RecipientConsiliumEntity;
import kwl.automate.pages.data.locators.RecipientConsiliumLocator;
import org.openqa.selenium.WebDriver;

public class RecipientConsiliumPage extends BaseDriver implements RecipientConsiliumLocator{

    public RecipientConsiliumPage(WebDriver driver) {super(driver);}

    private RecipientConsiliumEntity entity = new RecipientConsiliumEntity();

    public void fillAllFields() throws InterruptedException {

        // Date field filling
        setLocatorByXpathAndSendKey(consiliumDateLocator, entity.getConsiliumDate());
        Thread.sleep(500);

        // Medical indication field filling
        setLocatorByXpathAndClick(medicalIndicationLocator);
        waitElement(entity.getMedicalIndication());
        setLocatorByXpathAndClick(entity.getMedicalIndication());
        Thread.sleep(500);

        // Consilium conclusion field filling
        setLocatorByXpathAndClick(conclusionLocator);
        waitElement(entity.getConclusion());
        setLocatorByXpathAndClick(entity.getConclusion());
        Thread.sleep(500);

        // Recommended field filling
        setLocatorByXpathAndClick(recommendedLocator);
        waitElement(entity.getRecommended());
        setLocatorByXpathAndClick(entity.getRecommended());
        Thread.sleep(500);

        // Recommended additional field filling
        setLocatorByXpathAndSendKey(additionalRecommendedLocator, entity.getAdditionalRecommended());
        Thread.sleep(500);

        // Several transplantation field filling
        setLocatorByXpathAndClick(severalTransplantationLocator);
        waitElement(entity.getSeveralTransplantation());
        setLocatorByXpathAndClick(entity.getSeveralTransplantation());
        Thread.sleep(500);

        // Emergency field filling
        setLocatorByXpathAndClick(emergencyLocator);
        waitElement(entity.getEmergency());
        setLocatorByXpathAndClick(entity.getEmergency());
        Thread.sleep(500);

        // Fill comment field
        setLocatorByXpathAndSendKey(commentLocator, entity.getComment());
        Thread.sleep(500);

        // Center name field filling
        setLocatorByXpathAndClick(centerNameLocator);
        waitElement(centerNameValueLocator);
        setLocatorByXpathAndClick(centerNameValueLocator);
        Thread.sleep(500);

        // Consilium member field filling
        setLocatorByXpathAndClick(consiliumMemberLocator);
        waitElement(entity.getConsiliumMember());
        setLocatorByXpathAndClick(entity.getConsiliumMember());
        Thread.sleep(1000);

        // Click save button
        setLocatorByXpathAndClick(saveButtonLocator);
        Thread.sleep(3000);
    }

    public void fillOverallFields() throws InterruptedException {

        // Date field filling
        setLocatorByXpathAndSendKey(consiliumDateLocator, entity.getConsiliumDate());
        Thread.sleep(500);

        // Consilium conclusion field filling
        setLocatorByXpathAndClick(conclusionLocator);
        waitElement(entity.getAcceptedConclusion());
        setLocatorByXpathAndClick(entity.getAcceptedConclusion());
        Thread.sleep(500);

        // Center name field filling
        setLocatorByXpathAndClick(centerNameLocator);
        waitElement(centerNameValueLocator);
        setLocatorByXpathAndClick(centerNameValueLocator);
        Thread.sleep(500);

        // Consilium member field filling
        setLocatorByXpathAndClick(consiliumMemberLocator);
        waitElement(entity.getConsiliumMember());
        setLocatorByXpathAndClick(entity.getConsiliumMember());
        Thread.sleep(1000);

        // Click save button
        setLocatorByXpathAndClick(saveButtonLocator);
        Thread.sleep(3000);
    }

    public void fillSeveralTransplantationsField(String severalTransplantationNum) throws InterruptedException {

        // Several transplantation field filling
        setLocatorByXpathAndClick(severalTransplantationLocator);
        waitElement(entity.getSpecificSeveralTransplantation(severalTransplantationNum));
        setLocatorByXpathAndClick(entity.getSpecificSeveralTransplantation(severalTransplantationNum));
        Thread.sleep(500);
    }

    public void fillEmergencyField() throws InterruptedException {

        // Emergency field filling
        setLocatorByXpathAndClick(emergencyLocator);
        waitElement(entity.getEmergency());
        setLocatorByXpathAndClick(entity.getEmergency());
        Thread.sleep(500);
    }
}

