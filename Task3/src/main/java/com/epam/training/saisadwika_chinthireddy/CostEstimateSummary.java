package com.epam.training.saisadwika_chinthireddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CostEstimateSummary {
    private WebDriver driver;
    private WebDriverWait wait;


    public CostEstimateSummary (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[normalize-space()='1']")
    private WebElement getNoOfGPU;
    @FindBy(xpath = "//span[normalize-space()='4']")
    private WebElement getNoOfInstances;
    @FindBy(xpath = "//span[normalize-space()='2x375 GB']")
    private WebElement getLocalSSD;
    @FindBy(xpath = "//span[normalize-space()='n1-standard-8, vCPUs: 8, RAM: 30 GB']")
    private WebElement getMachineType;
    @FindBy(xpath = "//span[normalize-space()='4']")
    private WebElement getGetNoOfInstances;
    @FindBy(xpath = "//span[normalize-space()='Free: Debian, CentOS, CoreOS, Ubuntu or BYOL (Bring Your Own License)']")
    private WebElement getOS;
    @FindBy(xpath = "//span[normalize-space()='NVIDIA T4']")
    private WebElement getGPU;
    @FindBy(xpath = "//span[normalize-space()='Frankfurt (europe-west3)']")
    private WebElement getRegion;
    @FindBy(xpath = "//span[normalize-space()='Regular']")
    private WebElement getUsage;

    public String getNoOfGPU() {
        wait.until(ExpectedConditions.visibilityOf(getNoOfGPU));
        System.out.println(getNoOfGPU.getText());
        return getNoOfGPU.getText();
    }
    public String getNoOfInstances(){
        wait.until(ExpectedConditions.visibilityOf(getNoOfInstances));
        System.out.println(getNoOfInstances.getText());
        return getNoOfInstances.getText();
    }
    public String getLocalSSD(){
        wait.until(ExpectedConditions.visibilityOf(getLocalSSD));
        System.out.println(getLocalSSD.getText());
        return getLocalSSD.getText();
    }
    public String getMachineType(){
        wait.until(ExpectedConditions.visibilityOf(getMachineType));
        System.out.println(getMachineType.getText());
        return getMachineType.getText();
    }
    public String getGetNoOfInstances(){
        wait.until(ExpectedConditions.visibilityOf(getGetNoOfInstances));
        System.out.println(getGetNoOfInstances.getText());
        return getGetNoOfInstances.getText();
    }
    public String getOS(){
        wait.until(ExpectedConditions.visibilityOf(getOS));
        System.out.println(getOS.getText());
        return getOS.getText();
    }
    public String getGPU(){
        wait.until(ExpectedConditions.visibilityOf(getGPU));
        System.out.println(getGPU.getText());
        return getGPU.getText();
    }
    public String getRegion(){
        wait.until(ExpectedConditions.visibilityOf(getRegion));
        System.out.println(getRegion.getText());
        return getRegion.getText();
    }
    public String getUsage(){
        wait.until(ExpectedConditions.visibilityOf(getUsage));
        System.out.println(getUsage.getText());
        return getUsage.getText();
    }

}

