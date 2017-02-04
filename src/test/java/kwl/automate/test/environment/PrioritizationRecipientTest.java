package kwl.automate.test.environment;

import kwl.automate.pages.data.locators.RecipientCommonLocator;
import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class PrioritizationRecipientTest extends BaseTest implements RecipientCommonLocator {

    @Test (priority = 1)
    public void testRecipient1_O_0MismatchByA() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) 0 mist. by A Minsk");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSpecificAddressTersonField(addressTersonMinsk);
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "8", "9", "8", "9");
        recipientClinicalPage.fillAbBlock("100");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 2, alwaysRun = true)
    public void testRecipient2_O_0MismatchByB() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) 0 mist. by B Minsk/reg");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSpecificAddressTersonField(addressTersonMinskRegion, addressTersonMinskRegionTown);
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("8", "9", "3", "4", "8", "9");
        recipientClinicalPage.fillAbBlock("01.01.2017", "81");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillEmergencyField();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 3, alwaysRun = true)
    public void testRecipient3_O_0MismatchByDR() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) 0 mist. by DR Brest/reg");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSpecificAddressTersonField(addressTersonBrestRegion, addressTersonBrestRegionTown);
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("8", "9", "8", "9", "5", "6");
        recipientClinicalPage.fillAbBlock("80");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 4, alwaysRun = true)
    public void testRecipient4_O_0MismatchByAllLocus() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) 0 mist. A,B,DR Vitebsk/reg");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSpecificAddressTersonField(addressTersonVitebskRegion, addressTersonVitebskRegionTown);
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        recipientClinicalPage.fillAbBlock("79");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 5, alwaysRun = true)
    public void testRecipient5_O_1MismatchByAllLocus() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) 1 mist. A,B,DR Grodno/reg");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSpecificAddressTersonField(addressTersonGrodnoRegion, addressTersonGrodnoRegionTown);
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "9", "3", "9", "5", "9");
        recipientClinicalPage.fillAbBlock("21");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 6, alwaysRun = true)
    public void testRecipient6_O_HomoByB() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) Homo. by B Gomel/reg");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSpecificAddressTersonField(addressTersonGomelRegion, addressTersonGomelRegionTown);
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "9", "3", "3", "8", "9");
        recipientClinicalPage.fillAbBlock("20");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 7, alwaysRun = true)
    public void testRecipient7_O_HomoByDR() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) Homo. by DR Mogilev/reg");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSpecificAddressTersonField(addressTersonMogilevRegion, addressTersonMogilevRegionTown);
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "9", "8", "9", "5", "5");
        recipientClinicalPage.fillAbBlock("19");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 8, alwaysRun = true)
    public void testRecipient8_O_HomoByDRAndB() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("I(O) Homo. by B-DR Minsk");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSpecificAddressTersonField(addressTersonMinsk);
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("8", "9", "3", "3", "5", "5");
        recipientClinicalPage.fillAbBlock("0");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }
}
