package kwl.automate.test.overall;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class ComplexCardTest extends BaseTest {

    @Test (invocationCount = 2)
    public void testCreationCardWithAllFieldsFilling() throws InterruptedException {

        mainMenuPage.goToNewPatientCreationPage();
        recipientCommonPage.fillAllFields();
        recipientClinicalPage.fillAllFields();
        recipientConsiliumPage.fillAllFields();
        mainMenuPage.goToMainMenuPage();
    }
}
