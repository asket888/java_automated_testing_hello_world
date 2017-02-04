package kwl.automate.pages;

import kwl.automate.pages.data.entity.DonorInfoEntity;
import kwl.automate.pages.data.locators.DonorInfoLocator;
import org.openqa.selenium.WebDriver;

public class DonorInfoPage extends BaseDriver implements DonorInfoLocator{

    public DonorInfoPage(WebDriver driver) {super(driver);}

    private DonorInfoEntity entity = new DonorInfoEntity();

    public void fillAllFields() throws InterruptedException {

        // Donor number and disease history number fields filling
        setLocatorByXpathAndSendKey(numberLocator, entity.getDonorNumber());
        waitElement(historyLocator);
        setLocatorByXpathAndSendKey(historyLocator, entity.getDonorIllnessHistory());
        Thread.sleep(500);

        // Hospital name input
        setLocatorByXpathAndClick(guideHfLocator);
        waitElement(guideHfDictionaryStep1);
        setLocatorByXpathAndClick(guideHfDictionaryStep1);
        waitElement(guideHfDictionaryStep2);
        setLocatorByXpathAndClick(guideHfDictionaryStep2);
        waitElement(guideHfDictionaryStep3);
        setLocatorByXpathAndClick(guideHfDictionaryStep3);
        waitElement(guideHfAcceptButtonLocator);
        setLocatorByXpathAndClick(guideHfAcceptButtonLocator);
        Thread.sleep(500);

        // FIO, Birth date and Gender fields input
        setLocatorByXpathAndSendKey(lastNameLocator, entity.getDonorLastName());
        waitElement(firstNameLocator);
        setLocatorByXpathAndSendKey(firstNameLocator, entity.getDonorFirstName());
        waitElement(secondNameLocator);
        setLocatorByXpathAndSendKey(secondNameLocator, entity.getDonorSecondName());
        waitElement(birthDateLocator);
        setLocatorByXpathAndSendKey(birthDateLocator, entity.getDonorBirthDate());
        waitElement(entity.getDonorGender());
        setLocatorByXpathAndClick(entity.getDonorGender());
        Thread.sleep(500);

        // Blood Group and RH Factor fields filling
        setLocatorByXpathAndClick(bloodGroupLocator);
        waitElement(entity.getBloodGroup());
        setLocatorByXpathAndClick(entity.getBloodGroup());
        waitElement(bloodRhesusLocator);
        setLocatorByXpathAndClick(bloodRhesusLocator);
        waitElement(entity.getBloodRhesus());
        setLocatorByXpathAndClick(entity.getBloodRhesus());
        Thread.sleep(500);

        // HLA phenotype block filling
        setLocatorByXpathAndSendKey(hla0Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla1Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla2Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla3Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla4Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla5Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla6Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla7Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla8Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla9Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla10Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla11Locator, entity.getHla());
        Thread.sleep(500);

        // Save donor as draft
        setLocatorByXpathAndClick(saveAsDraftButton);
        Thread.sleep(3000);
    }

    public void fillOverallFields() throws InterruptedException {

        // Donor number and disease history number fields filling
        setLocatorByXpathAndSendKey(numberLocator, entity.getDonorNumber());
        waitElement(historyLocator);
        setLocatorByXpathAndSendKey(historyLocator, entity.getDonorIllnessHistory());
        Thread.sleep(500);

        // Hospital name input
        setLocatorByXpathAndClick(guideHfLocator);
        waitElement(guideHfDictionaryStep1);
        setLocatorByXpathAndClick(guideHfDictionaryStep1);
        waitElement(guideHfDictionaryStep2);
        setLocatorByXpathAndClick(guideHfDictionaryStep2);
        waitElement(guideHfDictionaryStep3);
        setLocatorByXpathAndClick(guideHfDictionaryStep3);
        waitElement(guideHfAcceptButtonLocator);
        setLocatorByXpathAndClick(guideHfAcceptButtonLocator);
        Thread.sleep(500);

        // Donor gender field input
        waitElement(entity.getDonorGender());
        setLocatorByXpathAndClick(entity.getDonorGender());
        Thread.sleep(500);

        // Donor blood Rhesus field input
        waitElement(bloodRhesusLocator);
        setLocatorByXpathAndClick(bloodRhesusLocator);
        waitElement(entity.getBloodRhesus());
        setLocatorByXpathAndClick(entity.getBloodRhesus());
        Thread.sleep(500);
    }

