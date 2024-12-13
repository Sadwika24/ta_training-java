package com.epam.training.saisadwika_chinthireddy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Task1 {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id="postform-text")
    private WebElement newPaste;
    @FindBy(xpath = "//*[@id='w0']/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]")
    private WebElement pasteExp;
    @FindBy(xpath = "//li[text()='10 Minutes']")
    private WebElement select10Min;
    @FindBy(xpath = "//*[@id='postform-name']")
    private WebElement pasteTitle;
    @FindBy(xpath = "//*[@id='w0']/div[5]/div[1]/div[10]/button")
    private  WebElement createPaste;
    @FindBy(xpath = "//*[@id='rvwE0']/div/label/input")
    private WebElement checkHuman;

    public Task1(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }

    public void openHomePage() {
        driver.get("https://pastebin.com/");
    }

    public void startPaste(String content,String title) {
        // Use explicit wait to ensure the element is visible
//        wait.until(ExpectedConditions.visibilityOf(checkHuman));
//        checkHuman.click();
        wait.until(ExpectedConditions.visibilityOf(newPaste));
        newPaste.sendKeys(content);
        pasteExp.click();
        wait.until(ExpectedConditions.visibilityOf(select10Min));
        select10Min.click();
        wait.until(ExpectedConditions.visibilityOf(pasteTitle));
        pasteTitle.sendKeys(title);
        wait.until(ExpectedConditions.visibilityOf(createPaste));
        createPaste.click();
    }


}
