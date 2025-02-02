package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonPage {

    private WebDriver driver;
    WebDriverWait wait;

    By questionHeading = By.id("question-heading");
    By nextLocator = By.id("next-button");
    By yesLocator = By.id("radio-yes");
    By noLocator = By.id("radio-no");
    By noNIrePage = By.id("result-heading");

    public CommonPage(WebDriver driver) {this.driver = driver;
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


    public void selectNextButton(){driver.findElement(nextLocator).click();}
    public void selectRadioYes(){driver.findElement(yesLocator).click();}
    public void selectRadioNo(){driver.findElement(noLocator).click();}
    public void notNIreIsShown(){driver.findElement(noNIrePage).isDisplayed();}

}
