package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

       public static WebDriver getDriver(String driver) {

           String os = System.getProperty("os.name").toLowerCase();

           if ((os.contains("windows") && driver.equalsIgnoreCase("safari")) ||
                   (os.contains("mac") && driver.equalsIgnoreCase("edge"))){

               return null;

            }else if(driver.equals("chrome")){
               WebDriverManager.chromedriver().version("79").setup();
               return new ChromeDriver();
           }else if(driver.equals("firefox")){
               WebDriverManager.firefoxdriver().setup();
               return new FirefoxDriver();
           }else if(driver.equals("edge")){
               WebDriverManager.edgedriver().setup();
               return new EdgeDriver();
           }else {
              return new SafariDriver();

           }


}}