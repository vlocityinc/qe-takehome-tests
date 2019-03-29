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
 * This class verifies elements on the wikipedia homepage.
 */
public class WikipediaTest {

    private Logger log = LoggerFactory.getLogger(WikipediaTest.class);

    private WebDriver driver;
    private ElementFinder finder;

    @BeforeClass
    public void setup() {

        /*
            If the following driver version doesn't work with your Chrome version
            see https://sites.google.com/a/chromium.org/chromedriver/downloads
            and update it as needed.
        */

        WebDriverManager.chromedriver().version("73.0.3683.68").setup();
        driver = new ChromeDriver();
        finder = new ElementFinder(driver);
        driver.get("https://www.wikipedia.org/");
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
