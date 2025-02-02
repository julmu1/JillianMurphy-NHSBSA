package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UniversalCreditPage {

    private WebDriver driver;

    By yesUniversalLocator = By.id("yes-universal");
    By notYetUniversal = By.id("not-yet");
    By differentBenefit = By.id("different-benefit");

    public void selectYesUniversal(){driver.findElement(yesUniversalLocator).click();}
    public void selectNotYetUniversal(){driver.findElement(notYetUniversal).click();}
    public void selectDifferentBenefit(){driver.findElement(differentBenefit).click();}

}
