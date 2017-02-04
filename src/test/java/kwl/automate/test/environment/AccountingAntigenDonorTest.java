package kwl.automate.test.environment;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class AccountingAntigenDonorTest extends BaseTest {

    @Test
    public void createDonor_O_A8_B9_Cw7_Bw1_DR3_DQ8() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("Excl.HLA A8_B9_Cw7_Bw1_DR3_DQ8");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("8", "8", "9", "9", "7", "7", "1", "1", "3", "3", "8", "8");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }
}
