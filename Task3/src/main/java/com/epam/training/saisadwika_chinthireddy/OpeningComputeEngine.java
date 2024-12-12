package com.epam.training.saisadwika_chinthireddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpeningComputeEngine {
    private WebDriver driver;
    private WebDriverWait wait;

    public OpeningComputeEngine (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\'ucj-1\']/div/div/div/div/div/div/div/div[2]/div[1]/div/div[3]/div/button")
    private WebElement addEstimateButton;
    @FindBy(xpath = "//input[contains(@class, 'qdOxv-fmcmS-wGMbrd')]")
    private WebElement searchBar;
    @FindBy(xpath = "//div[contains(@class, 'd5NbRd-EScbFb-JIbuQc PtwYlf') and @role='button']")
    private WebElement clickComputeEngine;

    public void clickAddEstimateButton() {
        wait.until(ExpectedConditions.visibilityOf(addEstimateButton));
        addEstimateButton.click();
    }
    public void typeInSearchBar(String searchText) {
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(searchText);
    }
    public void clickComputeEngine() {
        wait.until(ExpectedConditions.visibilityOf(clickComputeEngine));
        clickComputeEngine.click();
    }
}

