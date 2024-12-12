package com.epam.training.saisadwika_chinthireddy;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task2 {
    private WebDriver driver;
    private WebDriverWait wait;

    public Task2(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="postform-text")
    private WebElement newPaste;
    @FindBy(xpath = "//*[@id=\'w0\']/div[5]/div[1]/div[3]/div/span/span[1]/span/span[2]/b")
    private WebElement syntaxHighlighterExpand;
    @FindBy(xpath = "//li[text()='Bash']")
    private WebElement selectBash;
    @FindBy(xpath = "//*[@id=\'w0\']/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]")
    private WebElement pasteExpButton;
    @FindBy(xpath = "//li[text()=\'10 Minutes\']")
    private WebElement select10Min;
    @FindBy(xpath = "//*[@id=\'postform-name\']")
    private WebElement pasteTitle;
    @FindBy(xpath = "//*[@id=\'w0\']/div[5]/div[1]/div[10]/button")
    private  WebElement createPaste;
    @FindBy(xpath = "//input[@id='q']")
    private WebElement searchBar;

    public void openPage(String url) {
        driver.get(url);
    }
    public void codeEnter(String code){
        wait.until(ExpectedConditions.visibilityOf(newPaste));
        newPaste.sendKeys(code);
    }
    public void expandSyntaxHighlighting(){
        wait.until(ExpectedConditions.visibilityOf(syntaxHighlighterExpand));
        syntaxHighlighterExpand.click();
    }
    public void selectingBash(){
        wait.until(ExpectedConditions.visibilityOf(selectBash));
        selectBash.click();
    }
    public void expandExpiration(){
        wait.until(ExpectedConditions.visibilityOf(pasteExpButton));
        pasteExpButton.click();
    }
    public void selectExpiration(){
        wait.until(ExpectedConditions.visibilityOf(select10Min));
        select10Min.click();
    }
    public void giveTitle(String title){
        wait.until(ExpectedConditions.visibilityOf(pasteTitle));
        pasteTitle.sendKeys(title);
    }
    public void CreatePaste(){
        wait.until(ExpectedConditions.visibilityOf(createPaste));
        createPaste.click();
    }
    public void searchForPaste(String title){
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(title);
        searchBar.sendKeys(Keys.RETURN);
    }
}


