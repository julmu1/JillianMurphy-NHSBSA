package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BenefitsPage {

    private WebDriver driver;

    By taxCreditsLocator = By.id("taxCredit");
    By incSupportLocator = By.id("incSupport");
    By ESALocator = By.id("esa");
    By JSALoctor = By.id("jsa");
    By pensionCredLocator = By.id("penCredit");
    By noToThisLocator = By.id("continue");

    public void selectTaxCredit(){driver.findElement(taxCreditsLocator).click();}
    public void selectIncSupport(){driver.findElement(incSupportLocator).click();}
    public void selectJSA(){driver.findElement(JSALoctor).click();}
    public void selectESALocator(){driver.findElement(ESALocator).click();}

}
