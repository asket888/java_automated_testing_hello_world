package kwl.automate.test.environment;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class AccountingAntigenRecipientTest extends BaseTest {

    @Test(priority = 1)
    public void createRecipient1_O_A8_B9_Cw7_Bw1_DR3_DQ8() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("Excl.HLA A8_B9_Cw7_Bw1_DR3_DQ8");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("8", "8", "9", "9", "7", "7", "1", "1", "3", "3", "8", "8");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test(priority = 2)
    public void createRecipient1_O_A8_B9_Cw7() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("Excl.HLA A8_B9_Cw7");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("8", "8", "9", "9", "7", "7", "", "", "", "", "", "");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test(priority = 3)
    public void createRecipient1_O_A1_B9_Cw7_Bw1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("Excl.HLA A1_B9_Cw7_Bw1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "1", "9", "9", "7", "7", "1", "1", "", "", "", "");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test(priority = 4)
    public void createRecipient1_O_A1_B2_Cw7_Bw1_DR2_DQ8() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("Excl.HLA A1_B2_Cw7_Bw1_DR2_DQ8");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "1", "2", "2", "7", "7", "1", "1", "2", "2", "8", "8");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test(priority = 5)
    public void createRecipient1_O_A1_B2_Cw2_Bw1_DR3_DQ1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("Excl.HLA A1_B2_Cw2_Bw1_DR3_DQ1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "1", "2", "2", "2", "2", "1", "1", "3", "3", "1", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test(priority = 6)
    public void createRecipient1_O_A1_B2_Cw7_Bw5_DR3_DQ8() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("Excl.HLA A1_B2_Cw7_Bw5_DR3_DQ8");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "1", "2", "2", "7", "7", "5", "5", "3", "3", "8", "8");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }
}
