package kwl.automate.pages;

import kwl.automate.pages.data.entity.LoginEntity;
import kwl.automate.pages.data.locators.LoginLocator;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseDriver implements LoginLocator {

    public LoginPage(WebDriver driver) {super(driver);}

    public void login(String url, String login, String value) {

        LoginEntity entity = new LoginEntity();

        // Go to the KWL authorisation page
        setUrl(url);

        // Find the text input element by its id and type login
        setLocatorByXpathAndSendKey(loginLocator, login);

        // Find the text input element by its id and type password
        setLocatorByXpathAndSendKey(passwordLocator, value);

        // Click enter button
        setLocatorByXpathAndClick(loginButtonLocator);
    }
}
