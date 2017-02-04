package kwl.automate.pages.data.locators;

public interface SessionMenuLocator {

    // transfer to new session page button locator
    String newSessionPageLocator = "//*[@id='newSession']";

    // cross match with all recipients are negative checkbox locator
    String negativeCrossMatchLocator = "//*[@id='negative-cross-match']";

    // save button locator on exclusion page
    String saveButtonCrossMatchPageLocator = "//*[@id='save-button']";
}
