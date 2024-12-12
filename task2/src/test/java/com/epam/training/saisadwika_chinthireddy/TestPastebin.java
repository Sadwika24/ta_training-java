package com.epam.training.saisadwika_chinthireddy;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class) // Use JUnit 5's TestMethodOrder
public class TestPastebin {
    private static WebDriver driver;
    private static Task2 pasteBin;
    private static PastebinPage postedPaste;

    private final String CODE = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            " git push origin master --force\n";
    private final String TITLE = "how to gain dominance among developers";
    private final String URL = "https://pastebin.com";

    @BeforeAll
    public static void setUp() {
        driver = new EdgeDriver();
        pasteBin = new Task2(driver);
        postedPaste = new PastebinPage(driver);
    }

    @Test
    public void test0_openPasteBin() {
        pasteBin.openPage(URL);
    }

    @Test
    public void test1_codeEnter() {
        pasteBin.codeEnter(CODE);
    }

    @Test
    public void test2_selectBash() {
        pasteBin.expandSyntaxHighlighting();
        pasteBin.selectingBash();
    }

    @Test
    public void test3_selectExpiration() {
        pasteBin.expandExpiration();
        pasteBin.selectExpiration();
    }

    @Test
    public void test4_giveTitle() {
        pasteBin.giveTitle(TITLE);
    }

    @Test
    public void test5_CreatePaste() {
        pasteBin.CreatePaste();
    }

    @Test
    public void test6_checkPasteTitle() {
        assertEquals(TITLE, postedPaste.getTitle());
    }

    @Test
    public void test7_checkHighlights() {
        assertEquals("Bash", postedPaste.getSyntaxHighlighting());
    }

    @Test
    public void test8_checkExpiration() {
        assertEquals("10 MIN", postedPaste.getExpiration());
    }

    @Test
    public void test9_checkContent() {
        String expectedContent = normalizeString(CODE);
        String actualContent = normalizeString(postedPaste.getContent());
        assertEquals(expectedContent, actualContent);
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private static @NotNull String normalizeString(String input) {
        input = input.replaceAll("\\s+", " ").trim();
        input = input.replaceAll("(?<=\\S)(git)", " $1");
        return input;
    }
}


