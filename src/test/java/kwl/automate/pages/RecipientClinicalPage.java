package kwl.automate.pages;

import kwl.automate.pages.data.entity.RecipientClinicalEntity;
import kwl.automate.pages.data.locators.RecipientClinicalLocator;
import org.openqa.selenium.WebDriver;

public class RecipientClinicalPage extends BaseDriver implements RecipientClinicalLocator{

    public RecipientClinicalPage(WebDriver driver) {super(driver);}

    private RecipientClinicalEntity entity = new RecipientClinicalEntity();

    public void fillAllFields() throws InterruptedException {

        // blood group field filling
        setLocatorByXpathAndClick(bloodGroupLocator);
        waitElement(entity.getBloodGroup());
        setLocatorByXpathAndClick(entity.getBloodGroup());
        Thread.sleep(500);

        // RH factor field filling
        setLocatorByXpathAndClick(bloodRhesusLocator);
        waitElement(entity.getBloodRhesus());
        setLocatorByXpathAndClick(entity.getBloodRhesus());
        Thread.sleep(500);

        // HLA phenotype block filling
        setLocatorByXpathAndSendKey(hla0Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla1Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla2Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla3Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla4Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla5Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla6Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla7Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla8Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla9Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla10Locator, entity.getHla());
        setLocatorByXpathAndSendKey(hla11Locator, entity.getHla());
        Thread.sleep(500);

        // antibody level block filling
        setLocatorByXpathAndClick(addAntibodyLocator);
        waitElement(abTypeLocator);
        setLocatorByXpathAndClick(abTypeLocator);
        waitElement(entity.getAbType());
        setLocatorByXpathAndClick(entity.getAbType());
        waitElement(abLevelLocator);
        setLocatorByXpathAndSendKey(abLevelLocator, entity.getAbLevel());
        waitElement(abNumLocator);
        setLocatorByXpathAndSendKey(abNumLocator, entity.getAbNum());
        Thread.sleep(500);

        // specificity block filling
        setLocatorByXpathAndClick(addSpecificity);
        waitElement(specLocusLocator);
        setLocatorByXpathAndClick(specLocusLocator);
        waitElement(entity.getSpecificityLocus());
        setLocatorByXpathAndClick(entity.getSpecificityLocus());
        waitElement(specifityLocator);
        setLocatorByXpathAndSendKey(specifityLocator, entity.getSpecificityLevel());
        waitElement(specMfiLocator);
        setLocatorByXpathAndSendKey(specMfiLocator, entity.getSpecificityMfi());
        Thread.sleep(500);

        // allergoanamnesis block filling
        setLocatorByXpathAndSendKey(diagnosisDateLocator, entity.getDiagnosisDate());
        waitElement(allergoAnamnesisLocator);
        setLocatorByXpathAndSendKey(allergoAnamnesisLocator, entity.getAllergoAnamnesis());
        Thread.sleep(500);

        // diagnosis directory field filling
        setLocatorByXpathAndClick(diagnosisDictionaryLocator);
        waitElement(diagnosisStep1Value);
        Thread.sleep(500);
        setLocatorByXpathAndClick(diagnosisStep1Value);
        waitElement(diagnosisStep2Value);
        Thread.sleep(500);
        setLocatorByXpathAndClick(diagnosisStep2Value);
        waitElement(diagnosisAcceptButtonLocator);
        Thread.sleep(500);
        setLocatorByXpathAndClick(diagnosisAcceptButtonLocator);
        Thread.sleep(500);

        // diagnosis block filling
        setLocatorByXpathAndSendKey(diagnosisTextLocator, entity.getDiagnosisText());
        Thread.sleep(500);

        // diabetes filling
        setLocatorByXpathAndClick(entity.getDiabetes);
        Thread.sleep(500);

        // transfusion fields filling
        setLocatorByXpathAndSendKey(transfusionCountLocator, entity.getTransfusionCount());
        waitElement(transfusionDateLocator);
        setLocatorByXpathAndSendKey(transfusionDateLocator, entity.getTransfusionDate());
        waitElement(transfusionTextLocator);
        setLocatorByXpathAndSendKey(transfusionTextLocator, entity.getTransfusionText());
        Thread.sleep(500);

        // dialysis fields filling
        setLocatorByXpathAndClick(dialysisLocator);
        waitElement(entity.getDialysis());
        setLocatorByXpathAndClick(entity.getDialysis());
        waitElement(dialysisDateLocator);
        setLocatorByXpathAndSendKey(dialysisDateLocator, entity.getDialysisDate());
        Thread.sleep(500);

        // transplantation fields filling
        setLocatorByXpathAndSendKey(transplantationDateLocator, entity.getTransplantationDate());
        waitElement(saveButtonLocator);
        Thread.sleep(500);

        // notes field filling123
        setLocatorByXpathAndSendKey(notesLocator, entity.getNotes());
        Thread.sleep(500);

        // click save button
        setLocatorByXpathAndClick(saveButtonLocator);
        waitElement(consiliumPageLocator);
        Thread.sleep(2000);

        // go to clinical info page button
        setLocatorByXpathAndClick(consiliumPageLocator);
    }

