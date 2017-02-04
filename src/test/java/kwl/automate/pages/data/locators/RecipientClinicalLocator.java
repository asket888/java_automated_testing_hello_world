package kwl.automate.pages.data.locators;

public interface RecipientClinicalLocator {

    // blood group locator
    String bloodGroupLocator = "//*[@id='bloodGroupSelect']/../div";

    // blood rhesus locator
    String bloodRhesusLocator = "//*[@id='bloodRhesusInput']/../div/div[1]";

    // hla block locators
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

    // antibody block locators
    String addAntibodyLocator = "//*[@id='addAntibody']";
    String abTypeLocator = "//*[@id='analysisType0']/../div/div[1]";
    String abDateLocator = "//*[@id='abDateLabel']/../input";
    String abLevelLocator = "//*[@id='antiBodyValue0']";
    String abNumLocator = "//*[@id='antiBodyNumber0']";

    // specificity block locators
    String addSpecificity = "//*[@id='addSpecificity']";

    String specLocusLocator = "//*[@id='specificityLocus']/../div";

    String specifityLocator = "//*[@id='specificityValue0']";

    String specMfiLocator = "//*[@id='specificityMfi0']";

    // diagnosis and allergoanamnesis block locators
    String diagnosisDateLocator = "//*[@id='conditionDateInput']";

    String allergoAnamnesisLocator = "//*[@id='allergoAnamnesis']";

    String diagnosisTextLocator = "//*[@id='diagnosisText']";

    // diagnosis dictionary locators
    String diagnosisDictionaryLocator = "//*[@id='diagnosis0']";
    String diagnosisStep1Value = "//*[@id='1214']/i";
    String diagnosisStep2Value = "//*[@id='6891_anchor']";
    String diagnosisAcceptButtonLocator = "//*[@id='acceptButton']";

    String dialysisLocator = "//*[@id='dialysisSelect']/../div/div[1]";

    String dialysisDateLocator = "//*[@id='dialysisDateInput']";

    // transfusion block locators
    String transfusionCountLocator = "//*[@id='bloodTransfusionCountInput']";
    String transfusionDateLocator = "//*[@id='transfusionDateInput']";
    String transfusionTextLocator = "//*[@id='transfusionTextInput']";

    // transplantation date locator
    String transplantationDateLocator = "//label[text()='Transplantation date']/..//input";

    // notes field locator and value
    String notesLocator = "//*[@id='notesInput']";

    // save button locator
    String saveButtonLocator = "//*[@id='save']";

    // transfer to consilium conclusion page button locator
    String consiliumPageLocator = "//*[@id='consilium']";
}
