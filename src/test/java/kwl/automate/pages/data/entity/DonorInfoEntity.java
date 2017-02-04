package kwl.automate.pages.data.entity;

import kwl.automate.pages.data.util.MathRandomUtil;
import kwl.automate.pages.data.util.RandomValueUtil;

public class DonorInfoEntity {

    private MathRandomUtil mathRandom = new MathRandomUtil();
    private RandomValueUtil randomValue = new RandomValueUtil();

    // donor number value
    public String getDonorNumber() {return String.valueOf(mathRandom.getMathRandom(999999, 1));}

    // donor illness history value
    public String getDonorIllnessHistory() {return "AA/" + mathRandom.getMathRandom(999999, 1);}

    // donor last name value
    public String getDonorLastName() {return randomValue.getLastName();}

    // donor first name value
    public String getDonorFirstName() {return randomValue.getFirstName();}

    // donor second name value
    public String getDonorSecondName() {return randomValue.getSecondName();}

    // donor birth date value
    public String getDonorBirthDate() {return randomValue.getRandomDate();}

    // donor gender value
    public String getDonorGender() {return "//*[@id='genderRatio" + mathRandom.getMathRandom(2, 1) + "']";}

    // donor blood group value
    public String getBloodGroup() {return "//*[@id='bloodGroupSelect']/..//*[@data-value='" +
            randomValue.getBloodGroup() + "']";}
    public String getSpecificBloodGroup(String bloodGroup) {return "//*[@id='bloodGroupSelect']/..//*[@data-value='" +
            bloodGroup + "']";}

    // donor blood rhesus value
    public String getBloodRhesus() {return "//*[@id='bloodRhesusInput']/..//*[@data-value='" +
            randomValue.getBloodRhesus() + "']";}

    // donor hla value
    public String getHla() {return randomValue.getHla();}

}
