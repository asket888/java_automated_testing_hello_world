package kwl.automate.pages;

import kwl.automate.pages.data.entity.RecipientCommonEntity;
import kwl.automate.pages.data.locators.RecipientCommonLocator;
import org.openqa.selenium.WebDriver;

public class RecipientCommonPage extends BaseDriver implements RecipientCommonLocator {

    public RecipientCommonPage(WebDriver driver) {super(driver);}

    private RecipientCommonEntity entity = new RecipientCommonEntity();

    public void fillAllFields() throws InterruptedException {

        // fill patient's LFS names fields
        setLocatorByXpathAndSendKey(lastNameLocator, entity.getRecipientLastName());
        setLocatorByXpathAndSendKey(firstNameLocator, entity.getRecipientFirstName());
        setLocatorByXpathAndSendKey(secondNameLocator, entity.getRecipientSecondName());
        Thread.sleep(500);

        // fill patient's birth date field
        setLocatorByXpathAndSendKey(birthDateLocator, entity.getRecipientBirthDate());
        Thread.sleep(500);

        // fill patient's disability field
        setLocatorByXpathAndClick(disabilityLocator);
        waitElement(entity.getDisability());
        setLocatorByXpathAndClick(entity.getDisability());
        Thread.sleep(500);

        // fill patient's gender
        setLocatorByXpathAndClick(entity.getGender());
        Thread.sleep(500);

        // fill patient's passport data fields
        setLocatorByXpathAndSendKey(passportNumLocator, entity.getPassportNum());
        setLocatorByXpathAndSendKey(passportIssueDateLocator, entity.getPassportIssueDate());
        setLocatorByXpathAndSendKey(passportIssuerLocator, entity.getPassportIssuer());
        setLocatorByXpathAndSendKey(personalNumLocator, entity.getPersonalNumber());
        Thread.sleep(500);

        // fill patient's address terson field
        setLocatorByXpathAndClick(addressTersonLocator);
        waitElement(addressTersonAustria);
        setLocatorByXpathAndClick(addressTersonAustria);
        waitElement(acceptButtonTersonLocator);
        setLocatorByXpathAndClick(acceptButtonTersonLocator);
        Thread.sleep(500);

        // fill patient's additional address fields
        setLocatorByXpathAndSendKey(addressTextLocator, entity.getAddressText());
        setLocatorByXpathAndSendKey(addressAdditionalLocator, entity.getAddressText());
        Thread.sleep(500);

        // fill patient's phone number field
        setLocatorByXpathAndSendKey(phoneNumberLocator, entity.getPhoneNumber());
        Thread.sleep(500);

        // fill dialysis center field
        setLocatorByXpathAndClick(dialysisCenterLocator);
        waitElement(dialysisCenterStep1);
        setLocatorByXpathAndClick(dialysisCenterStep1);
        waitElement(dialysisCenterStep2);
        setLocatorByXpathAndClick(dialysisCenterStep2);
        waitElement(dialysisCenterStep3);
        setLocatorByXpathAndClick(dialysisCenterStep3);
        waitElement(dialysisCenterStep3);
        setLocatorByXpathAndClick(dialysisCenterStep3);
        waitElement(acceptButtonDCLocator);
        setLocatorByXpathAndClick(acceptButtonDCLocator);
        Thread.sleep(500);

        // fill notes field
        setLocatorByXpathAndSendKey(notesLocator, entity.getNotes());
        Thread.sleep(500);

        // Click save button
        setLocatorByXpathAndClick(saveButtonLocator);
    }

