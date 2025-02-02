package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DentalPracticePage {

    private WebDriver driver;
    WebDriverWait wait;

    By englandLocator = By.id("radio-england");
    By walesLocator = By.id("radio-wales");
    By scotlandLocator = By.id("radio-scotland");
    By nIreLocator = By.id("radio-nire");
    By nextLocator = By.id("next-button");
    By notRegistered = By.id("radio-not-registered");

    public DentalPracticePage(WebDriver driver) {this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));}


    public void selectEnglandRadioButton(){driver.findElement(englandLocator).click();}
    public void selectWalesRadioButton(){driver.findElement(walesLocator).click();}
    public void selectScotlandRadioButton(){driver.findElement(scotlandLocator).click();}
    public void selectNireRadioButton(){driver.findElement(nIreLocator).click();}
    public void selectNextButton(){driver.findElement(nextLocator).click();}
    public void selectNotRegisteredButton(){driver.findElement(notRegistered).click();}
}
