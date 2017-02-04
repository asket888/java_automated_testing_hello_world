package kwl.automate.test.environment;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class BloodExclusionRecipientTest extends BaseTest {

    @Test (priority = 1)
    public void testRecipient1_O_NoAdditionalConditions() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) no addit. conditions");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 2, alwaysRun = true)
    public void testRecipient2_O_KidneyAndPancreas() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) Kidney+Pancreas");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillSeveralTransplantationsField("1");
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 3, alwaysRun = true)
    public void testRecipient3_O_EmergencySign() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) 'Emergency' sign");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillEmergencyField();
        recipientConsiliumPage.fillOverallFields();

    }

    @Test (priority = 4, alwaysRun = true)
    public void testRecipient4_O_ChildrenSign() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) 'Children' sign");
        recipientCommonPage.fillSpecificBirthDateField("01.01.2005\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 5, alwaysRun = true)
    public void testRecipient5_O_More4YearsInWaitingList() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) More 4 years in WL");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillAbBlock("01.01.2011\n", "50");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 6, alwaysRun = true)
    public void testRecipient6_O_HlaMismatch000() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) HLA mismatch 000");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 7, alwaysRun = true)
    public void testRecipient7_O_Homozygosity2Alley() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) Homozygosity by 2 allele");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "1", "3", "3", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 8, alwaysRun = true)
    public void testRecipient8_O_KidneyAndLiver() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) Kidney+Liver");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillSeveralTransplantationsField("2");
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 9, alwaysRun = true)
    public void testRecipient9_A_NoAdditionalConditions() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("II(A) no addit. conditions");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("A (II)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 10, alwaysRun = true)
    public void testRecipient10_A_KidneyAndPancreas() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("II(A) Kidney+Pancreas");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("A (II)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillSeveralTransplantationsField("1");
        recipientConsiliumPage.fillOverallFields();

    }

    @Test (priority = 11, alwaysRun = true)
    public void testRecipient11_A_EmergencySign() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("II(A) 'Emergency' sign");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("A (II)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillEmergencyField();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 12, alwaysRun = true)
    public void testRecipient12_A_ChildrenSign() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("II(O) 'Children' sign");
        recipientCommonPage.fillSpecificBirthDateField("01.01.2005\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("A (II)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 13, alwaysRun = true)
    public void testRecipient13_A_More4YearsInWaitingList() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("II(A) More 4 years in WL");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("A (II)");
        recipientClinicalPage.fillAbBlock("01.01.2011\n", "50");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 14, alwaysRun = true)
    public void testRecipient14_A_HlaMismatch000() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("II(A) HLA mismatch 000");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("A (II)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 15, alwaysRun = true)
    public void testRecipient15_A_Homozygosity2Alley() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("II(A) Homozygosity by 2 allele");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("A (II)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "1", "3", "3", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 16, alwaysRun = true)
    public void testRecipient16_A_KidneyAndLiver() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("II(A) Kidney+Liver");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("A (II)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillSeveralTransplantationsField("2");
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 17, alwaysRun = true)
    public void testRecipient17_B_NoAdditionalConditions() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("III(B) no addit. conditions");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("B (III)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 18, alwaysRun = true)
    public void testRecipient18_B_KidneyAndPancreas() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("III(B) Kidney+Pancreas");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("B (III)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillSeveralTransplantationsField("1");
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 19, alwaysRun = true)
    public void testRecipient19_B_EmergencySign() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("III(B) 'Emergency' sign");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("B (III)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillEmergencyField();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 20, alwaysRun = true)
    public void testRecipient20_B_ChildrenSign() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("III(B) 'Children' sign");
        recipientCommonPage.fillSpecificBirthDateField("01.01.2005\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("B (III)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 21, alwaysRun = true)
    public void testRecipient21_B_More4YearsInWaitingList() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("III(B) More 4 years in WL");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("B (III)");
        recipientClinicalPage.fillAbBlock("01.01.2011\n", "50");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 22, alwaysRun = true)
    public void testRecipient22_B_HlaMismatch000() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("III(B) HLA mismatch 000");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("B (III)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 23, alwaysRun = true)
    public void testRecipient23_B_Homozygosity2Alley() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("III(B) Homozygosity by 2 allele");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("B (III)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "1", "3", "3", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 24, alwaysRun = true)
    public void testRecipient24_B_KidneyAndLiver() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("III(B) Kidney+Liver");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("B (III)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillSeveralTransplantationsField("2");
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 25, alwaysRun = true)
    public void testRecipient25_AB_NoAdditionalConditions() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("IV(AB) no addit. conditions");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("AB (IV)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 26, alwaysRun = true)
    public void testRecipient26_AB_KidneyAndPancreas() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("IV(AB) Kidney+Pancreas");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("AB (IV)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillSeveralTransplantationsField("1");
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 27, alwaysRun = true)
    public void testRecipient27_AB_EmergencySign() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("IV(AB) 'Emergency' sign");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("AB (IV)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillEmergencyField();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 28, alwaysRun = true)
    public void testRecipient28_AB_ChildrenSign() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("IV(AB) 'Children' sign");
        recipientCommonPage.fillSpecificBirthDateField("01.01.2005\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("AB (IV)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 29, alwaysRun = true)
    public void testRecipient29_AB_More4YearsInWaitingList() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("IV(AB) More 4 years in WL");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("AB (IV)");
        recipientClinicalPage.fillAbBlock("01.01.2011\n", "50");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 30, alwaysRun = true)
    public void testRecipient30_AB_HlaMismatch000() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("IV(AB) HLA mismatch 000");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("AB (IV)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 31, alwaysRun = true)
    public void testRecipient31_AB_Homozygosity2Alley() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("IV(AB) Homozygosity by 2 allele");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("AB (IV)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "1", "3", "3", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 32, alwaysRun = true)
    public void testRecipient32_AB_KidneyAndLiver() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("IV(AB) Kidney+Liver");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980\n");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("AB (IV)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "1", "2", "1", "2");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillSeveralTransplantationsField("2");
        recipientConsiliumPage.fillOverallFields();
    }
}
