package kwl.automate.pages.data.locators;

public interface RecipientConsiliumLocator {

    // consilium date field locator
    String consiliumDateLocator = "//*[@id='dateLabel']/../input";

    // medical indication field locator
    String medicalIndicationLocator = "//*[@id='medicalIndication']/../div/div[1]";

    // consilium conclusion field locator
    String conclusionLocator = "//*[@id='conclusion']/../div/div[1]";

    // recommended field locator
    String recommendedLocator = "//*[@id='recommended0']/../div/div[1]";

    // additional recommended field locator
    String additionalRecommendedLocator = "//*[@id='recommendedAdditional']";

    // several transplantation field locator
    String severalTransplantationLocator = "//*[@id='transplants']/../div/div[1]";

    // emergency field locator
    String emergencyLocator = "//*[@id='emergency']/../div/div[1]";

    // comment field locator
    String commentLocator = "//*[@id='comment']";

    // guide organization locator
    String centerNameLocator = "//*[@id='organization']/../div/div[1]";
    String centerNameValueLocator = "//*[@id='organization']/..//*[@data-value='4567']";

    // consilium members locator
    String consiliumMemberLocator = "//*[@id='signers0']/../div/div[1]";
    String consiliumMemberValueLocator = "//*[@id='signers0']/..//*[@data-value='8']";

    // save button locator
    String saveButtonLocator = "//*[@id='save']";
}
