package com.epam.training.saisadwika_chinthireddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class PastebinPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public PastebinPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Bash']")
    private WebElement syntaxHighlight;
    @FindBy(className = "expire")
    private WebElement expiresIn;
    @FindBy(xpath = "//h1")
    private WebElement pasteTitle;

    public String getSyntaxHighlighting(){
        wait.until(ExpectedConditions.visibilityOf(syntaxHighlight));
        return syntaxHighlight.getText();
    }
    public String getExpiration(){
        wait.until(ExpectedConditions.visibilityOf(expiresIn));
        return expiresIn.getText();
    }
    public String getTitle(){
        wait.until(ExpectedConditions.visibilityOf(pasteTitle));
        return pasteTitle.getText();
    }
    public String  getContent(){
        List<WebElement> elements = driver.findElements(By.className("de1"));
        String code="";
        for(WebElement ele: elements){
            code+=ele.getText();
        }
        return code;
    }
}


