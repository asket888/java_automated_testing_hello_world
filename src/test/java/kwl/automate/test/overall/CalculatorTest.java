package kwl.automate.test.overall;

import kwl.automate.test.BaseTest;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest {

    @Test (invocationCount = 1)
    public void testCalculator() throws InterruptedException {

        mainMenuPage.goToCalculatorPage();
        calculatorPage.calculate();
        mainMenuPage.goToMainMenuPage();
    }
}
