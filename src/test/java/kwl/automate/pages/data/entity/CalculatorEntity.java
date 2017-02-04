package kwl.automate.pages.data.entity;

import kwl.automate.pages.data.util.MathRandomUtil;

public class CalculatorEntity {

    public CalculatorEntity() {
        setDonorAge();
        setDonorDeath();
        setDonorWeigth();
        setDonorSodiumLevel();
        setDonorAnapnotherapyDuration();
        setDonorUreaLevel();
        setDonorSystolicPressure();
        setDonorDiastolicPressure();
        setRecipientGender();
        setRecipientHasDiabetes();
        setRecipientDialysis();
    }

    private MathRandomUtil mathRandom = new MathRandomUtil();

    // donor age field value
    private String donorAge;
    public void setDonorAge() {this.donorAge = String.valueOf(mathRandom.getMathRandom(59, 13));}
    public String getDonorAge() {return donorAge;}

    // donor death from cardiovascular disease value
    private String donorDeath;
    public void setDonorDeath() {this.donorDeath = "//*[@id='donorDeathFromCVD" + mathRandom.getMathRandom(1, 0) + "']";}
    public String getDonorDeath() {return donorDeath;}

    // donor weigth field value
    private String donorWeigth;
    public void setDonorWeigth() {this.donorWeigth = String.valueOf(mathRandom.getMathRandom(115, 45));}
    public String getDonorWeigth() {return donorWeigth;}

    // donor sodium level field value
    private String donorSodiumLevel;
    public void setDonorSodiumLevel() {this.donorSodiumLevel = String.valueOf(mathRandom.getMathRandom(185, 115));}
    public String getDonorSodiumLevel() {return donorSodiumLevel;}

    // donor anapnotherapy duration field value
    private String donorAnapnotherapyDuration;
    public void setDonorAnapnotherapyDuration() {this.donorAnapnotherapyDuration =
            String.valueOf(mathRandom.getMathRandom(288, 24));}
    public String getDonorAnapnotherapyDuration() {return donorAnapnotherapyDuration;}

    // donor urea level field value
    private String donorUreaLevel;
    public void setDonorUreaLevel() {this.donorUreaLevel = String.valueOf((double)(mathRandom.getMathRandom(145, 14))/10);}
    public String getDonorUreaLevel() {return  donorUreaLevel;}

    // donor systolic pressure field value
    private String donorSystolicPressure;
    public void setDonorSystolicPressure() {this.donorSystolicPressure = String.valueOf(mathRandom.getMathRandom(190, 60));}
    public String getDonorSystolicPressure() {return donorSystolicPressure;}

    // donor diastolic pressure field value
    private String donorDiastolicPressure;
    public void setDonorDiastolicPressure() {this.donorDiastolicPressure = String.valueOf(mathRandom.getMathRandom(100, 30));}
    public String getDonorDiastolicPressure() {return donorDiastolicPressure;}

    // recipient gender ratio value
    private String recipientGender;
    public void setRecipientGender() {this.recipientGender = "//*[@id='recipientGenderRadio" +
            mathRandom.getMathRandom(2, 1) + "']";}
    public String getRecipientGender() {return recipientGender;}

    // recipient diabetes ratio value
    private  String recipientHasDiabetes;
    public void setRecipientHasDiabetes() {this.recipientHasDiabetes = "//*[@id='recipientHasDiabetesRadio" +
            mathRandom.getMathRandom(2, 1) + "']";}
    public String getRecipientHasDiabetes() {return recipientHasDiabetes;}

    // recipient dialysis ratio value
    private String recipientDialysis;
    public void setRecipientDialysis() {this.recipientDialysis = "//*[@id='recipientDialysisRadio" +
            mathRandom.getMathRandom(3, 1) + "']";}
    public String getRecipientDialysis() {return recipientDialysis;}

}
