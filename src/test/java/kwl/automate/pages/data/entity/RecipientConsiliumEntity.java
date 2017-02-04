package kwl.automate.pages.data.entity;

import kwl.automate.pages.data.util.CurrentDateUtil;
import kwl.automate.pages.data.util.MathRandomUtil;
import kwl.automate.pages.data.util.RandomValueUtil;

public class RecipientConsiliumEntity {

    public RecipientConsiliumEntity() {
        setConsiliumDate();
        setMedicalIndication();
        setConclusion();
        setRecommended();
        setAdditionalRecommended();
        setSeveralTransplantation();
        setEmergency();
        setComment();
        setConsiliumMember();
    }

    private MathRandomUtil mathRandom = new MathRandomUtil();
    private CurrentDateUtil currentDate = new CurrentDateUtil();
    private RandomValueUtil randomValue = new RandomValueUtil();

    // consilium date field locator and value
    private String consiliumDate;
    public void setConsiliumDate() {this.consiliumDate = currentDate.getCurrentDate();}
    public String getConsiliumDate() {return consiliumDate + "\n";}

    // medical indication field locator and value
    private String medicalIndication;
    public void setMedicalIndication() {this.medicalIndication = "//*[@id='medicalIndication']/..//*[@data-value='" +
            mathRandom.getMathRandom(4, 1) + "']";}
    public String getMedicalIndication() {return medicalIndication;}

    // consilium conclusion field locator and value
    private String conclusion;
    public void setConclusion() {this.conclusion = "//*[@id='conclusion']/..//*[@data-value='" +
            mathRandom.getMathRandom(4, 1) + "']";}
    public String getConclusion() {return conclusion;}
    public String getAcceptedConclusion() {return "//*[@id='conclusion']/..//*[@data-value='3']";}

    // recommended field locator and value
    private String recommended;
    public void setRecommended() {this.recommended = "//*[@id='recommended0']/..//*[@data-value='" +
            mathRandom.getMathRandom(11, 1) + "']";}
    public String getRecommended() {return recommended;}

    // additional recommended field locator and value
    private String additionalRecommended;
    public void setAdditionalRecommended() {this.additionalRecommended = randomValue.getText();}
    public String getAdditionalRecommended() {return additionalRecommended;}

    // several transplantation field locator and value
    private String severalTransplantation;
    public void setSeveralTransplantation() {this.severalTransplantation = "//*[@id='transplants']/..//*[@data-value='" +
                mathRandom.getMathRandom(3, 1) + "']";}
    public String getSeveralTransplantation() {return severalTransplantation;}
    public String getSpecificSeveralTransplantation(String severalTransplantation) {return
            "//*[@id='transplants']/..//*[@data-value='" + severalTransplantation + "']";}

    // emergency field locator and value
    private String emergency;
    public void setEmergency() {this.emergency = "//*[@id='emergency']/..//*[@data-value='" +
            mathRandom.getMathRandom(4, 1) + "']";}
    public String getEmergency() {return emergency;}

    // comment field locator and value
    private String comment;
    public void setComment() {this.comment = randomValue.getText();}
    public String getComment() {return comment;}

    // consilium members locator and value
    private String consiliumMember;
    public void setConsiliumMember() {this.consiliumMember = "//*[@id='signers0']/..//*[@data-value='" +
            mathRandom.getMathRandom(19, 8) + "']";}
    public String getConsiliumMember() {return consiliumMember;}
}
