package kwl.automate.test.overall;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class SimpleCardTest extends BaseTest {

    @Test (invocationCount = 2)
    public void testCreationCardWithMandatoryFieldsFilling() throws InterruptedException {

        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillMandatoryFields();
        recipientClinicalPage.fillMandatoryFields();
        mainMenuPage.goToMainMenuPage();
    }
}
