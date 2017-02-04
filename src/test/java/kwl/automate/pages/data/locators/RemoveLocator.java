package kwl.automate.pages.data.locators;

public interface RemoveLocator {

    // patient card remove locators
    String firstPatientLocator = "//*[@class='table-hover']/tbody/tr[1]";
    String consiliumPageButtonLocator = "//*[@id='consilium']";
    String deleteConsiliumButtonLocator = "//*[@id='deleteConclusion']/span";
    String deleteConsiliumConfirmButtonLocator = "//*[@id='confirmDeleteConsiliumDialog']";
    String actionButtonLocator = "//*[@id='action']/span[1]";
    String deleteCardButtonLocator = "//*[@id='deletePatient']";
    String deleteConfirmButtonLocator = "//*[@id='confirmDeleteDialog']";

    // session remove locators
    String firstSessionLocator = "//*[@class='table table-hover']/tbody/tr[1]";
    String deleteSessionButtonLocator = "//*[@id='deleteSession']";
}

