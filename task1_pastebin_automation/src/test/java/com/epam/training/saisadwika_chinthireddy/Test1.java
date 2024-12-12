package com.epam.training.saisadwika_chinthireddy;

import com.epam.training.saisadwika_chinthireddy.Task1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {
    private WebDriver driver;
    private Task1 go;

    @BeforeEach
    public void setUp() {
        driver = new EdgeDriver();
        go = new Task1(driver);
        go.openHomePage();
    }

    @Test
    public void testNewPaste() {
        go.startPaste("Hello from WebDriver", "helloweb");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) {
        Test1 tp = new Test1();
        tp.setUp();
        tp.testNewPaste();
        tp.tearDown();
    }
}

