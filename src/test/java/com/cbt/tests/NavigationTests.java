package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.compress.compressors.brotli.BrotliUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {
     //   testChrome();
     testFirefox();
     //testSafari();

    }

    public static void testChrome() throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        Thread.sleep(2000);
        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);


        driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        String titleEtsy = driver.getTitle();
        System.out.println(titleEtsy);

        driver.navigate().back();
        Thread.sleep(2000);
        StringUtility.verifyEquals(driver.getTitle(), titleGoogle);

        driver.navigate().forward();
        Thread.sleep(2000);
        StringUtility.verifyEquals(driver.getTitle(), titleEtsy);

        driver.quit();
    }

    public static void testFirefox() throws InterruptedException {

        WebDriver driver= BrowserFactory.getDriver("firefox");

        driver.get("https://google.com");
        Thread.sleep(2000);
        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);

        driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        String titleEtsy = driver.getTitle();
        System.out.println(titleEtsy);

        driver.navigate().back();
        Thread.sleep(2000);
        StringUtility.verifyEquals(driver.getTitle(), titleGoogle);

        driver.navigate().forward();
        Thread.sleep(2000);
        StringUtility.verifyEquals(driver.getTitle(), titleEtsy);

        driver.quit();
    }


    public static void testSafari() throws InterruptedException {

        WebDriver driver= BrowserFactory.getDriver("safari");

        driver.get("https://google.com");
        Thread.sleep(2000);
        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);

        driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        String titleEtsy = driver.getTitle();
        System.out.println(titleEtsy);

        driver.navigate().back();
        Thread.sleep(2000);
        StringUtility.verifyEquals(driver.getTitle(), titleGoogle);

        driver.navigate().forward();
        Thread.sleep(2000);
        StringUtility.verifyEquals(driver.getTitle(), titleEtsy);


        driver.quit();
    }


/*
1. Open browser
2.Go to website https://google.com
3. Save the title in a string variable
4. Go to https://etsy.com
5. Save the title in a string variable
6. Navigate back to previous page
7. Verify that title is same is in step 3
8. Navigate forward to previous page
9. Verify that title is same is in step 5

If you are using Mac OS, create test methods for
Chrome,
Firefox,
Safari.
 */


}