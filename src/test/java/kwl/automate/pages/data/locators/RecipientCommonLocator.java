package kwl.automate.pages.data.locators;

public interface RecipientCommonLocator {

    // patient's Last name field locator
    String lastNameLocator = "//*[@id='lastName']";

    // patient's First name field locator
    String firstNameLocator = "//*[@id='firstName']";

    // patient's Second name field locator
    String secondNameLocator = "//*[@id='secondName']";

    // patient's birth date field locator
    String birthDateLocator = "//*[@id='birthDateInput']";

    // patient's disability field locator
    String disabilityLocator = "//*[@id='disability']/../div";

    // patient's passport number field locator
    String passportNumLocator = "//*[@id='passportNumberInput']";

    // patient's passport issuer field locator
    String passportIssuerLocator = "//*[@id='passportIssuer']";

    // patient's passport issuer date field locator
    String passportIssueDateLocator = "//*[@id='passportIssueDate']";

    // patient's personal number field locator
    String personalNumLocator = "//*[@id='personalNumberInput']";

    // patient's address from dictionary locator
    String addressTersonLocator = "//*[@id='cityNameInput']";
    String addressTersonAustria = "//*[@id='86189_anchor']";
    String addressTersonBelarus = "//*[@id='61373']/i";
    String addressTersonBrestRegion = "//*[@id='58844']/i";
    String addressTersonBrestRegionTown = "//*[@id='61369_anchor']";
    String addressTersonVitebskRegion = "//*[@id='61374']/i";
    String addressTersonVitebskRegionTown = "//*[@id='68700_anchor']";
    String addressTersonGomelRegion = "//*[@id='68706']/i";
    String addressTersonGomelRegionTown = "//*[@id='71796_anchor']";
    String addressTersonGrodnoRegion = "//*[@id='71812']/i";
    String addressTersonGrodnoRegionTown = "//*[@id='76572_anchor']";
    String addressTersonMinsk = "//*[@id='76581_anchor']";
    String addressTersonMinskRegion = "//*[@id='76594']/i";
    String addressTersonMinskRegionTown = "//*[@id='82364_anchor']";
    String addressTersonMogilevRegion = "//*[@id='82377']/i";
    String addressTersonMogilevRegionTown = "//*[@id='86151_anchor']";
    String acceptButtonTersonLocator = "//*[@id='acceptButton']";

    // patient's address text field locator
    String addressTextLocator = "//*[@id='afterDirectory1']";

    // additional address text field locator
    String addressAdditionalLocator = "//*[@id='additionalAddress']";

    // patient's phone number field locator
    String phoneNumberLocator = "//*[@id='phoneNumber']";

    // patient's dialysis center dictionary locators
    String dialysisCenterLocator = "//*[@id='organizationNameInput']";
    String dialysisCenterStep1 = "//*[@id='799']/i";
    String dialysisCenterStep2 = "//*[@id='4567']/i";
    String dialysisCenterStep3 = "//*[@id='340_anchor']";
    String acceptButtonDCLocator = "//*[@id='acceptButton']";

    // patient's notes field locator
    String notesLocator = "//*[@id='afterDirectory2']";

    // save button locator
    String saveButtonLocator = "//*[@id='save']";
}
