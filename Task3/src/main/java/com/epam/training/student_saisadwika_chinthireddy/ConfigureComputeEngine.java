package com.epam.training.saisadwika_chinthireddy;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfigureComputeEngine {
    private WebDriver driver;
    private WebDriverWait wait;


    public ConfigureComputeEngine (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div/span[2]/input")
    private WebElement addInstanceInput;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[1]/div")
    private WebElement expandMachineType;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/ul/li[7]")
    private WebElement selectMachineType;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[21]/div/div/div[1]/div/div/span/div/button/div/span[1]")
    private WebElement addGPU;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[27]/div/div[1]/div/div/div/div[1]/div")
    private WebElement expandLocalSSD;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[27]/div/div[1]/div/div/div/div[2]/ul/li[3]")
    private WebElement selectLocalSSD;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[29]/div/div[1]/div/div/div/div[1]/div")
    private WebElement expandLocation;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[29]/div/div[1]/div/div/div/div[2]/ul/li[11]")
    private WebElement selectLocation;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[31]/div/div/div[2]/div/div/div[2]/label")
    private WebElement commitUsage;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div[3]/div/button/span[3]")
    private WebElement clickAddEstimate;
    @FindBy(xpath = "/html/body/div[8]/div[2]/div/span[2]/button/div")
    private WebElement cancelClickEstimate;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/label")
    private WebElement totalCost;
    @FindBy(xpath = "/html/body/c-wiz[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div[5]/div[2]/div[2]/div/button/span[6]")
    private WebElement shareButton;
    @FindBy(linkText = "Open estimate summary")
    public WebElement openSummary;




    public void AddInstances(String instances) {
        wait.until(ExpectedConditions.visibilityOf(addInstanceInput));
        addInstanceInput.clear();
        addInstanceInput.sendKeys(instances);
    }
    public void expandMachineType(){
        wait.until(ExpectedConditions.elementToBeClickable(expandMachineType));
        expandMachineType.click();
    }
    public void selectMachineType(){
        wait.until(ExpectedConditions.elementToBeClickable(selectMachineType));
        selectMachineType.click();
    }
    public void addGPU(){
        wait.until(ExpectedConditions.elementToBeClickable(addGPU));
        addGPU.click();
    }
    public void expandLocalSSD(){
        wait.until(ExpectedConditions.elementToBeClickable(expandLocalSSD));
        expandLocalSSD.click();
    }
    public void selectLocalSSD(){
        wait.until(ExpectedConditions.elementToBeClickable(selectLocalSSD));
        selectLocalSSD.click();
    }
    public void expandLocation(){
        wait.until(ExpectedConditions.elementToBeClickable(expandLocation));
        expandLocation.click();
    }
    public void selectLocation(){
        wait.until(ExpectedConditions.elementToBeClickable(selectLocation));
        selectLocation.click();
    }
    public void selectCommitUsage(){
        wait.until(ExpectedConditions.elementToBeClickable(commitUsage));
        commitUsage.click();
    }
    public void clickAddEstimate(){
        wait.until(ExpectedConditions.elementToBeClickable(clickAddEstimate));
        clickAddEstimate.click();
    }
    public void cancelClickEstimate(){
        wait.until(ExpectedConditions.elementToBeClickable(cancelClickEstimate));
        cancelClickEstimate.click();
    }
    public String getTotalCost(){
        wait.until(ExpectedConditions.visibilityOf(totalCost));
        return totalCost.getText();
    }
    public void shareButton(){
        wait.until(ExpectedConditions.elementToBeClickable(shareButton));
        shareButton.click();
    }
    public void openSummary() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(openSummary));
            openSummary.click();
        } catch (TimeoutException e) {
            System.out.println("TimeoutException: Element 'openSummary' was not clickable.");
            // Optional: Take a screenshot or log additional details
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

