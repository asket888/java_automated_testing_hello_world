package kwl.automate.pages.data.entity;

import kwl.automate.pages.data.util.CurrentDateUtil;
import kwl.automate.pages.data.util.MathRandomUtil;
import kwl.automate.pages.data.util.RandomValueUtil;

public class RecipientClinicalEntity {

    private MathRandomUtil mathRandom = new MathRandomUtil();
    private RandomValueUtil randomValue = new RandomValueUtil();
    private CurrentDateUtil currentDate = new CurrentDateUtil();

    // random blood group value
    public String getBloodGroup() {return "//*[@id='bloodGroupSelect']/..//*[@data-value='" +
            randomValue.getBloodGroup() + "']";}

    public String getSpecificBloodGroup(String bloodGroup) {return "//*[@id='bloodGroupSelect']/..//*[@data-value='" +
            bloodGroup + "']";}

    // random blood rhesus value
    public String getBloodRhesus() {return "//*[@id='bloodRhesusInput']/..//*[@data-value='" +
            randomValue.getBloodRhesus() + "']";}

    // random hla value
    public String getHla() {return randomValue.getHla();}

    // AB block values
    public String getAbType() {return "//*[@id='analysisType0']/..//*[@data-value='Уровень AT']";}
    public String getAbDate() {return currentDate.getCurrentDate() + "\n";}
    public String getAbLevel() {return String.valueOf(mathRandom.getMathRandom(100, 0));}
    public String getAbNum() {return String.valueOf(mathRandom.getMathRandom(999999, 1));}

    // specificity block values
    public String getSpecificityLocus() {return "//*[@id='specificityLocus']/..//*[@data-value='" +
            mathRandom.getMathRandom(6, 1) + "']";}
    public String getSpecificityLevel() {return String.valueOf(mathRandom.getMathRandom(99, 1));}
    public String getSpecificityMfi() {return String.valueOf((double)(mathRandom.getMathRandom(99999999, 10000000))/1000);}

    // diagnosis date value
    public String getDiagnosisDate() {return randomValue.getRandomDate();}

    // allergoanamnesis and diagnosis text values
    public String getAllergoAnamnesis() {return randomValue.getText();}
    public String getDiagnosisText() {return randomValue.getText();}

    // diabetes value
    public String getDiabetes = "//*[@id='diabetesType" + mathRandom.getMathRandom(2, 0)+ "']";

    // dialysis block values
    public String getDialysis() {return "//*[@id='dialysisSelect']/..//*[@data-value='Гемодиализ']";}
    public String getDialysisDate() {return randomValue.getRandomDate();}

    // transfusion block values
    public String getTransfusionCount() {return String.valueOf(mathRandom.getMathRandom(99, 1));}
    public String getTransfusionDate() {return randomValue.getRandomDate();}
    public String getTransfusionText() {return randomValue.getText();}

    // transplantation date value
    public String getTransplantationDate() {return randomValue.getRandomDate();}

    // notes field locator and value
    public String getNotes () {return randomValue.getText();}
}