    public void fillMandatoryFields() throws InterruptedException {

        // blood group field filling
        setLocatorByXpathAndClick(bloodGroupLocator);
        waitElement(entity.getBloodGroup());
        setLocatorByXpathAndClick(entity.getBloodGroup());
        Thread.sleep(500);

        // RH factor field filling
        setLocatorByXpathAndClick(bloodRhesusLocator);
        waitElement(entity.getBloodRhesus());
        setLocatorByXpathAndClick(entity.getBloodRhesus());
        Thread.sleep(500);

        // diagnosis directory field filling
        setLocatorByXpathAndClick(diagnosisDictionaryLocator);
        waitElement(diagnosisStep1Value);
        setLocatorByXpathAndClick(diagnosisStep1Value);
        waitElement(diagnosisStep2Value);
        setLocatorByXpathAndClick(diagnosisStep2Value);
        waitElement(diagnosisAcceptButtonLocator);
        setLocatorByXpathAndClick(diagnosisAcceptButtonLocator);
        Thread.sleep(500);

        // diabetes filling
        setLocatorByXpathAndClick(entity.getDiabetes);
        Thread.sleep(500);

        // dialysis fields filling
        setLocatorByXpathAndClick(dialysisLocator);
        waitElement(entity.getDialysis());
        setLocatorByXpathAndClick(entity.getDialysis());
        waitElement(dialysisDateLocator);
        setLocatorByXpathAndSendKey(dialysisDateLocator, entity.getDialysisDate());
        Thread.sleep(500);

        // click save button
        setLocatorByXpathAndClick(saveButtonLocator);
        Thread.sleep(1500);
    }

    public void fillOverallFields() throws InterruptedException {

        // RH factor field filling
        setLocatorByXpathAndClick(bloodRhesusLocator);
        waitElement(entity.getBloodRhesus());
        setLocatorByXpathAndClick(entity.getBloodRhesus());
        Thread.sleep(500);

        // diagnosis directory field filling
        setLocatorByXpathAndClick(diagnosisDictionaryLocator);
        waitElement(diagnosisStep1Value);
        setLocatorByXpathAndClick(diagnosisStep1Value);
        waitElement(diagnosisStep2Value);
        setLocatorByXpathAndClick(diagnosisStep2Value);
        waitElement(diagnosisAcceptButtonLocator);
        setLocatorByXpathAndClick(diagnosisAcceptButtonLocator);
        Thread.sleep(500);

        // diabetes filling
        setLocatorByXpathAndClick(entity.getDiabetes);
        Thread.sleep(500);;

        // dialysis fields filling
        setLocatorByXpathAndClick(dialysisLocator);
        waitElement(entity.getDialysis());
        setLocatorByXpathAndClick(entity.getDialysis());
        waitElement(dialysisDateLocator);
        setLocatorByXpathAndSendKey(dialysisDateLocator, entity.getDialysisDate());
        Thread.sleep(500);

        // click save button
        setLocatorByXpathAndClick(saveButtonLocator);
        waitElement(consiliumPageLocator);

        // go to clinical info page button
        Thread.sleep(1000);
        setLocatorByXpathAndClick(consiliumPageLocator);
    }

