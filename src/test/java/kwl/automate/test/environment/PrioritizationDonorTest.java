package kwl.automate.test.environment;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class PrioritizationDonorTest extends BaseTest {

    @Test
    public void createDonor1_O_FromMinsk() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillSpecificLastNameField("Prior. Donor I(O)-Minsk");
        donorInfoPage.fillSpecificBirthDateField("01.01.1985\n");
        donorInfoPage.fillSpecificBloodGroupField("O (I)");
        donorInfoPage.fillSpecificHlaBlock("1", "2", "3", "4", "5", "6");
        donorInfoPage.fillOverallFields();
        donorInfoPage.clickSaveButton();
        sessionMenuPage.selectNegativeCrossMatchCheckbox();
        sessionMenuPage.clickSaveButtonOnCrossMatchPage();
    }
}
