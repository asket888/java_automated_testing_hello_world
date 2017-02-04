package kwl.automate.test.overall;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class DonorInfoTest extends BaseTest {

    @Test (invocationCount = 2)
    public void testDonorInfoPageAllFieldsFilling() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
        sessionMenuPage.goToDonorInfoPage();
        donorInfoPage.fillAllFields();
    }
}
