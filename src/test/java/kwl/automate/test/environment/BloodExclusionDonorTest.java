package kwl.automate.test.environment;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class BloodExclusionDonorTest extends BaseTest {

    @Test (priority = 1)
    public void createDonor1_O_More45Years() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("Excl. Donor I(O) > 45 years");
        donorInfoPage.fillSpecificBirthDateField("01.01.1970\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
    }

    @Test (priority = 2)
    public void createDonor2_O_Less45Years() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("Excl. Donor I(O) <= 45 years");
        donorInfoPage.fillSpecificBirthDateField("01.01.1990\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
    }

    @Test (priority = 3)
    public void createDonor3_A_More45Years() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("Excl. Donor II(A) > 45 years");
        donorInfoPage.fillSpecificBirthDateField("01.01.1970\n");
        donorInfoPage.fillSpecificBloodGroupField("A (II)");
        donorInfoPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
    }

    @Test (priority = 4)
    public void createDonor4_A_Less45Years() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("Excl. Donor II(A) <= 45 years");
        donorInfoPage.fillSpecificBirthDateField("01.01.1990\n");
        donorInfoPage.fillSpecificBloodGroupField("A (II)");
        donorInfoPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
    }

    @Test (priority = 5)
    public void createDonor5_B_More45Years() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("Excl. Donor III(B) > 45 years");
        donorInfoPage.fillSpecificBirthDateField("01.01.1970\n");
        donorInfoPage.fillSpecificBloodGroupField("B (III)");
        donorInfoPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
    }

    @Test (priority = 6)
    public void createDonor6_B_Less45Years() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("Excl. Donor III(B) <= 45 years");
        donorInfoPage.fillSpecificBirthDateField("01.01.1990\n");
        donorInfoPage.fillSpecificBloodGroupField("B (III)");
        donorInfoPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
    }

    @Test (priority = 7)
    public void createDonor7_AB_More45Years() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("Excl. Donor IV(AB) > 45 years");
        donorInfoPage.fillSpecificBirthDateField("01.01.1970\n");
        donorInfoPage.fillSpecificBloodGroupField("AB (IV)");
        donorInfoPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
    }

    @Test (priority = 8)
    public void createDonor8_AB_Less45Years() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("Excl. Donor IV(AB) <= 45 years");
        donorInfoPage.fillSpecificBirthDateField("01.01.1990\n");
        donorInfoPage.fillSpecificBloodGroupField("AB (IV)");
        donorInfoPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
    }
}
