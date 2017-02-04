package kwl.automate.test.environment;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class WideAntigenRecipientTest extends BaseTest {

    @Test (priority = 1)
    public void createRecipient1_O_A19_A9_B8_B52_DR2_DR1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("1.a A19_A9_B8_B52_DR2_DR1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("19", "9", "8", "52", "2", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 2)
    public void createRecipient2_O_A68_A23_B5_B12_DR10_DR11() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("1.b A68_A23_B5_B12_DR10_DR11");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("68", "23", "5", "12", "10", "11");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 3)
    public void createRecipient3_O_A24_A24_B51_B5_DR1_DR1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("1.c A24_A24_B51_B5_DR1_DR1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("24", "24", "51", "5", "1", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 4)
    public void createRecipient4_O_A69_A30_B52_B53_DR10_DR1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("1.d A69_A30_B52_B53_DR10_DR1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("69", "30", "52", "53", "10", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 5)
    public void createRecipient5_O_A1_A25_B81_B46_DR5_DR11() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("2.a A1_A25_B81_B46_DR5_DR11");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "25", "81", "46", "5", "11");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test (priority = 6)
    public void createRecipient6_O_A26_A43_B70_B73_DR12_DR5() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("2.b A26_A43_B70_B73_DR12_DR5");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("26", "43", "70", "73", "12", "5");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 7)
    public void createRecipient7_O_A43_A36_B71_B7_DR11_DR11() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("2.c A43_A36_B71_B7_DR11_DR11");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("43", "36", "71", "7", "11", "11");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 8)
    public void createRecipient8_O_A66_A66_B72_B75_DR12_DR12() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("2.d A66_A66_B72_B75_DR12_DR12");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("66", "66", "72", "75", "12", "12");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 9)
    public void createRecipient9_O_A43_A34_B63_B46_DR4_DR1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("2.e A43_A34_B63_B46_DR4_DR1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("43", "34", "63", "46", "4", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 10)
    public void createRecipient10_O_A19_A19_B7_B15_DR10_DR1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("3.a A19_A19_B7_B15_DR10_DR1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("19", "19", "7", "15", "10", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 11)
    public void createRecipient11_O_A31_A19_B73_B62_DR1_DR1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("3.b A31_A19_B73_B62_DR1_DR1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("31", "19", "73", "62", "1", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 12)
    public void createRecipient12_O_A1_A19_B38_B1_DR12_DR1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("4.a A1_A19_B38_B1_DR12_DR1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "19", "38", "1", "12", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 13)
    public void createRecipient13_O_A31_A19_B39_B39_DR11_DR12() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("4.b A31_A19_B39_B39_DR11_DR12");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("31", "19", "39", "39", "11", "12");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 14)
    public void createRecipient14_O_A19_A19_B61_B40_DR9_DR12() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("5.a A19_A19_B61_B40_DR9_DR12");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("19", "19", "61", "40", "9", "12");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 15)
    public void createRecipient15_O_A9_A10_B40_B41_DR5_DR4() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("5.b A9_A10_B40_B41_DR5_DR4");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("9", "10", "40", "41", "5", "4");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 16)
    public void createRecipient16_O_A1_A2_B15_B1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("6.a A1_A2_B15_B1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "15", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 17)
    public void createRecipient17_O_A36_A1_B71_B75() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("6.b A36_A1_B71_B75");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("36", "1", "71", "75");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 18)
    public void createRecipient18_O_A43_A1_B12_B1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("7. A43_A1_B12_B1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("43", "1", "12", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 19)
    public void createRecipient19_O_A43_A1_B1_B14() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("8. A43_A1_B1_B14");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("43", "1", "1", "14");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 20)
    public void createRecipient20_O_A43_A26_B17_B17() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("9. A43_A26_B17_B17");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("43", "26", "17", "17");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 21)
    public void createRecipient21_O_A43_A1_B21_B17() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("10. A43_A1_B21_B17");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("43", "1", "21", "17");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 22)
    public void createRecipient22_O_A10_A10_B15_B46() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("11. A10_A10_B15_B46");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("10", "10", "15", "46");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 23)
    public void createRecipient23_O_A43_A26_B22_B56() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("12. A43_A26_B22_B56");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("43", "26", "22", "56");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 24)
    public void createRecipient24_O_A10_A26_B22_B55() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("13. A10_A26_B22_B55");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("10", "26", "22", "55");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 25)
    public void createRecipient25_O_A34_A43_B12_B1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("14. A34_A43_B12_B1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("34", "43", "12", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 26)
    public void createRecipient26_O_A25_A43_B40_B1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("15. A25_A43_B40_B1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("25", "43", "40", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 27)
    public void createRecipient27_O_A1_A1_B78_B8() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("16. A1_A1_B78_B8");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "1", "78", "8");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 28)
    public void createRecipient28_O_A1_A1_B47_B53() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("17. A1_A1_B47_B53");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "1", "47", "53");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }

    @Test  (priority = 29)
    public void createRecipient29_O_A1_A2_B46_B1() throws InterruptedException {

        mainMenuPage.goToMainMenuPage();
        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillSpecificLastNameField("18. A1_A2_B46_B1");
        recipientCommonPage.fillSpecificBirthDateField("01.01.1980");
        recipientCommonPage.fillSimpleAddressTersonField();
        recipientCommonPage.fillOverallFields();
        recipientClinicalPage.fillSpecificBloodGroupField("O (I)");
        recipientClinicalPage.fillSpecificHlaBlock("1", "2", "46", "1");
        recipientClinicalPage.fillAbBlock("50");
        recipientClinicalPage.fillOverallFields();
        recipientConsiliumPage.fillOverallFields();
    }
}
