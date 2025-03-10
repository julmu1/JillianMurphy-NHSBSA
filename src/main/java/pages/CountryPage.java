package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CountryPage {

    private WebDriver driver;
    WebDriverWait wait;

    By questionHeading = By.id("question-heading");
    By englandLocator = By.id("radio-england");
    By walesLocator = By.id("radio-wales");
    By scotlandLocator = By.id("radio-scotland");
    By nIreLocator = By.id("radio-nire");
    By nextLocator = By.id("next-button");

    public CountryPage(WebDriver driver) {this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));}


    public boolean isQuestionHeadingDisplayed(){

        try {
            return driver.findElement(questionHeading).isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public void selectEnglandRadioButton(){driver.findElement(englandLocator).click();}
    public void selectWalesRadioButton(){driver.findElement(walesLocator).click();}
    public void selectScotlandRadioButton(){driver.findElement(scotlandLocator).click();}
    public void selectNireRadioButton(){driver.findElement(nIreLocator).click();}


    public void selectNextButton(){driver.findElement(nextLocator).click();}
}
