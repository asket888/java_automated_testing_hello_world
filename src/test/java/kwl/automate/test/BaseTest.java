package kwl.automate.test;

import kwl.automate.pages.*;
import kwl.automate.pages.data.entity.LoginEntity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest extends LoginEntity {

    protected WebDriver driver;

    protected LoginPage loginPage;
    protected RemovePage removePage;
    protected MainMenuPage mainMenuPage;
    protected DonorInfoPage donorInfoPage;
    protected CalculatorPage calculatorPage;
    protected SessionMenuPage sessionMenuPage;
    protected RecipientCommonPage recipientCommonPage;
    protected RecipientClinicalPage recipientClinicalPage;
    protected RecipientConsiliumPage recipientConsiliumPage;

    @BeforeClass
    protected void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        removePage = new RemovePage(driver);
        mainMenuPage = new MainMenuPage(driver);
        donorInfoPage = new DonorInfoPage(driver);
        calculatorPage = new CalculatorPage(driver);
        sessionMenuPage = new SessionMenuPage(driver);
        recipientCommonPage = new RecipientCommonPage(driver);
        recipientClinicalPage = new RecipientClinicalPage(driver);
        recipientConsiliumPage = new RecipientConsiliumPage(driver);

        // Can't provide real values that's why secured information this way
        loginPage.login(urlValue("setUrl"), loginValue("setLogin"), passwordValue("setPassword"));
    }

    @AfterClass
    protected void shutDown() {
        driver.quit();
    }
}
