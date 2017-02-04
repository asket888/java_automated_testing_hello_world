package kwl.automate.pages.data.locators;

public interface CalculatorLocator {

    // donor age field locator
    String donorAgeLocator = "//*[@id='donorAgeInput']";

    // donor weigth field locator
    String donorWeigthLocator = "//*[@id='donorWeightInput']";

    // donor sodium level field locator
    String donorSodiumLevelLocator = "//*[@id='donorSodiumLevelInput']";

    // donor anapnotherapy duration field locator
    String donorAnapnotherapyDurationLocator = "//*[@id='donorAnapnotherapyDuration']";

    // donor urea level field locator
    String donorUreaLevelLocator = "//*[@id='donorUreaLevel']";

    // donor systolic pressure field locator
    String donorSystolicPressureLocator = "//*[@id='donorSystolicPressure']";

    // donor diastolic pressure field locator
    String donorDiastolicPressureLocator = "//*[@id='donorDiastolicPressure']";

    // Click calculate button locator
    String calculateButtonLocator = "//*[@id='calculate']";
}