    public void fillMandatoryFields() throws InterruptedException {

        // fill patient's LFS names fields
        setLocatorByXpathAndSendKey(lastNameLocator, entity.getRecipientLastName());
        setLocatorByXpathAndSendKey(firstNameLocator, entity.getRecipientFirstName());
        setLocatorByXpathAndSendKey(secondNameLocator, entity.getRecipientSecondName());
        Thread.sleep(500);

        // fill patient's birth date field
        setLocatorByXpathAndSendKey(birthDateLocator, entity.getRecipientBirthDate());
        Thread.sleep(500);

        // fill patient's gender
        setLocatorByXpathAndClick(entity.getGender());
        Thread.sleep(500);

        // fill patient's address terson field
        setLocatorByXpathAndClick(addressTersonLocator);
        waitElement(addressTersonAustria);
        setLocatorByXpathAndClick(addressTersonAustria);
        waitElement(acceptButtonTersonLocator);
        setLocatorByXpathAndClick(acceptButtonTersonLocator);
        Thread.sleep(500);

        // fill patient's phone number field
        setLocatorByXpathAndSendKey(phoneNumberLocator, entity.getPhoneNumber());
        Thread.sleep(500);

        // fill dialysis center field
        setLocatorByXpathAndClick(dialysisCenterLocator);
        waitElement(dialysisCenterStep1);
        setLocatorByXpathAndClick(dialysisCenterStep1);
        waitElement(dialysisCenterStep2);
        setLocatorByXpathAndClick(dialysisCenterStep2);
        waitElement(dialysisCenterStep3);
        setLocatorByXpathAndClick(dialysisCenterStep3);
        waitElement(dialysisCenterStep3);
        setLocatorByXpathAndClick(dialysisCenterStep3);
        waitElement(acceptButtonDCLocator);
        setLocatorByXpathAndClick(acceptButtonDCLocator);
        Thread.sleep(500);

        // Click save button
        setLocatorByXpathAndClick(saveButtonLocator);
    }

    public void fillOverallFields() throws InterruptedException {

        // fill patient's First name fields
        setLocatorByXpathAndSendKey(firstNameLocator, entity.getRecipientFirstName());
        Thread.sleep(500);

        // fill patient's gender
        setLocatorByXpathAndClick(entity.getGender());
        Thread.sleep(500);

        // fill patient's phone number field
        setLocatorByXpathAndSendKey(phoneNumberLocator, entity.getPhoneNumber());
        Thread.sleep(500);

        // fill dialysis center field
        setLocatorByXpathAndClick(dialysisCenterLocator);
        waitElement(dialysisCenterStep1);
        setLocatorByXpathAndClick(dialysisCenterStep1);
        waitElement(dialysisCenterStep2);
        setLocatorByXpathAndClick(dialysisCenterStep2);
        waitElement(dialysisCenterStep3);
        setLocatorByXpathAndClick(dialysisCenterStep3);
        waitElement(dialysisCenterStep3);
        setLocatorByXpathAndClick(dialysisCenterStep3);
        waitElement(acceptButtonDCLocator);
        setLocatorByXpathAndClick(acceptButtonDCLocator);
        Thread.sleep(2000);

        setLocatorByXpathAndClick(saveButtonLocator);
        Thread.sleep(2000);
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

    public void fillSimpleAddressTersonField() throws InterruptedException {

        // fill patient's address terson field
        setLocatorByXpathAndClick(addressTersonLocator);
        waitElement(addressTersonAustria);
        Thread.sleep(500);
        setLocatorByXpathAndClick(addressTersonAustria);
        waitElement(acceptButtonTersonLocator);
        setLocatorByXpathAndClick(acceptButtonTersonLocator);
        Thread.sleep(500);
    }

    public void fillSpecificAddressTersonField(String setTownXpath) throws InterruptedException {

        // fill patient's address terson field
        setLocatorByXpathAndClick(addressTersonLocator);
        waitElement(addressTersonBelarus);
        setLocatorByXpathAndClick(addressTersonBelarus);
        waitElement(setTownXpath);
        setLocatorByXpathAndClick(setTownXpath);
        waitElement(acceptButtonTersonLocator);
        setLocatorByXpathAndClick(acceptButtonTersonLocator);
        Thread.sleep(500);
    }

    public void fillSpecificAddressTersonField(String setRegonXpath, String setTownXpath) throws InterruptedException {

        // fill patient's address terson field
        setLocatorByXpathAndClick(addressTersonLocator);
        waitElement(addressTersonBelarus);
        setLocatorByXpathAndClick(addressTersonBelarus);
        waitElement(setRegonXpath);
        setLocatorByXpathAndClick(setRegonXpath);
        waitElement(setTownXpath);
        setLocatorByXpathAndClick(setTownXpath);
        waitElement(acceptButtonTersonLocator);
        setLocatorByXpathAndClick(acceptButtonTersonLocator);
        Thread.sleep(500);
    }
}
