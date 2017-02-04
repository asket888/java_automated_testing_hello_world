package kwl.automate.test.overall;

import kwl.automate.test.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveSessionTest extends BaseTest {

    @BeforeMethod
    public void goToRecipientSelectionPage() throws InterruptedException {

        mainMenuPage.goToRecipientSelectionPage();
    }

    @Test (invocationCount = 10)
    public void testRemoveSession() throws InterruptedException {

        removePage.removeSession();
    }
}
