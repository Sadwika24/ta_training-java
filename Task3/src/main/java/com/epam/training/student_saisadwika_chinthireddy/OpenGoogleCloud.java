package com.epam.training.saisadwika_chinthireddy;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenGoogleCloud {
    private WebDriver driver;
    private WebDriverWait wait;

    public OpenGoogleCloud (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//div/span[@class='DPvwYc'])[1]")
    private WebElement searchBox;

    public void openPage(String url){
        driver.get(url);
    }
    public void searchFor(String query){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", searchBox);
        new Actions(driver).moveToElement(driver.findElement(By
                        .xpath("//span/input[@placeholder='Search']")))
                .sendKeys(query + Keys.ENTER)
                .build()
                .perform();
    }

}