    public void fillSpecificLastNameField(String lastName) throws InterruptedException {

        // fill patient's Last name
        setLocatorByXpathAndSendKey(lastNameLocator, lastName);
        Thread.sleep(500);
    }

    public void fillSpecificBirthDateField(String birthDate) throws InterruptedException {

        // fill patient's Birth date
        setLocatorByXpathAndSendKey(birthDateLocator, birthDate);
        Thread.sleep(500);
    }

    public void fillSpecificBloodGroupField(String bloodGroupValue) throws InterruptedException {

        // blood group field filling
        setLocatorByXpathAndClick(bloodGroupLocator);
        waitElement(entity.getSpecificBloodGroup(bloodGroupValue));
        setLocatorByXpathAndClick(entity.getSpecificBloodGroup(bloodGroupValue));
        Thread.sleep(500);
    }

    public void fillSpecificHlaBlock(String a1Value, String a2Value, String b1Value, String b2Value
                                     ) throws InterruptedException {

        // HLA phenotype block filling
        setLocatorByXpathAndSendKey(hla0Locator, a1Value);
        setLocatorByXpathAndSendKey(hla1Locator, a2Value);
        setLocatorByXpathAndSendKey(hla2Locator, b1Value);
        setLocatorByXpathAndSendKey(hla3Locator, b2Value);
        Thread.sleep(500);
    }

    public void fillSpecificHlaBlock(String a1Value, String a2Value, String b1Value, String b2Value,
                                     String dr1Value, String dr2Value) throws InterruptedException {

        // HLA phenotype block filling
        setLocatorByXpathAndSendKey(hla0Locator, a1Value);
        setLocatorByXpathAndSendKey(hla1Locator, a2Value);
        setLocatorByXpathAndSendKey(hla2Locator, b1Value);
        setLocatorByXpathAndSendKey(hla3Locator, b2Value);
        setLocatorByXpathAndSendKey(hla8Locator, dr1Value);
        setLocatorByXpathAndSendKey(hla9Locator, dr2Value);
        Thread.sleep(500);
    }

    public void fillSpecificHlaBlock(String a1Value, String a2Value, String b1Value, String b2Value,
                                     String cw1Value, String cw2Value, String bw1Value, String bw2Value,
                                     String dr1Value, String dr2Value, String dq1Value, String dq2Value
                                     ) throws InterruptedException {

        // HLA phenotype block filling
        setLocatorByXpathAndSendKey(hla0Locator, a1Value);
        setLocatorByXpathAndSendKey(hla1Locator, a2Value);
        setLocatorByXpathAndSendKey(hla2Locator, b1Value);
        setLocatorByXpathAndSendKey(hla3Locator, b2Value);
        setLocatorByXpathAndSendKey(hla4Locator, cw1Value);
        setLocatorByXpathAndSendKey(hla5Locator, cw2Value);
        setLocatorByXpathAndSendKey(hla6Locator, bw1Value);
        setLocatorByXpathAndSendKey(hla7Locator, bw2Value);
        setLocatorByXpathAndSendKey(hla8Locator, dr1Value);
        setLocatorByXpathAndSendKey(hla9Locator, dr2Value);
        setLocatorByXpathAndSendKey(hla10Locator, dq1Value);
        setLocatorByXpathAndSendKey(hla11Locator, dq2Value);
        Thread.sleep(500);
    }

    public void clickSaveButton() throws InterruptedException {

        // Click save button
        setLocatorByXpathAndClick(saveButtonDonorPage);
        Thread.sleep(2000);
    }
}
