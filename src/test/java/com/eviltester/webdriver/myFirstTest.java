package com.eviltester.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;


/**
 * Created by David on 27/03/2015.
 */
public class myFirstTest {

    @Test

    public void startWebDriver()
    {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.conxjobs.com");
        assertTrue(driver.getTitle().startsWith("Find Construction Jobs"));



        driver.close();
        driver.quit();

    }
}
