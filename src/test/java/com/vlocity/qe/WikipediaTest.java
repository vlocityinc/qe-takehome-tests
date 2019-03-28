package com.vlocity.qe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

        Assert.assertEquals(slogan.getText(), "The Free Encyclopedia");
        System.out.println(slogan.getText());
    }

    @AfterClass
    public void closeBrowser() {

        if(driver!=null) {
            driver.close();
        }
    }

}
