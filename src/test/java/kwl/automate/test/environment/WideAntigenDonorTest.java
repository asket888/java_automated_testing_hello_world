package kwl.automate.test.environment;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class WideAntigenDonorTest extends BaseTest {

    @Test (priority = 1)
    public void createDonor1_O_A9_A28_B51_B52_DR10_DR10() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("1. A9_A28_B51_B52_DR10_DR10");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("9", "28", "51", "52", "10", "10");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 2)
    public void createDonor2_O_A10_A36_B7_B15_DR5_DR5() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("2. A10_A36_B7_B15_DR5_DR5");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("10", "36", "7", "15", "5", "5");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 3)
    public void createDonor3_O_A29_A30_B62_B42_DR10_DR10() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("3. A29_A30_B62_B42_DR10_DR10");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("29", "30", "62", "42", "10", "10");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 4)
    public void createDonor4_O_A31_A32_B16_B16_DR5_DR5() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("4. A31_A32_B16_B16_DR5_DR5");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("31", "32", "16", "16", "5", "5");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 5)
    public void createDonor5_O_A33_A74_B60_B61_DR4_DR11() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("5. A33_A74_B60_B61_DR4_DR11");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("33", "74", "60", "61", "4", "11");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 6)
    public void createDonor6_O_A36_A80_B46_B75() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("6. A36_A80_B46_B75");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("36", "80", "46", "75");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 7)
    public void createDonor7_O_A25_A26_B44_B45() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("7. A25_A26_B44_B45");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("25", "26", "44", "45");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 8)
    public void createDonor8_O_A66_A34_B64_B65() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("8. A66_A34_B64_B65");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("66", "34", "64", "65");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 9)
    public void createDonor9_O_A10_A10_B57_B58() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("9. A10_A10_B57_B58");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("10", "10", "57", "58");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 10)
    public void createDonor10_O_A10_A66_B49_B50() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("10. A10_A66_B49_B50");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("10", "66", "49", "50");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 11)
    public void createDonor11_O_A43_A66_B76_B77() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("11. A43_A66_B76_B77");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("43", "66", "76", "77");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 12)
    public void createDonor12_O_A43_A43_B54_B55() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("12. A43_A43_B54_B55");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("43", "43", "54", "55");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 13)
    public void createDonor13_O_A10_A10_B56_B67() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("13. A10_A10_B56_B67");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("10", "10", "56", "67");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 14)
    public void createDonor14_O_A34_A34_B82_B83() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("14. A34_A34_B82_B83");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("34", "34", "82", "83");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 15)
    public void createDonor15_O_A25_A25_B41_B48() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("15. A25_A25_B41_B48");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("25", "25", "41", "48");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 16)
    public void createDonor16_O_A1_A1_B35_B59() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("16. A1_A1_B35_B59");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("1", "1", "35", "59");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 17)
    public void createDonor17_O_A1_A1_B27_B52() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("17. A1_A1_B27_B52");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("1", "1", "27", "52");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }

    @Test (priority = 18)
    public void createDonor18_O_A36_A80_B72_B76() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("18. A36_A80_B72_B76");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("36", "80", "72", "76");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }
}
