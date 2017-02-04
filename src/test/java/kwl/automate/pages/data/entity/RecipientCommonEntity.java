package kwl.automate.pages.data.entity;

import kwl.automate.pages.data.util.MathRandomUtil;
import kwl.automate.pages.data.util.RandomValueUtil;

public class RecipientCommonEntity {

    private MathRandomUtil mathRandom = new MathRandomUtil();
    private RandomValueUtil randomValue = new RandomValueUtil();

    // recipient value
    public String getRecipientLastName() {return randomValue.getLastName();}

    // recipient value
    public String getRecipientFirstName() {return randomValue.getFirstName();}

    // recipient value
    public String getRecipientSecondName() {return randomValue.getSecondName();}

    // recipient birth date value
    public String getRecipientBirthDate() {return randomValue.getRandomDate();}

    // patient's disability field value
    public String getDisability() {return "//*[@id='disability']/..//*[@data-value='" +
            mathRandom.getMathRandom(4, 1) + "']";}

    // patient's gender value
    public String getGender() {return "//*[@id='genderRatio" + mathRandom.getMathRandom(2, 1) + "']";}

    // patient's passport number field value
    public String getPassportNum() {return "MP"+ mathRandom.getMathRandom(9999999, 1000000);}

    // patient's passport issuer field value
    public String getPassportIssuer() {return randomValue.getText();}

    // patient's passport issuer date field value
    public String getPassportIssueDate() {return randomValue.getRandomDate();}

    // patient's personal number field value
    public String getPersonalNumber() {return randomValue.getPersonalNumber();}

    // patient's address text field value
    public String getAddressText() {return randomValue.getText();}

    // patient's phone number field value
    public String getPhoneNumber() {return randomValue.getPhoneNumber();}

    // patient's notes field value
    public String getNotes() {return randomValue.getText();}
}
