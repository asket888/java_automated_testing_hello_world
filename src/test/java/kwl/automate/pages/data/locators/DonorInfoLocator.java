package kwl.automate.pages.data.locators;

public interface DonorInfoLocator {

    // donor number locator
    String numberLocator = "//*[@id='donorNumber']";

    // donor illness history locator
    String historyLocator = "//*[@id='diseaseHistoryNumber']";

    // donor guide organisation locator
    String guideHfLocator = "//*[@id='organizationNameInput']";
    String guideHfDictionaryStep1 = "//*[@id='61373']/i";
    String guideHfDictionaryStep2 = "//*[@id='76581']/i";
    String guideHfDictionaryStep3 = "//*[@id='4453_anchor']";
    String guideHfAcceptButtonLocator = "//*[@id='acceptButton']";

    // donor last name locator
    String lastNameLocator = "//*[@id='lastName']";

    // donor first name locator
    String firstNameLocator = "//*[@id='firstName']";

    // donor second name locator
    String secondNameLocator = "//*[@id='secondName']";

    // donor birth date locator
    String birthDateLocator = "//*[@id='birthDateInput']";

    // donor blood group locator
    String bloodGroupLocator = "//*[@id='bloodGroupSelect']/../div";

    // donor blood rhesus locator
    String bloodRhesusLocator = "//*[@id='bloodRhesusInput']/../div/div[1]";

    // donor hla block locators
    String hla0Locator = "//*[@id='hla0']";
    String hla1Locator = "//*[@id='hla1']";
    String hla2Locator = "//*[@id='hla2']";
    String hla3Locator = "//*[@id='hla3']";
    String hla4Locator = "//*[@id='hla4']";
    String hla5Locator = "//*[@id='hla5']";
    String hla6Locator = "//*[@id='hla6']";
    String hla7Locator = "//*[@id='hla7']";
    String hla8Locator = "//*[@id='hla8']";
    String hla9Locator = "//*[@id='hla9']";
    String hla10Locator = "//*[@id='hla10']";
    String hla11Locator = "//*[@id='hla11']";

    // save to draft button locator
    String saveAsDraftButton = "//*[@id='save-as-draft']/span";

    // save button locator on donor info page
    String saveButtonDonorPage = "//*[@id='save']";
}
