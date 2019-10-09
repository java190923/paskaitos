package com.vcs.lects.l13.tests.library;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSeleniumTest {


    @Ignore
    @Test
    public void googleTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/snap/bin/chromium");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://google.com");

        Thread.sleep(1000);

        if (driver.getPageSource().contains("I'm Feeling Lucky")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.quit();

        //WebElement element = driver.findElement(By.className("headline-title"));

        //WebElement link = element.findElement(ByClassName.className("CBarticleTitle"));
        //link.click();
    }

    @Ignore
    @Test
    public void fireFox() throws InterruptedException {
        System.setProperty("webdriver.firefox.marionette", "/usr/local/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "/snap/bin/chromium");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.delfi.lt";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        Thread.sleep(1000);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        driver.close();
    }


}
