package com.epam.training.saisadwika_chinthireddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenPricingCalculator {
    private WebDriver driver;
    private WebDriverWait wait;
    public OpenPricingCalculator (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Google Cloud Pricing Calculator")
    private WebElement findAnchorLink;


    public void openPricingCalculator() {
        wait.until(ExpectedConditions.visibilityOf(findAnchorLink));
        findAnchorLink.click();
    }

}


