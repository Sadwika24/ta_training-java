package com.epam.training.saisadwika_chinthireddy;

import com.epam.training.saisadwika_chinthireddy.*;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOpenGoogleCloud {

    private static WebDriver driver;
    private static OpenGoogleCloud googleCloud;
    private static OpenPricingCalculator pricingCalculator;
    private static OpeningComputeEngine computeEngine;
    private static ConfigureComputeEngine configureEngine;
    private static CostEstimateSummary estimateSummary;

    private static final String URL = "https://cloud.google.com";
    private static final String SEARCH_QUERY = "Google Cloud Platform Pricing Calculator";
    private static final String SEARCH_BAR_QUERY = "COMPUTE ENGINE";
    private static final String NUMBER_OF_INSTANCES = "4";

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        googleCloud = new OpenGoogleCloud(driver);
        pricingCalculator = new OpenPricingCalculator(driver);
        computeEngine = new OpeningComputeEngine(driver);
        configureEngine = new ConfigureComputeEngine(driver);
        estimateSummary = new CostEstimateSummary(driver);
    }

    @Test
    public void testA_TestOpenPage() {
        googleCloud.openPage(URL);
    }

    @Test
    public void testB_TestSearchFor() {
        googleCloud.searchFor(SEARCH_QUERY);
    }

    @Test
    public void testC_TestOpenPricingCalculator() {
        pricingCalculator.openPricingCalculator();
    }

    @Test
    public void testD_TestAddEstimate() {
        computeEngine.clickAddEstimateButton();
    }

    @Test
    public void testE_TypeInSearchBar() {
        computeEngine.typeInSearchBar(SEARCH_BAR_QUERY);
    }

    @Test
    public void testF_TestClickOnComputeEngine() {
        computeEngine.clickComputeEngine();
    }

    @Test
    public void testG_TestAddInstances() {
        configureEngine.AddInstances(NUMBER_OF_INSTANCES);
    }

    @Test
    public void testH_SelectMachineType() {
        configureEngine.expandMachineType();
        configureEngine.selectMachineType();
    }

    @Test
    public void testI_AddGPU() {
        configureEngine.addGPU();
    }

    @Test
    public void testJ_SelectLocalSSD() {
        configureEngine.expandLocalSSD();
        configureEngine.selectLocalSSD();
    }

    @Test
    public void testK_SelectLocation() {
        configureEngine.expandLocation();
        configureEngine.selectLocation();
    }

    @Test
    public void testL_SelectCommitUsage() {
        configureEngine.selectCommitUsage();
    }

    @Test
    public void testM_TotalCost() {
        System.out.println(configureEngine.getTotalCost());
    }

    @Test
    public void testN_ShareButton() {
        configureEngine.shareButton();
    }

    @Test
    public void testO_Summary() {
        configureEngine.openSummary();
    }

    @Test
    public void testP_VerifySummary() {
        Assert.assertEquals("2x375 GB", estimateSummary.getLocalSSD());
        Assert.assertEquals("1", estimateSummary.getNoOfGPU());
        Assert.assertEquals("Free: Debian, CentOS, CoreOS, Ubuntu or BYOL (Bring Your Own License)", estimateSummary.getOS());
        Assert.assertEquals("NVIDIA T4", estimateSummary.getGPU());
        Assert.assertEquals("Frankfurt (europe-west3)", estimateSummary.getRegion());
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

