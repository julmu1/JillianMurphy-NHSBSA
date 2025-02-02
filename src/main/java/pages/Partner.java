package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Partner {
    WebDriver driver;

    By nextLocator = By.id("next-button");
    By yesLocator = By.id("radio-yes");
    By noLocator = By.id("radio-no");




    public Partner(WebDriver driver) {this.driver = driver;}

    public void selectNextButton(){driver.findElement(nextLocator).click();}
    public void selectRadioYes(){driver.findElement(yesLocator).click();}
    public void selectRadioNo(){driver.findElement(noLocator).click();}
}
