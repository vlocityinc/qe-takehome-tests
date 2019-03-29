package com.vlocity.qe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple ElementFinder.
 */
public class WikipediaTest {

    private WebDriver driver;
    private ElementFinder finder;
    private Logger log = LoggerFactory.getLogger(WikipediaTest.class);

    @BeforeClass
    public void setupChromeDriver() {
        WebDriverManager.chromedriver().version("73.0.3683.68").setup();

        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        finder = new ElementFinder(driver);
    }

    @Test
    public void sloganPresent() {

        String sloganClass = "localized-slogan";
        WebElement slogan = finder.findElement(By.className(sloganClass));

        Assert.assertNotNull(slogan, String.format("Unable to find slogan div by class: %s", sloganClass));

        log.info("Slogan text is {}", slogan.getText());

        Assert.assertEquals(slogan.getText(), "The Free Encyclopedia");
    }

    @AfterClass
    public void closeBrowser() {

        if(driver!=null) {
            driver.close();
        }
    }
}
