package kwl.automate.test.overall;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class RemoveCardTest extends BaseTest {

    @Test (invocationCount = 10)
    public void testRemoveCard() throws InterruptedException {

        removePage.removeCard();
    }
}
