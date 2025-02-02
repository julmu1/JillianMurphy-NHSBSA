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

    public void selectNextButton(){driver.findElement(nextLocator).click();}
}