    public void fillSpecificBloodGroupField(String bloodGroupValue) throws InterruptedException {

        // blood group field filling
        setLocatorByXpathAndClick(bloodGroupLocator);
        waitElement(entity.getSpecificBloodGroup(bloodGroupValue));
        setLocatorByXpathAndClick(entity.getSpecificBloodGroup(bloodGroupValue));
        Thread.sleep(500);
    }

    public void fillSpecificHlaBlock(String a1Value, String a2Value, String b1Value, String b2Value
    ) throws InterruptedException {

        // HLA phenotype block filling
        setLocatorByXpathAndSendKey(hla0Locator, a1Value);
        setLocatorByXpathAndSendKey(hla1Locator, a2Value);
        setLocatorByXpathAndSendKey(hla2Locator, b1Value);
        setLocatorByXpathAndSendKey(hla3Locator, b2Value);
        Thread.sleep(500);
    }

    public void fillSpecificHlaBlock(String a1Value, String a2Value, String b1Value, String b2Value,
                                     String dr1Value, String dr2Value) throws InterruptedException {

        // HLA phenotype block filling
        setLocatorByXpathAndSendKey(hla0Locator, a1Value);
        setLocatorByXpathAndSendKey(hla1Locator, a2Value);
        setLocatorByXpathAndSendKey(hla2Locator, b1Value);
        setLocatorByXpathAndSendKey(hla3Locator, b2Value);
        setLocatorByXpathAndSendKey(hla8Locator, dr1Value);
        setLocatorByXpathAndSendKey(hla9Locator, dr2Value);
        Thread.sleep(500);
    }

    public void fillSpecificHlaBlock(String a1Value, String a2Value, String b1Value, String b2Value,
                                     String cw1Value, String cw2Value, String bw1Value, String bw2Value,
                                     String dr1Value, String dr2Value, String dq1Value, String dq2Value
    ) throws InterruptedException {

        // HLA phenotype block filling
        setLocatorByXpathAndSendKey(hla0Locator, a1Value);
        setLocatorByXpathAndSendKey(hla1Locator, a2Value);
        setLocatorByXpathAndSendKey(hla2Locator, b1Value);
        setLocatorByXpathAndSendKey(hla3Locator, b2Value);
        setLocatorByXpathAndSendKey(hla4Locator, cw1Value);
        setLocatorByXpathAndSendKey(hla5Locator, cw2Value);
        setLocatorByXpathAndSendKey(hla6Locator, bw1Value);
        setLocatorByXpathAndSendKey(hla7Locator, bw2Value);
        setLocatorByXpathAndSendKey(hla8Locator, dr1Value);
        setLocatorByXpathAndSendKey(hla9Locator, dr2Value);
        setLocatorByXpathAndSendKey(hla10Locator, dq1Value);
        setLocatorByXpathAndSendKey(hla11Locator, dq2Value);
        Thread.sleep(500);
    }

    public void fillAbBlock(String abLevel) throws InterruptedException {

        // Antibody level block filling
        setLocatorByXpathAndClick(addAntibodyLocator);
        waitElement(abTypeLocator);
        setLocatorByXpathAndClick(abTypeLocator);
        waitElement(entity.getAbType());
        setLocatorByXpathAndClick(entity.getAbType());
        waitElement(abLevelLocator);
        setLocatorByXpathAndSendKey(abLevelLocator, abLevel);
        waitElement(abNumLocator);
        setLocatorByXpathAndSendKey(abNumLocator, entity.getAbNum());
        Thread.sleep(500);
    }

    public void fillAbBlock(String abDate, String abLevel) throws InterruptedException {

        // Antibody level block filling
        setLocatorByXpathAndClick(addAntibodyLocator);
        waitElement(abTypeLocator);
        setLocatorByXpathAndClick(abTypeLocator);
        waitElement(entity.getAbType());
        setLocatorByXpathAndClick(entity.getAbType());
        waitElement(abDateLocator);
        setLocatorByXpathAndClear(abDateLocator);
        setLocatorByXpathAndSendKey(abDateLocator, abDate);
        waitElement(abLevelLocator);
        setLocatorByXpathAndSendKey(abLevelLocator, abLevel);
        waitElement(abNumLocator);
        setLocatorByXpathAndSendKey(abNumLocator, entity.getAbNum());
        Thread.sleep(500);
    }
}
